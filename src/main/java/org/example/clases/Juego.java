package org.example.clases;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private List<Pregunta> preguntas;
    private Integer aciertos;
    private Integer fallos;

    public Juego(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
        this.fallos = 0;
        this.aciertos = 0;
    }

    public void recibirPregunta()
    {
        ///Metodo que busca un elemento random en la lista
        Integer random = (int) (Math. random() * preguntas.size());
        Pregunta dada = preguntas.get(random);
        String respuesta = dada.mostrarEnunciado(); ///Entra a mostrarresultado, parte logica de las preguntas
        verificarResp(respuesta,random);///Verifico mi respuestas
    }
    ///Acumulo datos
    public void verificarResp(String respuesta,Integer index)
    {
        if(preguntas.get(index).verificarRespuesta(respuesta))
        {
            System.out.println("Respuesta correcta!");
            aciertos++;
        }
        else
        {
            System.out.println("Respuesta incorrecta!");
            fallos++;
        }
    }
    public void iniciarJuego()
    {
        Scanner in = new Scanner(System.in);
        Boolean inGame = true;
        System.out.println("Ingrese nombre");
        String nombre = in.nextLine();
        while(inGame)
        {
            System.out.println("Aciertos: " +aciertos);
            System.out.println("Fallos: " +fallos);
            recibirPregunta();
            System.out.println("Presiona cualquier letra para seguir o N para terminar el juego");
            Character seg = in.next().charAt(0);
            if(seg == 'N' || seg == 'n')
            {
                inGame = false;
            }
        }
       actualizarArchivo(nombre);
    }
    ///2 Metodos para guardar en JSON por si existe o no el archivo
    public void actualizarArchivo(String nombre)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Datos> registros = new ArrayList<>();

        try {
            Datos[] gameArr = objectMapper.readValue(new File("src/main/resources/game.json"), Datos[].class);
            registros.addAll(Arrays.asList(gameArr));
            registros.add(new Datos(aciertos,fallos,nombre));
            String jsonActualizado = objectMapper.writeValueAsString(registros);
            FileWriter fileWriter = new FileWriter("src/main/resources/game.json");
            fileWriter.write(jsonActualizado);
            fileWriter.close();
    }catch(IOException ex) {
            System.out.println("No se han encontrado archivos, se procedera a crear uno.");
            guardarArch(nombre);
        }
    }
    public void guardarArch(String nombre)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Datos> registros = new ArrayList<>();
        try {
            registros.add(new Datos(aciertos,fallos,nombre));
            String jsonActualizado = objectMapper.writeValueAsString(registros);
            FileWriter fileWriter = new FileWriter("src/main/resources/game.json");
            fileWriter.write(jsonActualizado);
            fileWriter.close();
        }catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}

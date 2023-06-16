package org.example.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleChoice extends Pregunta{
    ArrayList<String> opciones;

    public MultipleChoice(String enunciado, String respuestaCorrecta, String opc1,String opc2, String opc3) {
        super(enunciado, respuestaCorrecta);
        this.opciones = new ArrayList<>();
        opciones.add(opc1);
        opciones.add(opc2);
        opciones.add(opc3);
    }
    public void agregarOpcion(String a){
        opciones.add(a);
    }
    public void agregarCorrecta() {
        opciones.add(super.getRespuestaCorrecta());
    }
    ///Excepcion solicitada
    public void verificarNull()
    {
        try
        {
            if(opciones == null)
            {
                throw new NullPointerException();
            }
            else{
                System.out.println("Lista verificada con elementos");
            }
        }catch(RuntimeException a)
        {
            System.out.println(a.getMessage());
        }
    }

    ///Logica del multiple choice
    @Override
    public String mostrarEnunciado() {
        System.out.println(super.getEnunciado());
        Scanner in = new Scanner(System.in);
        int i =0;
        for(String a : opciones)
        {
            System.out.println("Opcion : " + (i+1) +" "+a);
            i++;
        }
        try {
            System.out.println("Escriba la opcion correcta");
            Integer opcion = in.nextInt();
            if (opcion > opciones.size() + 1) {
                throw new IndexOutOfBoundsException("Ingrese una opcion valida");
            }
            opcion = opcion - 1;
            String respuesta = opciones.get(opcion);
            System.out.println(respuesta);
            return respuesta;
        }catch(IndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        return "";
    }

    ///Verifico con un bool la respuesta, metodo usado en la clase juego tambien
    @Override
    public Boolean verificarRespuesta(String answer) {
        return answer.equals(super.getRespuestaCorrecta());
    }
}

package org.example;

import org.example.clases.Juego;
import org.example.clases.MultipleChoice;
import org.example.clases.Pregunta;
import org.example.clases.PreguntaVoF;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
///Lautaro Elian Burgos
///43054858
///Com 4
public class Main {
    public static void main(String[] args) {
        Set<Pregunta> preguntas = new HashSet<>();
        ///Cargamos preguntas en un set
        MultipleChoice a = new MultipleChoice("1+1 vale: ","2","1","2","3");
        PreguntaVoF b = new PreguntaVoF("2+2 vale:","4","3","4");
        Pregunta c = new PreguntaVoF("Estamos en el año: ","2023","2022","2023");
        Pregunta d= new MultipleChoice("Que es el precio sombra?",
                "es el precio de referencia que tendría un bien en condiciones de competencia perfecta",
                "es el precio de referencia que tendría un bien en cualquier condicion",
                "es el precio de referencia que tendría un bien en condiciones de competencia imperfecta",
                "es el precio de referencia que tendría un bien en condiciones de competencia perfecta");

        ///Probamos excepciones creadas
        a.verificarNull();
        b.verificarVoF();
        preguntas.add(a);
        preguntas.add(b);
        preguntas.add(c);
        preguntas.add(d);
        List<Pregunta> parametroJuego = new ArrayList<>(preguntas);
        ///Iniciamos el juego
        Juego jueguito = new Juego(parametroJuego);
        jueguito.iniciarJuego();
    }
}
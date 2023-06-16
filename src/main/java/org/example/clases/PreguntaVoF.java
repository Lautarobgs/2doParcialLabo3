package org.example.clases;

import org.example.clases.excepciones.VerificarException;
import org.example.clases.excepciones.VoFExcp;

import java.util.Scanner;

public class PreguntaVoF extends Pregunta{
    private String opcionFalsa;
    private String opcionVerdadera;

    public PreguntaVoF(String enunciado, String respuestaCorrecta, String opcionFalsa, String opcionVerdadera) {
        super(enunciado, respuestaCorrecta);
        this.opcionFalsa = opcionFalsa;
        this.opcionVerdadera = opcionVerdadera;
    }
    public void verificarVoF(){
        try {
            if (super.getRespuestaCorrecta().equalsIgnoreCase(opcionFalsa) ||
                    super.getRespuestaCorrecta().equalsIgnoreCase(opcionVerdadera)) {
                System.out.println("Respuesta correctamente verificada");
            } else {
                throw new VerificarException("Respuesta no hallada");
            }
        }catch(VerificarException a)
        {
            System.out.println(a.getMessage());
        }
    }
    ///Logica del VoF
    @Override
    public String mostrarEnunciado() {
        int numero = (int) (Math.random() * 2 + 1);
        Scanner in = new Scanner(System.in);
        String muestra;
        if (numero == 1)
        {
            muestra = opcionVerdadera;
        }else{
            muestra = opcionFalsa;
        }
        System.out.println(super.getEnunciado() + muestra);
        System.out.println("Escriba verdadero o falso");
        String estado = in.nextLine();
        try {
            if (estado.equals("verdadero")) {
                return muestra;
            } else if (estado.equals("falso")) {
                if (!verificarRespuesta(muestra)) {
                    return getRespuestaCorrecta();
                } else {
                    return "";
                }
            } else {
                throw new VoFExcp("Ingrese verdadero o falso en minusculas");
            }
        }catch(VoFExcp ex)
        {
            System.out.println(ex.getMessage());
        }
        return "";
    }
    ///Verifico con un bool la respuesta para usarlo luego en Juego
    @Override
    public Boolean verificarRespuesta(String answer) {
        return answer.equals(super.getRespuestaCorrecta());
    }
}

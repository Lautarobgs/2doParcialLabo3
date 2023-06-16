package org.example.clases;

import java.util.Objects;
///Clase abs para declarar las posteriores subclases, posee hashcode y equals para un set en el main, y un metodo abstracto
public abstract class Pregunta{
    private String enunciado;
    private String RespuestaCorrecta;

    public Pregunta(String enunciado, String respuestaCorrecta) {
        this.enunciado = enunciado;
        RespuestaCorrecta = respuestaCorrecta;
    }

    public String getEnunciado() {
        return enunciado;
    }
    public abstract String mostrarEnunciado();
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuestaCorrecta() {
        return RespuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        RespuestaCorrecta = respuestaCorrecta;
    }
    public abstract Boolean verificarRespuesta(String answer);
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pregunta pregunta = (Pregunta) o;
        return Objects.equals(enunciado, pregunta.enunciado) && Objects.equals(RespuestaCorrecta, pregunta.RespuestaCorrecta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enunciado, RespuestaCorrecta);
    }
}

package org.example.clases;
///Clase para guardar dato en un json
public class Datos {
    private int aciertos;
    private int fallos;
    private String nombre;

    public Datos(int aciertos, int fallos, String nombre) {
        this.aciertos = aciertos;
        this.fallos = fallos;
        this.nombre = nombre;
    }
    public Datos() {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }
    @Override
    public String toString() {
        return "Datos{" +
                "aciertos=" + aciertos +
                ", fallos=" + fallos +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

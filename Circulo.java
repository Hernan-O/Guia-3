package Guia3;

import static java.lang.Math.*;

public class Circulo{
    private float radio;

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    public Circulo(){
        this.radio = 1;
        this.color = "Rojo";
    }
    public float calcularArea(float altura){
        float area = (float)(((2*Math.PI)*getRadio()*altura)+2*(getRadio()*getRadio()));
        return area;
    }
    public void mostrarCaracteristicas(){
        System.out.println("El circulo tiene un radio de:"+this.getRadio()+"\nEl circulo es de color: "+this.getColor());
    }
}

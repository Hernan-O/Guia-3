package Guia3;

import static java.lang.Math.*;

public class circulo2 extends Figuras{
    private float radio;

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

    public circulo2(){
        this.radio = 1;
        this.color = "Rojo";
    }
    public float calcularAreaCirculo(){
        return (float) ((float)Math.PI*(this.getRadio()*this.getRadio()));
    }
    public void mostrarCaracteristicas(){
        System.out.println("El circulo tiene un radio de:"+this.getRadio()+"\nEl circulo es de color: "+this.getColor());
    }
}

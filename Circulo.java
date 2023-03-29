package Guia3;

public class Circulo{
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

    public Circulo(){
        this.radio = 1;
        this.color = "Rojo";
    }

    public float calcularArea(){
        float area = (float)((this.radio*this.radio)*(3.14));
        return area;
    }
    public void mostrarCaracteristicas(){
        System.out.println("El circulo tiene un radio de:"+this.getRadio()+"\nEl circulo es de color: "+this.getColor());
    }
}

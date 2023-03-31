package Guia3;

import static java.lang.Math.*;

public class Cilindro extends Circulo{
    private float altura;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Cilindro(){
        altura = 1;
    }
    public float volumen(){
        return (super.calcularArea(this.getAltura()));
    }
    public void mostrarCilindro(){
        System.out.println("El radio del cilindro es:"+this.getRadio()+"\nEl color del cilindro es:"+this.getColor()+"\nLa altura del cilindro es:"+this.getAltura());
    }
    public void subClase(){
        System.out.println("Subclase de: "+ super.toString() +" de Circulo + Altura: "+getAltura());
    }
}

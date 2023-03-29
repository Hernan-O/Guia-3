package Guia3;

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
        float volu =(float)((this.getRadio()*2)*(this.getAltura())*(3.14));
        return volu;
    }
    public void mostrarCilindro(){
        System.out.println("El radio del cilindro es:"+this.getRadio()+"\nEl color del cilindro es:"+this.getColor()+"\nLa altura del cilindro es:"+this.getAltura());
    }
}

package Guia3;

public class Rectangulo extends Figuras{
    float ancho = 1;
    float alto = 1;

    public float getAncho(){
        return alto;
    }
    public float getAlto(){
        return alto;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }
    public float areaRectangulo(float ancho, float alto){
        return ancho*alto;
    }
    public float perimetroRectangulo(float ancho, float alto){
        return super.calcularPerimetro(ancho,alto);
    }
}
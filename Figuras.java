package Guia3;

public abstract class Figuras{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public float calcularArea(float altura, float radio){
        float area = (float)(((2*Math.PI)*radio*altura)+2*(radio*radio));
        return area;
    }
    public float calcularPerimetro(float ancho, float largo){
        float perimetro = (2*largo)+(2*ancho);
        return perimetro;
    }
}

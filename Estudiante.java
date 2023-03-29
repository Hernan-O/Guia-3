package Guia3;

public class Estudiante extends Persona{
    private int anio;
    private int cuota;
    private String carrera;

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setEstudiante(int cuota,String carrera,int anio,int dni,String nombre,String apellido,String email,String direccion){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setAnio(anio);
        this.setDireccion(direccion);
        this.setEmail(email);
        this.setDni(dni);
        this.setCarrera(carrera);
        this.setCuota(cuota);
    }
}

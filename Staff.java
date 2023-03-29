package Guia3;

public class Staff extends Persona{
    private int saldo;
    private String turno;

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public void setStaff(int saldo,String turno,int dni,String nombre,String apellido,String email,String direccion){
        this.setApellido(apellido);
        this.setNombre(nombre);
        this.setTurno(turno);
        this.setDireccion(direccion);
        this.setEmail(email);
        this.setDni(dni);
        this.setSaldo(saldo);
    }
    public int saldoAnual(){
        int anual = this.getSaldo()*12;
        return anual;
    }
}

package Guia3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese ejercicio!");
        Scanner ejer = new Scanner(System.in);
        switch (ejer.nextInt()) {
            case 1 -> ejercicio1();
            case 2 -> ejercicio2();
            case 3 -> ejercicio3();
        }
    }
    public static void ejercicio1(){
        Cilindro cili = new Cilindro();

        cili.setAltura(25);
        cili.setColor("Verde");
        cili.setRadio(5);
        cili.mostrarCilindro();

        float volumen = cili.volumen();
        System.out.println("El volumen del cilindro es:"+volumen);

        cili.subClase();
    }
    public static void ejercicio2(){
        Staff prof2 = new Staff();
        Staff prof1 = new Staff();
        Staff prof4 = new Staff();
        Staff prof3 = new Staff();
        prof1.setStaff(4500,"Mañana",44217944,"Roman","Riquelme","Roman@gmail.com","La bombonera");
        prof2.setStaff(35000,"Mañana",22333980,"Juan","Moreno","Juancito@gmail","Su Casa");
        prof3.setStaff(12000,"Noche",200111333,"Peronito","Peronio","Peronista@gmail.com","En tu corazon");
        prof4.setStaff(1500000,"Noche",10293840,"Rocky","Balboa","Rocki@gmail.com","Bronx");

        Estudiante estu1 = new Estudiante();
        Estudiante estu2 = new Estudiante();
        Estudiante estu3 = new Estudiante();
        Estudiante estu4 = new Estudiante();
        estu1.setEstudiante(4000,"Programacion",2020,44219222,"John","Johnny","Johni@gmail.com","Italia 2222");
        estu2.setEstudiante(4000,"Programacion",2021,31023346,"Pedro","Pascal","Pedro@gmail.com","Romania 1234");
        estu3.setEstudiante(6000,"Organizzzacion de emprezzzas",2021,46023113,"Carla","Toronja","Carlita@gmail.com","Bruselas 5966");
        estu4.setEstudiante(2000,"Ingenieria en todo",2019,38112330,"Melon","Sandia","Fruta@gmail.com","Bolivia 3333");

        Persona[] arreglo = new Persona[8];

        arreglo[0] = estu1;
        arreglo[1] = estu2;
        arreglo[2] = prof3;
        arreglo[3] = prof4;
        arreglo[4] = prof1;
        arreglo[5] = prof2;
        arreglo[6] = estu3;
        arreglo[7] = estu4;

        cuantosProf(arreglo);
        int plata = cuantasCuotas(arreglo);
        System.out.println("La cantidad total de dinero recibida por alumnos es:"+plata);
    }
    public static void cuantosProf(Persona[] arreglo){
        int estudiantes = 0;
        int profesores = 0;
        for(int i = 0;i<8;i++){
            if(arreglo[i] instanceof Estudiante){
                estudiantes++;
            }else{
                profesores++;
            }
        }
        System.out.println("Profesores:"+profesores+"\nEstudiantes:"+estudiantes);
    }
    public static int cuantasCuotas(Persona[] arreglo){
        int total = 0;
        for(int i = 0 ; i<8 ; i++){
            if(arreglo[i] instanceof Estudiante){
                total = total+((Estudiante) arreglo[i]).getCuota();
            }
        }
    return total;
    }
    public static void ejercicio3(){

    }
}

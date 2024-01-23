package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombre;
        String documento;
        Integer edad;
        Integer puntaje;
       Integer costoMatricula;

        Scanner lee= new Scanner(System.in);

        System.out.println("Edad del Estudiante: ");
        edad=lee.nextInt();

        lee.nextLine();

        System.out.println("documento estudiante: ");
        documento=lee.nextLine();

        System.out.println("nombre estudiante: ");
        nombre=lee.nextLine();

        System.out.println("puntaje obtenido: ");
        puntaje= lee.nextInt();


        if (edad>=18) {
            costoMatricula=850000;
            System.out.println("su matricula tine un costo de: " +costoMatricula);

        }else {
            costoMatricula=700000;
            System.out.println("su matricula tine un coto de: " + costoMatricula);
        }
        if (puntaje>=0 && puntaje<=20) {
            System.out.println("le devolveremos el total de su matricula" +costoMatricula);

        } else if (puntaje>20&&puntaje>=60) {
            System.out.println("le devuelvo la mitad de la matricula:" );
            costoMatricula=costoMatricula/2;

        } else if (puntaje>60&& puntaje<=100) {
            System.out.println("felicitaciones entraste a la universidda");
        }else {
            System.out.println("opcion no valida");

        }




    }
}
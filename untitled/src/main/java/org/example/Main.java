package org.example;

import java.util.Scanner;

import static org.example.Estudiante.validarEmail;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Persona persona1 = new Persona();
        // Persona persona2 = new Persona("Paco", "Ruiz", "12345678A", "Alicante","Programador", 'h', 45);

        // persona1.mostrarinfo();
        //persona2.mostrarinfo();

        //System.out.println(persona2.concatenar());

        //System.out.println("La edad de " + persona2.getNombre() + " es " + persona2.getEdad());
        //persona1.setapellido("Sin Nombre");
        //System.out.println(persona1.getApellido());
        //persona1.setNombre("messi");
        //System.out.println(persona1.getNombre());

        //Persona persona3 = new Persona("messi", "Ruiz", "12345678A", "Madrid", "Albañil", 'h', 45);
        //persona3.mostrarinfo();

        // Persona Paciente1  = new Persona("Luis", 35, 'H',90,1.90);

        // Paciente1.mostrarInfo();
        // Persona Paciente2 = new Paciente();
        // Paciente2.ImprimirInfo();


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

//        Scanner teclado = new Scanner(System.in);
//
//        System.out.println("nombre?");
//        String nombre = teclado.next();
//        System.out.println("edad?");
//        int edad = teclado.nextInt();
//        System.out.println("género?");
//        char genero = teclado.next().charAt(0);
//        System.out.println("peso?");
//        double peso = teclado.nextDouble();
//        System.out.println("altura?");
//        double altura = teclado.nextDouble();
//
//        Paciente paciente1 = new Paciente();
//        Paciente paciente2 = new Paciente(nombre,edad,genero);
//        Paciente paciente3 = new Paciente(nombre,edad,genero,peso,altura);
//
//        paciente1.setNombre("Llados");
//        paciente1.setEdad(40);
//        paciente1.setGenero('H');
//        paciente1.setPeso(120);
//        paciente1.setAltura(1.75);
//
//        paciente1.imprimirInfo();
//        paciente2.imprimirInfo();
//        paciente3.imprimirInfo();
//
//        mostrarMensajeIMC(paciente1);
//        mostrarMensajeIMC(paciente2);
//        mostrarMensajeIMC(paciente3);
//
//        mayorEdad(paciente1);
//        mayorEdad(paciente2);
//        mayorEdad(paciente3);
//
//        System.out.println(paciente1);
//
//
//    }
//
//    public static void mostrarMensajeIMC(Paciente paciente){
//
//        int peso = paciente.calcularIMC();
//
//        switch(peso){
//            case Paciente.BAJO_PESO:
//                System.out.println("El paciente " + paciente.getNombre() +  " está por debajo del peso ideal");
//                break;
//            case Paciente.PESO_IDEAL:
//                System.out.println("El paciente " + paciente.getNombre() + " está en su peso ideal");
//                break;
//            case Paciente.SOBREPESO:
//                System.out.println("El paciente " + paciente.getNombre() + " está por encima de su peso ideal");
//                break;
//        }
//
//    }
//
//    public static void mayorEdad(Paciente paciente){
//
//        if(paciente.esMayorDeEdad()){
//            System.out.println("El paciente " + paciente.getNombre() + " es mayor de edad");
//        }else{
//            System.out.println("El paciente " + paciente.getNombre() + " no es mayor de edad --> " + paciente.getEdad());
//        }
//
//    }
//        Estudiante estudiante1 = new Estudiante("Paco");
//        Estudiante estudiante2 = new Estudiante("Paco", "2Eso","noseque@alu.edu.gva.es" );
//
//        if (Estudiante.validarEmail(estudiante2.getEmail())){
//            System.out.println("Email correcto");
//        }else {
//            System.out.println("Email no correcto");
//
//        }
//        Estudiante estudiante1 = new Estudiante("Paco");
//        Estudiante estudiante2 = new Estudiante("Paco","2ºESO","noseque@edu.gva.es");
//
//        System.out.println(estudiante1);
//        System.out.println(estudiante2);
//
//        if(Estudiante.validarEmail(estudiante2.getEmail())){
//            System.out.println("El email es correcto");
//        }else{
//            System.out.println("El email no cumple con el formato");
//        }
//
//        Editorial editorial1 = new Editorial("ANAYA", "ESPAÑA");
//
//        Libro libro1 = new Libro("el principito","quevedo",editorial1);
//        System.out.println(libro1);
//        Libro libro2 = new Libro("tiburon","torres", editorial1);
//        System.out.println(libro2);
//
//        libro1.prestar(estudiante2);
//        System.out.println(libro1);
//        libro1.devolver();


//        Persona persona1 = new Persona("Paco", "Ruiz", "12345678A", "Alicante","Programador", 'h', 45);
//        Equipo equipo1 = new Equipo("Barstra");
//        System.out.println(persona1);
//        System.out.println(equipo1);
//        equipo1.añadir(persona1);
//        System.out.println(equipo1);
//        Persona persona2 = new Persona("Kiko", "Perez", "12345678B", "Alicante","Nulo", 'h', 20);
//        equipo1.añadir(persona2);
//        System.out.println(equipo1);
//        equipo1.borrar(persona1);
//        System.out.println(equipo1);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        Estudiante estudiante1 = new Estudiante("Paco");
        Estudiante estudiante2 = new Estudiante("Paco","2ºESO","noseque@edu.gva.es");

        System.out.println(estudiante1);
        System.out.println(estudiante2);

        if(Estudiante.validarEmail(estudiante2.getEmail())){
            System.out.println("El email es correcto");
        }else{
            System.out.println("El email no cumple con el formato");
        }

        Editorial editorial1 = new Editorial("ANAYA","ESPAÑA");
        System.out.println(editorial1);

        Libro libro1 = new Libro("el principito","quevedo",editorial1);
        System.out.println(libro1);
        System.out.println(editorial1);
        Libro libro2 = new Libro("tiburon","torres", editorial1);
        System.out.println(libro2);
        System.out.println(editorial1);

        System.out.println(Libro.getLibrosDisponibles());
        Prestamo prestamo1 = libro1.prestar(estudiante2);
        System.out.println(prestamo1);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(Libro.getLibrosDisponibles());

        libro1.devolver(estudiante2);
        System.out.println(libro1);
        System.out.println(estudiante2);
        System.out.println(Libro.getLibrosDisponibles());
        libro1.devolver(estudiante2);

        libro1.estaDisponible();





    }
}
package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leerDato = new Scanner(System.in);
        double precioSimple = 1.500;
        double precioDoble = 3.000;
        double precioEspecial = 6.000;
        int cantidadSimple;
        int cantidadDoble;
        int cantidadEspecial;
        String nombreSimple;
        String nombreDoble;
        String nombreEspecial;

        System.out.println("Ingrese el helado");
        nombreSimple= leerDato.nextLine();

        System.out.println("Ingrese el helado ");
        nombreDoble= leerDato.nextLine();

        System.out.println("Ingrese el helado");
        nombreEspecial= leerDato.nextLine();

        System.out.println("Digita cuantos helados simple vendio");
        cantidadSimple= leerDato.nextInt();


        System.out.println("Digita cuantos helados doble vendido");
        cantidadDoble= leerDato.nextInt();

        System.out.println("Digita Cuantos helados Especial vendidos");
        cantidadEspecial= leerDato.nextInt();


        System.out.println();
        double totalEspecial = cantidadEspecial * precioEspecial;
        System.out.println("Total general de ventas del día: $" + totalEspecial);

        double totalSimple = cantidadSimple* precioSimple;
        System.out.println("Total general de ventas del simple: $"+ totalSimple);
        double totalDoble = cantidadDoble * precioDoble;
        System.out.println("Total general de ventas del doble: $" + totalDoble);
        double totalGeneral = totalSimple + totalDoble + totalEspecial;
        System.out.println("Total general de ventas del especial: $" + totalGeneral);


    }
}
package tareacd4;

import banco.CtaCorriente;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta();
    }

    /**
    Muestra los distintos tipos de mensajes que se enseñan a la hora de mostrar el saldo disponible,
    al retirar tinero y cuando ocurre un fallo al darse alguna de las excepciones
    */
    public static void operativa_cuenta() {
        CtaCorriente miCuenta;
        double saldoActual;
        
        //Crea una nueva cuenta
        miCuenta = new CtaCorriente("Koldo García Ábalos","0001-2345-07-1234567890",5000,0);
        saldoActual = miCuenta.getSaldocuenta(); //Obtiene el saldo actual
        System.out.println("El saldo inicial es de "+ saldoActual +" euros");

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");//Pregunta qué cantidad se desea retirar
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);//Intenta retirar la cantidad seleccionada
            System.out.println("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");//Si ocurre algún error en el proceso
        }
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");//Pregunta qué cantidad se desea ingresar
            double importe = entrada.nextDouble();
            miCuenta.ingresar(importe);//Intenta ingresas la cantidad seleccionada
            System.out.println("El saldo actual de su cuenta es "+miCuenta.getSaldocuenta()+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");//Si ocurre algún error en el proceso
        }
    }
}
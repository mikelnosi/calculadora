/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package porMiCuenta;

import java.util.Scanner;

/**
 *
 * @author mikel1
 */
public class calculadorastring {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num2 = 0;//porque esta dentro de un if else tiene que estar declarado,(metodo swich)
        boolean validacion = true;
        boolean seguir = true;

        while (seguir) {

            System.out.print("Introduce el primer número: ");
            double num1 = teclado.nextDouble();

            System.out.print("Introduce la operación (+, -, *, /, resto):, elevacion, raizcuadrada ");
            String operacion = teclado.next();

            if (operacion.equals("raizcuadrada")) {//si es raiz cuadrada la opcion de introducir num 2 te la salta

            } else {//si no es raiz cuadrada u otra cosa te pide mete el num 2
                System.out.print("Introduce el 2º número: ");
                num2 = teclado.nextDouble();
            }
            //equals objetos string y similares

            double resultado = 0;
            boolean operacionValida = true;

            switch (operacion) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: División por cero");
                        operacionValida = false;
                    }
                    break;
                case "5":
                case "resto":
                case "Resto":
                case "REsto":
                case "RESTo":
                case "rESTO":
                    if (num2 != 0) {
                        operacion = "resto";
                        resultado = num1 % num2;
                    } else {
                        System.out.println(" el divisor no puede ser 0");
                    }
                    break;
                case "elevado":
                    resultado = Math.pow(num1, num2);
                    break;
                case "raizcuadrada":
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida");
                    operacionValida = false;
                    break;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
            System.out.println("quieres continuar");
            String continuarBucle = teclado.next();
            if (continuarBucle.equals("si")) {
            } else if (continuarBucle.equals("no")) {
                seguir = false;
            } else {
                seguir = false;
                System.out.println("no has introducido una opcion valida salimos del bucle");
            }
        }//final del bucle while seguir
        System.out.println("gracias por usar la calculadora si quieres donar por paypal");
        teclado.close();
    }

}

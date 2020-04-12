package CalculadoraPB2;
import java.util.Scanner;

public class Calculadora {
	
	 public static void main(String[] args) {
		 
		 int a = 0;
		 int b = 0;
		 Integer opcion = 0;
		 Integer resultado = 0;
		 
		 Scanner teclado = new Scanner(System.in);
		 
		 do {
			 
			 System.out.println("Ingrese su operación: " + "\n" + "\n" + "1 para multiplicar" + "\n" + "2 para dividir" + "\n" + "3 para sumar" + "\n" + "4 para restar" + "\n");
			 
			 try {
				 opcion = teclado.nextInt();
			 }
			 catch (java.util.InputMismatchException exeption) { // Caracter no valido
				 
				 System.out.println("ERROR: Caracter no valido, intente de nuevo" + "\n");
				 opcion = 0;
				 teclado = new Scanner(System.in);
			 }
			 
		 } while(opcion < 1 || opcion > 4);
			 
		 System.out.println("Ingrese el primer numero");
		 a = teclado.nextInt();
		 
		 System.out.println("Ingrese el segundo numero");
		 b = teclado.nextInt();
		 
		 switch (opcion) {
		 
		 	case 1:
		 		resultado = a * b;
		 		break;
		 	
		 	case 2:
		 		resultado = a / b;
		 		break;
		 	
		 	case 3:
		 		resultado = a + b;
		 		break;
		 		
		 	case 4:
		 		resultado = a - b;
		 		break;
		 		
		 	default:
		 		System.out.println("ERROR"); // default no deberia pasar nunca
		 
		 }
		 
		 
		 System.out.println("El resultado es " + resultado.toString());
		 
	 }
}
package casoPracticoUD2;

import java.util.Scanner;

public class calcularIMC {

	public static void main(String[] args) {
		float peso, altura, imc;  //Declaramos las variables que vamos a usar
		boolean bandera1, bandera2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¡Los decimales deben separarse con coma (,) no con punto (.)!"); // Aclaración para avitar errores
		
		System.out.println("Introduce el peso el kg, min 30,0kg max 300,0kg:"); //Solicitamos al usuario el peso
		
		peso = sc.nextFloat(); //Almacenamos el peso
		
		System.out.println("Introduce la altura en m, min 1,30m max 2,00m:"); //Solicitamos al usuario la altura
		
		altura = sc.nextFloat(); //Almacenamos la altura
		
		bandera1 = true;  //Creamos dos banderas para usarlas en dos bucles while
		bandera2 = true;  //Inicializamos en true
		
		if (peso <= 29 || peso >= 301){  //Comprobamos que el peso está en el rango
			bandera1 = false; //Si no está en el rango, cambiamos la bandera a false
		}
		
		if (altura <= 1.29 || altura >= 2.0){ //Repetimos para la altura
			bandera2 = false; 
		}
		
		
		while (bandera1 == false) { //Bucle si el peso no está en el rango
			
			System.out.println ("¡El peso es incorrecto!");
			System.out.println("Vuelve a introducir el peso, min 30kg max 300kg:");
			peso = sc.nextFloat();
				if (peso >= 29 && peso <= 301){ //Comprobamos de nuevo el rago
					bandera1 = true; //Cambiamos valor de bandera para salir del bucle
				}
		}
		
		while (bandera2 == false) { //Repetimos para la altura
			
			System.out.println ("¡La altura es incorrecta!");
			System.out.println("Vuelve a introducir la altura, min 1,30m max 2m:");
			altura = sc.nextFloat();
				if (altura >= 1.29 && altura <= 2.0){
					bandera2 = true;
				}
		}
		
		imc = peso / (altura * altura); //Calculamos IMC
		String resultado; 
		
		if (imc < 18.5) {  //Comprobamos e imprimimos el resultado según los rangos de la tabla
			resultado = "Bajo peso";
			System.out.println("Tu IMC = " + imc);
			System.out.println("El resultado es: " + resultado);		
		
		} else if (imc > 18.5 && imc < 24.9) {
			resultado = "Normal";
			System.out.println("Tu IMC = " + imc);
			System.out.println("El resultado es: " + resultado);
			
		} else if (imc > 25.0 && imc < 29.9) {
			resultado = "Sobrepeso";
			System.out.println("Tu IMC = " + imc);
			System.out.println("El resultado es: " + resultado);
			
		} else {
			resultado = "Obesidad";
			System.out.println("Tu IMC = " + imc);
			System.out.println("El resultado es: " + resultado);
		} sc.close();

	}
}

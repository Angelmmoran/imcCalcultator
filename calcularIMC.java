package casoPracticoUD2;

import java.util.Scanner;

public class calcularIMC {

	public static void main(String[] args) {
		float peso, altura, imc;  
		boolean bandera1, bandera2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¡Los decimales deben separarse con coma (,) no con punto (.)!"); 
		
		System.out.println("Introduce el peso el kg, min 30,0kg max 300,0kg:"); 
		
		peso = sc.nextFloat(); 
		
		System.out.println("Introduce la altura en m, min 1,30m max 2,00m:"); 
		
		altura = sc.nextFloat(); 
		
		bandera1 = true;  
		bandera2 = true;  
		
		if (peso <= 29 || peso >= 301){  
			bandera1 = false; 
		
		if (altura <= 1.29 || altura >= 2.0){ 
			bandera2 = false; 
		}
		
		
		while (bandera1 == false) { 
			
			System.out.println ("¡El peso es incorrecto!");
			System.out.println("Vuelve a introducir el peso, min 30kg max 300kg:");
			peso = sc.nextFloat();
				if (peso >= 29 && peso <= 301){ 
					bandera1 = true; 
				}
		}
		
		while (bandera2 == false) { 
			
			System.out.println ("¡La altura es incorrecta!");
			System.out.println("Vuelve a introducir la altura, min 1,30m max 2m:");
			altura = sc.nextFloat();
				if (altura >= 1.29 && altura <= 2.0){
					bandera2 = true;
				}
		}
		
		imc = peso / (altura * altura); 
		String resultado; 
		
		if (imc < 18.5) {  
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
}

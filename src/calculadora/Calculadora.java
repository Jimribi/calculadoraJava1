package calculadora;

import java.util.Scanner;

class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Introduzca Operacion a realizar");
	        String entradaTeclado = "";
	        double resultado;
	        @SuppressWarnings("resource")
			Scanner entradaEscanner = new Scanner(System.in);
	        entradaTeclado = entradaEscanner.nextLine(); 
	        resultado=operacion(entradaTeclado);
	        System.out.println("El resultado de la operación " + entradaTeclado + " es: " + resultado);
	        
	}

	static double operacion(String cadena) {
		String armaNumero = "";
		String signoOperador = "";
		String operando1 = "";
		String operando2 = "";
    	for (int i = 1; i <= cadena.length(); i++) {

			if (formulas.esNumero(cadena.substring((i - 1), i))) {
				armaNumero = armaNumero + cadena.substring((i - 1), i);
				
			} else {
				if (operando1 == "") {
					operando1 = armaNumero;
					signoOperador = cadena.substring((i - 1), i);
					armaNumero = "";
				} else if (operando2 == "") {
					operando2 = armaNumero;
					operando1 = String.valueOf(ejecutar(Double.parseDouble(operando1), Double.parseDouble(armaNumero),signoOperador));
				    signoOperador = cadena.substring((i - 1), i);
					operando2 = "";
					armaNumero="";
				}
			}
		}
		operando1 = String.valueOf(ejecutar(Double.parseDouble(operando1), Double.parseDouble(armaNumero),signoOperador));
		return Double.parseDouble(operando1);

	}
	
	static double ejecutar(double num1,double num2,String operando)
	{
		switch (operando)
		{
		case "+":
			return formulas.suma(num1, num2);
			
		case "-":
			return formulas.resta(num1, num2);
		case "*":
			return formulas.multiplicacion(num1, num2);
		case "/":
			return formulas.division(num1, num2);
			default:
				return 0;
		}
		 
	 
		
	}
	
   
}


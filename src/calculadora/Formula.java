package calculadora;

public class Formula {

    public Formula() {
    }
	
    static double ejecutar(double num1,double num2,String operando)
	{
		switch (operando)
		{
		case "+":
			return suma(num1, num2);
		case "-":
			return resta(num1, num2);
		case "*":
			return multiplicacion(num1, num2);
		case "/":
			return division(num1, num2);
			default:
				return 0;
		}
	 	
	}
	static double suma(double num1,double num2)
	{
	  return num1+num2;
		}
	
	static double resta(double num1,double num2)
	{
	  return num1-num2;
		}
	
	static double division(double num1,double num2)
	{
	  return num1/num2;
	}
	
	static double multiplicacion(double num1,double num2)
	{
	  return num1*num2;
		}

	static boolean esNumero(String b){
	    	try {
	    		Integer.parseInt(b);
	    		return true;
	    	} catch (NumberFormatException nfe){
	    		return false;
	    	}
	    }
}

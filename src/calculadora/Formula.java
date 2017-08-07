package calculadora;

public class formulas {

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

package co.edu.escuelaing.Calculadora;

public class Calculadora {

	
	public Calculadora() {

	}
	public double realizaOp(String operation, String number)
	{
		double numberAtReturn = 0;
		String log="log";
		String sin="asin";
		String tan="tan";
		System.out.println(operation.equals(log));
		if (operation.equals(log))
		{
			
			numberAtReturn = Math.log10(Double.parseDouble(number));
			System.out.println("Entrro");
			System.out.println(numberAtReturn);
		}
		else if (operation.equals(sin))
		{
			
			numberAtReturn = Math.sin(Double.parseDouble(number));
			System.out.println(numberAtReturn);
		}
		else if (operation.equals(tan))
		{
			
			numberAtReturn = Math.tan(Double.parseDouble(number));
			System.out.println(numberAtReturn);
		}

        return numberAtReturn;
	}


}

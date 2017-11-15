import java.io.*;
public class opbasicas
{
	public static void main(String args[])
	{
		String operacion1, operacion2, operacion3, operacion4, operacion5;
		int i, j;
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader cin=new BufferedReader(x);
		try
		{
			System.out.print("Ingrese el primer numero ");
			i=Integer.parseInt(cin.readLine());
			System.out.print("Ingrese el segundo numero... ");
			j=Integer.parseInt(cin.readLine());
			operacion1 = "\nSuma " + i + " + " + j + " = " + (i+j);
			operacion2 = "\nResta " + i + " - " + j + " = " + (i-j);
			operacion3 = "\nMultiplicacion " + i + " x " + j + " = " + (i*j);
			operacion4 = "\nDivision " + i + " / " + j + " = " + (i/j);
			operacion5 = "\nResiduo " + i + " % " + j + " = " + (i%j);
			System.out.println(operacion1);
			System.out.println(operacion2);
			System.out.println(operacion3);
			System.out.println(operacion4);
			System.out.println(operacion5);
			
		}
		catch(Exception e)
		{
			System.out.println("\nSe produjo un error: "+ e.getMessage());
		}
		finally
		{
			System.out.print("\nPresiona <ENTER> para terminar");
		}		
	}
	
}
import java.io.*;
public class saludo2
{
	public static void main(String args[])
	{
		String nombre, texto;
		int edad;
		InputStreamReader x=new InputStreamReader(System.in);
		java.io.BufferedReader ingreso=new BufferedReader(x);
		try
		{
			System.out.print("Cual es tu nombre... ");
			nombre=ingreso.readLine();
			System.out.print("Cual es tu edad... ");
			edad=Integer.parseInt(ingreso.readLine());
			texto="Hola " + nombre + ", tienes " + edad +" anios\n";
			System.out.println(texto);
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
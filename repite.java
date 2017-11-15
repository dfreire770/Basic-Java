import java.io.*;
public class repite
{
	public static void main(String args[])
	{
		String cadena, texto;
		int n, i;
		InputStreamReader x=new InputStreamReader(System.in);
		BufferedReader cin=new BufferedReader(x);
		try
		{
			System.out.print("Escriba una cadena de caracteres... ");
			cadena = cin.readLine();
			System.out.print("Cuantas veces desea repetir... ");
			n=Integer.parseInt(cin.readLine());
			for(i=0;i<n;i++)
			{
				System.out.println(cadena);
			}
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
import java.io.*;
public class npalabras {

    public static void main (String[] args)
    {
		InputStreamReader x = new InputStreamReader(System.in);
		BufferedReader cin = new BufferedReader(x);
		String cad;
		String [] arr;
		int nwords;
		try
		{
			System.out.print("Ingrese una cadena de caracteres... ");
			cad = cin.readLine(); 
			arr = cad.split(" ");
			nwords = arr.length;
			System.out.print("El numero de palabras en la cadena es: " + nwords);
		}
		catch(Exception e)
		{
			System.out.print("Se produjo un error" + e.getMessage());
		}
    }
    
    
}
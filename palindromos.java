import java.io.*;
public class palindromos
	{
    public static String invertirPalabras(String cad)
    {
    	cad += " ";
    	String palabra = "";
    	String nuevaCadena = "";
    	for (int i = 0; i < cad.length(); i++)
    	{
       		palabra = cad.charAt(i) + palabra;
        	if (cad.charAt(i) == ' ')
        	{
            	nuevaCadena += palabra;
            	palabra = "";
        	}
    	}
    	return nuevaCadena.trim();
	}   
    public static void main(String[] args)
    {
    	InputStreamReader x = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader (x);
    	String cad, cad1;
    	try
    	{
    		System.out.print("Ingrese una palabra... ");
    		cad = cin.readLine();
    		cad1 = invertirPalabras(cad);
    		if(cad.equals(cad1))
    		{
    			System.out.print("Es palindromo " + cad + " = " + cad1);
    		}
    		else
    		{
    			System.out.print("No es palindromo " + cad + " != " + cad1);
    		}
    	}
    	catch(Exception e)
    	{}
    }
}
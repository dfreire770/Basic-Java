import java.io.*;
public class contar {

    public static int contar(String cad1, String cad2) 
    {
    	boolean bool = false;
    	int n=0, i;
    	for(i=0;i<=cad1.length();i++)
    	{
    		cad2 = cad1.StringAt(i);
       	}
    	return n;
    }
    public static void main (String[] args)
    {
    	int nveces;
    	InputStreamReader x = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader(x);
    	String cad1, cad2;
    	try
    	{
    	   	System.out.print("Ingrese una cadena de caracteres... ");
    		cad1 = cin.readLine();
    		System.out.print("Que letra o palabra desea contar? ");
    		cad2 = cin.readLine();
    		nveces = contar (cad1, cad2);
    		System.out.print("Se repite en " + nveces);   	
    	}
    	catch(Exception e)
    	{
    		System.out.print("Se ha producido un error: " + e.getMessage());
    	}
    }
    
    
}
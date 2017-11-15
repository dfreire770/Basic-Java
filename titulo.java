import java.io.*;
public class titulo
{
	public static String modotitulo(String cad)
	{
		String cad1 = "";
		String cad2 = cad.toLowerCase();
        int indice = 0;
        int espacio = 0;
        espacio = cad2.indexOf(' ',indice);
        while (espacio >=0) 
        {           	
        	// El primer carácter es en mayúsculas
           	cad1 = cad1 + cad2.substring(indice,indice+1).toUpperCase();
           	// Pegamos el resto hasta el primer punto       
           	cad1 = cad1 + cad2.substring(indice+1,espacio+1);
           	indice = espacio + 1;               
           	espacio = cad2.indexOf(' ',indice);                                                
        }
       	// Incluimos el final de la frase
       	cad1 = cad1 + cad2.substring(indice,indice+1).toUpperCase(); 
       	cad1 = cad1 + cad2.substring(indice+1,cad.length());
        return cad1;
	}
    public static void main (String[] args) 
    {
		InputStreamReader x = new InputStreamReader(System.in);
		BufferedReader cin = new BufferedReader(x);
		String cad, resultado;         
        try
        {
        	System.out.print("Ingrese una cadena de caracteres... ");
        	cad = cin.readLine();
        	resultado = modotitulo(cad);
        	System.out.println(resultado);
    	}
    	catch(Exception e)
    	{
    		System.out.print("Se produjo un error");
    	}
	}
}
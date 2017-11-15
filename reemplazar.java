import java.io.BufferedReader;

import java.io.InputStreamReader;
public class reemplazar 
{
    
    public static String reemplazar(String cad1, String cad2,String cad3, boolean todos)
   	{
    	String resultado=""; // Cadena resultante
    	String cad=cad1;
    	int pos;
    	pos = cad1.indexOf(cad2);
    	while(pos>=0)
    	{
    		resultado+= cad.substring(0,pos);//se copia la primera parte
    		resultado += cad3;//se le agrega la cadena a reemplazar
    		cad=cad.substring(pos+cad2.length()); // en la cad original se quita lo operado
    		if (todos==false)
    			break;//si solo habia que hacer la primera ocurrencia se termina
    		pos= cad.indexOf(cad2);// se calcula otra vez la posicion de cad2 en cad1
    	}
    	resultado+= cad;// se copia el resto
    	return resultado;
    }
    public static void main (String[]args)
    {
    	String c1, c2,c3,c4,modo;
    	BufferedReader ingreso = new BufferedReader(new InputStreamReader(System.in));
    	try
    	{
    		System.out.print("Ingrese cadena 1...");
    		c1=ingreso.readLine();
    		System.out.print("Ingrese cadena 2...");
    		c2=ingreso.readLine();
    		System.out.print("Ingrese cadena 3...");
    		c3=ingreso.readLine();
    		System.out.print("Desea reemplazar todas las ocurrencias (s/n)...");
    		modo=ingreso.readLine();
    		if(modo.equals("s"))
    			c4=reemplazar(c1,c2,c3,true);
    		else
    			c4=reemplazar(c1,c2,c3,false);

    		
			System.out.println("Resultado:" + c4);
    	}
    	catch (Exception e)
    	{}
    }
    	
    		
}

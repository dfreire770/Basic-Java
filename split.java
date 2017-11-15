import java.io.*;
public class split {
    public static String MayorMenor(String cad, boolean bool)
    {
   		String palabra="";
   		String [] arr;
    	int n, y=0, i, j, z=0;	
    	arr = cad.split(" ");
    	n=arr.length;
    	
    	if(bool)
    	{
    		for(j=0;j<n;j++)
    		{
    			y = arr[j].length();	
    			for(i=1;i<n;i++)
   				{
   					if(arr[i].length()>y)
      				{
      					z=i;	
      				}
   				}
	 			palabra = arr[z];
    		}
    	}
    	else
    	{
    		for(j=0;j<n;j++)
    		{
    			y = arr[j].length();
    			for(i=1;i<n;i++)
   				{
   					if(arr[i].length()<y)
      				{
      					z=i;	
      				}
   				}
	 			palabra = arr[z];
    		}
    	}
    	return palabra;
    }
    public static void main (String[] args)
    {
    	InputStreamReader x = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader(x);
    	String cad, des, resultado;//cadena, desicion
    	boolean bool = false;
    	try
    	{
    		System.out.print("Ingrese una cadena de caracteres... ");
    		cad = cin.readLine();
    		System.out.print("Desea ver la mayor (M) o menor (m) palabra?... ");
    		des = cin.readLine();
    		if(des.equals("M"))//la palabra mayor
    		{
    			bool = true;
    		}
    		else if(des.equals("m"))//la palabra menor
    		{
    			bool = false;
    		}
    		resultado = MayorMenor(cad,bool);
    		System.out.print("El resultado es: " + resultado);
    	}
    	catch(Exception ex)
    	{
    		System.out.print("Se produjo un error");
    	}
	}
}

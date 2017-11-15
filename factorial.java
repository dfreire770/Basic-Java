import java.io.*;
public class factorial {

    public static void main (String[] args) 
    {
    	InputStreamReader x = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader(x);
    	int num, i, j;
    	try
    	{
    		System.out.print("Ingrese un numero... ");
    		num = Integer.parseInt(cin.readLine());
    		System.out.print(num + "! = ");
    		for(i=1;i<=num;i++)//Se calculan los factores del n actual
	      	{
   	   			if(num%i==0) //Es Factor
	      		{
   	      			System.out.print(i);
                	if (i<num)
	      	      	System.out.print("*"); //La coma solo se imprime antes del último
   	      			j=*i;
   	      		}
  		    }
  		   
    		System.out.print(" = " + j);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Se produjo un error: " + e.getMessage());
    	}
    }
}
import java.io.*;
public class mayormenor {

    public static void main(String[] args)
    {
    	String tex;
    	int a, i, b, c;
    	int [] arr;
    	arr = new int [100];
    	InputStreamReader x = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader (x);
    	try
    	{
    		System.out.print("Mayor o Menor\n");
    		System.out.print("Cuantos valores va a ingresar?... ");
    		a = Integer.parseInt(cin.readLine());
    		for(i=0;i<a;i++)
    		{
    			System.out.print("Ingrese " + (i+1) + " = ");
    			b = Integer.parseInt(cin.readLine());
    			arr[i]=b;
    		}
    		System.out.print("\nDesea ver el mayor (M) o el menor? (m)... ");
    		tex = cin.readLine();
    		if(tex.equals("M"))
    		{
    			c = arr[0];
    			for(i=1;i<a;i++)
    			if(arr[i]>c)
    			{
    				c = arr[i];
    			}
    			System.out.print("El mayor es " + c + "\n");
    		}
    		else if(tex.equals("m"))	
    		{
    			c = arr[0];
    			for(i=1;i<a;i++)
    			if(arr[i]<c)
    			{
    				c = arr[i];
    			}
    			System.out.print("El menor es " + c + "\n");
    		}
    	}
    	catch(Exception e)
    	{}
    }
}
import java.io.*;
public class serie
{
    public static void main (String[] args) 
    {
    	String texto;
    	int n, i;
    	InputStreamReader x = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader(x);
    	try
    	{
    		System.out.print("Serie numerica\n");
    		System.out.print("Ingrese un numero ");
    		n = Integer.parseInt(cin.readLine());
    		for(i=1;i<=n;i++)
    		{
    			System.out.print(i);
    			if(i<n)
    			{
    				System.out.print(",");
    			}
    			else if(i<=n)
    			{
    				System.out.print(" = ");
    			}
    			
    		}
    	System.out.print((i)*n/2);
    	}
    	catch(Exception e)
    	{}
	}
}
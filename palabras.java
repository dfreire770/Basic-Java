import java.io.*;
public class palabras {

    public static void main (String[] args) 
    {
    	InputStreamReader x = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader(x);
    	char a;
    	char[] arr = a.toCharArray();
    	int i;
    	int n = arr.length;
    	try
    	{
    		System.out.print("Vocales y Consonantes\n");
    		System.out.print("Ingrese una palabra... ");
    		a = cin.readLine();
    		for(i=0;i<n;i++)
    		{
    			a = arr[i];
    			System.out.print(arr[i]);
    		}
    	}
    	catch(Exception e)
    	{}
    }
}
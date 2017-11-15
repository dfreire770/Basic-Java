
import java.io.*;
public class tablamultiplicar {

    public static void main (String[] args) 
    {
    	String texto, cont;
    	int x, i;
    	InputStreamReader y = new InputStreamReader(System.in);
    	BufferedReader cin = new BufferedReader(y);
    	try
    	{
    		do
    		{
    			System.out.print("Tabla de multiplicar");
			System.out.print("\nIngrese un numero para calcular\n");
    			x = Integer.parseInt(cin.readLine());
    			if(x<=0)
    			{
    				texto = "No se puede realizar";
    				System.out.print(texto);
    				break;
    			}
    			else if(x<=12)
    			{
    				for(i=1;i<=12;i++)
    				{
    					System.out.print(i + " * " + x + " = " + (i*x) + "\n");
    				}
    				texto = "Tabla de multiplicar del " + x + "\n";
    				System.out.print(texto);	
    			}
			else
			{
				texto = "No se puede realizar, ingrese un valor menor a 12";
    				System.out.print(texto);
    				break;
			}
    		System.out.print("Otra vez?... ");
    		cont = cin.readLine();
    		}while(cont.equals("s") ||cont.equals("S"));
    	}
    	catch(Exception e)
    	{}
    }
}
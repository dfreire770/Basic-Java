import java.io.*;
public class ncoincidencias {

    public static void main (String[] args) 
    {
    	InputStreamReader x = new InputStreamReader(System.in);
		BufferedReader cin = new BufferedReader(x);
		String cad, cad1;
		boolean bool=false;
		int i, valor=0, j=0;
		try
		{
			System.out.print("Ingrese una cadena de caracteres... ");
			cad = cin.readLine();
			System.out.print("Que palabra o letra desea comprobar?... ");
			cad1 = cin.readLine();
			for(i=0;i<=cad1.length();i++)
			{
				valor = cad.indexOf(cad1, i);
				if (valor!=-1)
				{
					bool = true;
				}				
				if(bool)
				{
					j++;		
				}
			}
			System.out.print(j);
		}
    	catch(Exception ex)
    	{
    		System.out.print("Se produjo un error: " + ex.getMessage());
	  	}
    
    }   
}
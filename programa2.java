public class saludo
{
	public static void main(String args[])
	{
		String nombre, texto;
		int edad;
		java.io.InputStreamReader x=newjava.io.InputStreamReader(System.in);
		java.io.BufferedReader(x) ingreso=newjava.io.BufferedReader(x);
		try
		{
			System.out.print("Cual es tu nombre... ");
			nombre=ingreso.readLine();
			System.out.print("Cual es tu edad... ");
			edad=Integer.parseInt(ingreso.readLine());
			texto="Hola "+nombre+", tienes"+edad.toString()+" años\n";
			System.out.printLn(texto);
			}
		catch(Exception e)
		{
			System.out.printLn("\nPresione <ENTER> para finalizar");
			try
			{
				ingreso.readLine();
				catch(Exception e)
			}
		}
	}
	
}
public class saludo
{
	public static void main(String args[])
	{
		String nombre, texto;
		int edad;
		java.io.InputStreamReader x=new java.io.InputStreamReader(System.in);
		java.io.BufferedReader ingreso=new java.io.BufferedReader(x);
		try
		{
			System.out.print("Cual es tu nombre... ");
			nombre=ingreso.readLine();
			System.out.print("Cual es tu edad... ");
			edad=Integer.parseInt(ingreso.readLine());
			texto="Hola " + nombre + ", tienes" + edad +" anios\n";
			System.out.println(texto);
		}
		catch(Exception e)
		{
			System.out.println("\nSe produjo un error: "+ e.getMessage());
		}
		finally
		{
			System.out.print("\nPresiona <ENTER> para terminar");
		}
		
	}
	
}
public class genero
{
	public static void main(String args[])
	{
		String texto, gen, hora;
		java.io.InputStreamReader x=new java.io.InputStreamReader(System.in);
		java.io.BufferedReader cin=new java.io.BufferedReader(x);
		try
		{
			System.out.print("Cual es tu genero (masculino = m, femenino = f)?... ");
			gen = cin.readLine();
			System.out.print("Es la mañana(m), tarde(t) o noche(n)?... ");
			hora = cin.readLine();
			if(gen.equals("m"))
			{
				if(hora.equals("m"))
				{
					System.out.print("Buenos dias amigo");
				}
				else if(hora.equals("t"))
				{
					System.out.print("Buenas tardes amigo");
				}
				else if(hora.equals("n"))
				{
					System.out.print("Buenas noches amigo");
				}
			}
			if(gen.equals("f"))
			{
				if(hora.equals("m"))
				{
					System.out.print("Buenos dias amiga");
				}
				else if(hora.equals("t"))
				{
					System.out.print("Buenas tardes amiga");
				}
				else if(hora.equals("n"))
				{
					System.out.print("Buenas noches amiga");
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("\nSe produjo un error: "+ e.getMessage());
		}
	}	
}
				
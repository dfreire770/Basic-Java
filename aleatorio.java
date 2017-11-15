import java.io.*;
public class aleatorio {
	public static void main (String [] args) {
		String texto, aviso, cont;
		double num;
		InputStreamReader x = new InputStreamReader(System.in);
		BufferedReader cin = new BufferedReader(x);
		try
		{
			do
			{
				System.out.print("Programa que genera numeros aleatorios");
				num = Math.random()*10000 + 1;
				System.out.print("\n" + num);
				if(num<10)
				{
					texto = "\nUnidades";
					System.out.print(texto);
				}
				else if(num<100)
				{
					texto = "\nDecenas";
					System.out.print(texto);
				}
				else if(num<1000)
				{
					texto = "\nCentenas";
					System.out.print(texto);
				}
				else if(num<10000)
				{
					texto = "\nMillares";
					System.out.print(texto);
				}
				aviso = "\nOtra vez?... ";
				System.out.println(aviso);
				cont = cin.readLine();
			}while(cont.equals("s") ||cont.equals("S"));
		}
		catch(Exception ex)
		{}
		}
}
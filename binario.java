import java.io.*;
public class binario {

  public static void main (String[] args)
  {
  	InputStreamReader x = new InputStreamReader(System.in);
  	BufferedReader cin = new BufferedReader(x);
  	int i,j,num,num2,res, a;
  	int [] x;
  	x = new int [10];
  	System.out.print("Ingrese un numero ");
  	num = Integer.parseInt(cin.readLine());
  	num2 = num;
  	try
  	{
  	 	for(i = 1 ; i <= num ; i++)
  		{
  			num2 = num2 / 2;
      		if(num2.equals(1))
        	break;
  		}
  		for(j = 1 ; j <= i; j++)
  		{
  			res = num % 2;
      		if(res.equals(1))
        	x[j] = 1;
      		else if(res.equals(0))
        	x[j] = 0;
      		num = num / 2;
  		}
  		System.out.print("1");
  		for(j = i ; j > 0 ; j--)
  		{
  			x[j] = a;
  			System.out.print(a);
  		}
  	}
  	catch(Exception e)
  	{}
  }

    
    
    
}
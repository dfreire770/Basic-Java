/**
 * @(#)cuenta_bancaria.java
 *
 * cuenta_bancaria Applet application
 *
 * @author 
 * @version 1.00 2013/8/30
 */
 
import java.awt.*;
import java.applet.*;

class cuenta
{
	private int numero_de_cuenta;
	private String nombre_del_titular;
	private double saldo;
		
	public void set_cuenta(int numero_de_cuenta, String nombre_del_titular, double saldo)
	{
		this.numero_de_cuenta = numero_de_cuenta;
		this.nombre_del_titular = nombre_del_titular;
		this.saldo = saldo;	
	}
	public void ver_datos(Graphics g, int k)
	{
		Font a = new Font("Arial",Font.BOLD,15);
		g.setFont(a);
		g.drawString("Titular: " + nombre_del_titular,10,30 + k);
		g.drawString("Numero de Cuenta: " + numero_de_cuenta,10,70+k);
		g.drawString("Saldo: " + saldo, 10,110+k);
		g.drawString("Interes: " + calcular_interes(),10,150+k);//interes va a calcular el 3% de interes del saldo
	}
	public void depositar(double monto)
	{
		saldo = saldo + monto;
	}
	public boolean retirar(double monto)
	{
		boolean solvencia = true;
		if(monto<=saldo)
			solvencia = true;
		else
			solvencia = false;
		return solvencia;
	}
	public double calcular_interes()
	{
		double interes = (saldo*3)/100;//preguntar si era el 3% del saldo o anual
		return interes;
	}

}

public class cuenta_bancaria extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		cuenta c = new cuenta();
		c.set_cuenta(2191211,"Jose Cuervo",2000);
		c.ver_datos(g,0);
		c.depositar(500);
		c.ver_datos(g,160);
	}
}
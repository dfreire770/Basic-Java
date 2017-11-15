/**
 * @(#)ecuaciones.java
 *
 * ecuaciones Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/8/30
 */
 
import java.awt.*;
import java.applet.*;
import java.lang.Math;

class ecuacion_primer_grado
{
	private double a;
	private double b;
	public void set_ecuacion(double a, double b) 
	{
		this.a = a;
		this.b = b;
	}
	public void ver_datos(Graphics g)
	{
		Font font = new Font("Arial",Font.BOLD,20);
		g.setFont(font);
		g.setColor(Color.black);
		g.drawString("La ecuacion es: y=" + a + "x" + "+" + b,30,150);
		g.drawString("X1 = 0 , X2 = 50 , Y1 = " + (50) + ", Y2 = " + (a*50+b),30,180);
		g.drawString("Grafico de la ecuacion",30,210);
	}
	public void graficar(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.drawLine(150,220+(int)b,150+50,220+(int)(a*50+b));
	}
}
class ecuacion_segundo_grado
{
	private double a;
	private double b;
	private double c;
	public void set_ecuacion(double a, double b, double c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double[] raices(double discriminante)
	{
		double raiz[]=new double[2]; 
		if(discriminante<0)
		{
			raiz[0] = -b;
			raiz[1] = discriminante*-1;
		}
		else
		{
			raiz[0] = (((-b) + Math.sqrt(discriminante))/2*a);
			raiz[1] = (((-b) - Math.sqrt(discriminante))/2*a);
		}
		
		return raiz;
	}
	
	
	public void ver_datos(Graphics g)
	{
		double raiz[]= new double[2];
		double discriminante = (Math.pow(b,2) - 4*a*c);
		raiz=raices(discriminante);
		Font font = new Font("Arial",Font.BOLD,20);
		g.setFont(font);
		g.drawString("La ecuacion es: y=" + a + "x^2" + "+" + b + "x+" + c,400,150);
		if(discriminante<0)
		{
			g.drawString("X1 = " + raiz[0] + " + sqrt(" + raiz[1] + ")i",400,180);
			g.drawString("______________",450,185);
			g.drawString("2(" + a +")",500,210);
			g.drawString("X2 = " + raiz[0] + " - sqrt(" + raiz[1] + ")i",700,180);
			g.drawString("______________",750,185);
			g.drawString("2(" + a +")",800,210);
			g.drawString("Grafico de la ecuacion",400,230);
		}
		else
		{
			g.drawString("X1 = " + raiz[0] + " X2 = " + raiz[1],400,180);
			g.drawString("Grafico de la ecuacion",400,210);
		}	
	}
	public void graficar(Graphics g)
	{
		double x = (-b/(2*a));
		double y =  a*Math.pow(x,2)+b*x+c;//calculo el vertice
		double puntos[] = new double [10];
		int contador=0;
		for(contador=0;contador<puntos.length;contador++)
		{
			puntos[contador] = (a*Math.pow((double)contador,2)+b*contador+c);//voy a calcular los puntos en y
		}
	}

}

public class ecuaciones extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		setBackground(new Color(240, 240, 240));
		ecuacion_primer_grado y = new ecuacion_primer_grado();
		Font font = new Font("Arial",Font.ITALIC,20);
		g.setFont(font);
		g.setColor(Color.red);
		g.drawString("Pontificia Universidad Catolica del Ecuador",400,50);
		g.drawString("Ecuaciones de primer y segundo grado por Diego Freire",350,80);
		y.set_ecuacion(5,7);
		y.ver_datos(g);
		y.graficar(g);
		ecuacion_segundo_grado y2 = new ecuacion_segundo_grado();
		y2.set_ecuacion(1,6,5);
		y2.ver_datos(g);
	}
}
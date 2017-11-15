 /**
 * @(#)figurasgeo.java
 *
 * figurasgeo Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/8/24
 */
 
import java.awt.*;
import java.applet.*;
import java.lang.Math;

class circulo{
	private double radio;
	public void setear(double radio)
	{
		this.radio=radio;
	}
	public double calcular_area()
	{
		return Math.PI*Math.pow(this.radio, 2);
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor del radio es: " + this.radio, 10, 170);
	}
		
	public void graficar(Graphics t)
	{
		t.setColor(Color.green);
		t.fillOval(10,50,70,70);
		t.setColor(Color.black);
	}
}
class triangulo{
	private int base;
	private int altura;
	
	public void setbase(int base)
	{
		this.base=base;
	}
	public void setaltura(int altura)
	{
		this.altura=altura;
	}
	
	
	public double calcular_area()
	{
		return (this.base*this.altura)/2;
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor de la base es: " + this.base, 250, 170);
		t.drawString("El valor de la altura es: " + this.altura, 250, 190);
	}
	public void graficar(Graphics t)
	{
		t.setColor(Color.black);
		t.drawLine(250,130,250+base,130);
		t.drawLine(250,130,250+(base/2),altura);
		t.drawLine(250+(base/2),altura,250+base,130);
		
	}

}
class rombo{
	
	private int diagonal_mayor;
	private int diagonal_menor;
	
	public void set_diagonal_mayor(int diagonal_mayor)
	{
		this.diagonal_mayor=diagonal_mayor;
	}
	
	public void set_diagonal_menor(int diagonal_menor)
	{
		this.diagonal_menor=diagonal_menor;
	}
	public double calcular_area()
	{
		return (this.diagonal_mayor*this.diagonal_menor)/2;
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor de la diagonal mayor es: " + this.diagonal_mayor, 10, 470);
		t.drawString("El valor de la diagonal menor es: " + this.diagonal_menor, 10, 490);
	}
		
	public void graficar(Graphics t)
	{
		t.setColor(Color.black);
		t.drawLine(10,360,(diagonal_menor/2)+10,360-(diagonal_mayor)/2);
		t.drawLine((diagonal_menor/2)+10,360-(diagonal_mayor)/2,diagonal_menor+10,360);
		t.drawLine(diagonal_menor+10,360,(diagonal_menor/2)+10,360+(diagonal_mayor)/2);
		t.drawLine((diagonal_menor/2)+10,360+(diagonal_mayor)/2,10,360);

	}
}

class trapecio{
	
	private int base_mayor;
	private int base_menor;
	private int altura;
	
	public void set_base_mayor(int base_mayor)
	{
		this.base_mayor=base_mayor;
	}
	public void set_base_menor(int base_menor)
	{
		this.base_menor=base_menor;
	}
	
	public void set_altura(int altura)
	{
		this.altura=altura;
	} 	
	public double calcular_area()
	{
		return (this.base_mayor-this.base_menor)/2;
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor de la base mayor es: " + this.base_mayor, 250, 470);
		t.drawString("El valor de la base menor es: " + this.base_menor, 250, 490);
		t.drawString("La altura del trapecio es: " + this.altura,250,510);
	}
		
	public void graficar(Graphics t)
	{
		t.setColor(Color.black);
		t.drawLine(250,400, 250+base_mayor, 400);//me grafica la base mayor
		t.drawLine(250,400,250+(base_mayor-base_menor)/2,400-altura); 
		t.drawLine(250+(base_mayor-base_menor)/2,400-altura,250+(base_mayor-base_menor)/2 + base_menor,400-altura);
		t.drawLine(250+(base_mayor-base_menor)/2 + base_menor,400-altura,250+base_mayor,400);
		
	}
}


public class figurasgeo extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		
		circulo b = new circulo();
		g.drawString("EL CIRCULO",10,40);
		b.setear(10);// se define el tamanio del radio
		b.ver_datos(g);//vemos el tamanio del radio
		g.drawString("El area del circulo es: " + b.calcular_area(), 10, 190 );//vemos el area
		b.graficar(g);//se engarga de dibujar el circulo
		
		triangulo c = new triangulo();
		g.drawString("EL TRIANGULO",250,40);
		c.setbase(100);
		c.setaltura(80);
		c.ver_datos(g);
		g.drawString("El area del triangulo es: " + c.calcular_area(), 250, 210);
		c.graficar(g);
		
		rombo r = new rombo();
		g.drawString("EL ROMBO",10, 300);
		r.set_diagonal_mayor(100);
		r.set_diagonal_menor(80);
		r.ver_datos(g);
		g.drawString("El area del rombo es: " + r.calcular_area(), 10, 450);
		r.graficar(g);
		
		trapecio d = new trapecio();
		g.drawString("EL TRAPECIO",250, 300);
		d.set_base_mayor(100);
		d.set_base_menor(70);
		d.set_altura(30);
		g.drawString("El area del trapecio es: " + d.calcular_area(), 250, 450);
		d.ver_datos(g);
		d.graficar(g);
	}
}
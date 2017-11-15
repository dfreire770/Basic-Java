/**
 * @(#)figuras_gui.java
 *
 * figuras_gui Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/9/9
 */
 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class circulo{
	private double radio;
	public circulo(double radio)
	{
		this.radio=radio;
	}
	public double calcular_area()
	{
		return Math.rint(Math.PI*Math.pow(this.radio, 2));
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor del radio es: " + this.radio, 10, 170);
		t.drawString("El valor de su area es: " + this.calcular_area(),10,190);
	}
		
	public void graficar(Graphics t)
	{
		t.setColor(Color.blue);
		t.fillOval(40,50,(int)radio*10,(int)radio*10);
		t.setColor(Color.black);
	}
}

class triangulo{
	private double base;
	private double altura;
	
	public triangulo(double base, double altura){
		this.base = base;
		this.altura = altura;
	}

	public double calcular_area()
	{
		return (this.base*this.altura)/2;
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor de la base es: " + this.base, 70, 160);
		t.drawString("El valor de la altura es: " + this.altura, 70, 190);
	}
	public void graficar(Graphics t)
	{
		int[] d={150,50 ,250 };
    	int[] l={50, 150, 150};
    	t.setColor(Color.gray);
		t.fillPolygon(d,l,d.length);
	}

}
class rombo{
	
	private int diagonal_mayor;
	private int diagonal_menor;
	
	public rombo(int diagonal_mayor, int diagonal_menor)
	{
		this.diagonal_mayor=diagonal_mayor;
		this.diagonal_menor=diagonal_menor;
	}
 
	public double calcular_area()
	{
		return (this.diagonal_mayor*this.diagonal_menor)/2;
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor de la diagonal mayor es: " + this.diagonal_mayor, 140, 160);
		t.drawString("El valor de la diagonal menor es: " + this.diagonal_menor, 140, 190);
	}
		
	public void graficar(Graphics t)
	{
		t.setColor(Color.black);
		t.drawLine(180,100,(diagonal_menor/2)+180,100-(diagonal_mayor)/2);
		t.drawLine((diagonal_menor/2)+180,100-(diagonal_mayor)/2,diagonal_menor+180,100);
		t.drawLine(diagonal_menor+180,100,(diagonal_menor/2)+180,100+(diagonal_mayor)/2);
		t.drawLine((diagonal_menor/2)+180,100+(diagonal_mayor)/2,180,100);
	}
}

class trapecio{
	
	private int base_mayor;
	private int base_menor;
	private int altura;
	
	public trapecio(int base_mayor, int base_menor, int altura)
	{
		this.base_mayor=base_mayor;
		this.base_menor=base_menor;
		this.altura=altura;
	} 	
	public double calcular_area()
	{
		return (this.base_mayor-this.base_menor)/2;
	}
	public void ver_datos(Graphics t)
	{
		t.drawString("El valor de la base mayor es: " + this.base_mayor, 250, 130);
		t.drawString("El valor de la base menor es: " + this.base_menor, 250, 160);
		t.drawString("La altura del trapecio es: " + this.altura,250,510);
	}
		
	public void graficar(Graphics t)
	{
		t.setColor(Color.black);
		t.drawLine(250,100, 250+base_mayor, 100);//me grafica la base mayor
		t.drawLine(250,100,250+(base_mayor-base_menor)/2,100-altura); 
		t.drawLine(250+(base_mayor-base_menor)/2,100-altura,250+(base_mayor-base_menor)/2 + base_menor,100-altura);
		t.drawLine(250+(base_mayor-base_menor)/2 + base_menor,100-altura,250+base_mayor,100);		
	}
}

public class figuras_gui extends Applet implements ActionListener {
	
	Button btCirculo = new Button ("Circulo");
	Button btTriangulo = new Button ("Triangulo");
	Button btRombo = new Button ("Rombo");	
	Button btTrapecio = new Button("Trapecio");
	public void init() {
		setLayout(null);
		add(btCirculo);
		btCirculo.addActionListener(this);
		add(btTriangulo);
		btTriangulo.addActionListener(this);
		add(btRombo);
		btRombo.addActionListener(this);
		add(btTrapecio);
		btTrapecio.addActionListener(this);
	}
	public void actionPerformed (ActionEvent x){
		if(x.getSource()==btCirculo){
			update(this.getGraphics());
			circulo c = new circulo(10);
			c.graficar(this.getGraphics());
			c.ver_datos(this.getGraphics());
		}
		if(x.getSource()==btTriangulo){
			update(this.getGraphics());
			triangulo t = new triangulo(50,50);
			t.graficar(this.getGraphics());
			t.ver_datos(this.getGraphics());
		}
		if(x.getSource()==btRombo){
			update(this.getGraphics());
			rombo r = new rombo(100,80);
			r.graficar(this.getGraphics());
			r.ver_datos(this.getGraphics());
	}
	if(x.getSource()==btTrapecio){
			update(this.getGraphics());
			trapecio t = new trapecio(100,70,30);
			t.graficar(this.getGraphics());
			t.ver_datos(this.getGraphics());
	}
}
	public void paint(Graphics g) {
		
		setBackground(Color.LIGHT_GRAY);
		btCirculo.setBounds(50,20,50,20);
		btCirculo.setBackground(Color.blue);
		btCirculo.setForeground(Color.cyan);
		btTriangulo.setBounds(125,20,50,20);
		btCirculo.setForeground(Color.gray);
		btRombo.setBounds(200,20,50,20);
		btRombo.setBackground(Color.cyan);
		btRombo.setBackground(Color.green);
		btTrapecio.setBounds(275,20,70,20);
		btTrapecio.setBackground(Color.orange);
		btTrapecio.setForeground(Color.white);
	}
}
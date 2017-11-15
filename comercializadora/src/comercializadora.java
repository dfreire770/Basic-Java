/**
 * @(#)comercializadora.java
 *
 * comercializadora Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/9/7
 */
 
import java.awt.*;
import java.applet.*;

class producto
{
	private String descripcion;
	private String codigo;
	private double precio;
	private int cantidad;
	
	public producto(String descripcion, String codigo, double  precio, int cantidad)
	{
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public int retornar_cantidad()
	{
		int acumular = cantidad;
		return acumular;
	}
	public double retornar_precio()
	{
		double acumular = precio;
		return acumular;
	}
	public String obtener_producto()
	{
		String resultado = descripcion;
		return resultado;
	}
	public String obtener_codigo()
	{
		String resultado = codigo;
		return resultado;
	}
	public void ver_datos(Graphics g,int k)
	{
		g.setColor(Color.gray);
		g.drawString("" + descripcion,50,50+k);
		g.drawString("" + codigo,120,50+k);
		g.drawString("" + precio,190,50+k);
		g.drawString("" + cantidad,260,50+k);
	}
	public void graficar(Graphics g,int k)//esta funcion se encarga de realizar el grafico de barras del saldo
	{
		k+=10;
		g.drawLine(400,250,600,250);
		g.drawLine(400,250,400,50);
		g.setColor(Color.red);
		g.fillRect(400+k,250-cantidad,50,cantidad);
		g.setColor(Color.gray);
		g.drawString("" +cantidad,400+k,250-cantidad);
	}

}	

public class comercializadora extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		int k=0;
		setBackground(new Color(240, 240, 240));
		Font a = new Font("Arial",Font.BOLD,12);
		g.setFont(a);
		producto p[][] = {{new producto("Jabon","12345",1.5,50), new producto("Soda","41258",2.00,30)},{new producto("Colgate","45678",1.50,35), new producto("Atun","45687",2.00,60)}};
		g.drawString("Viveres Pepito",200,10);
		g.setColor(Color.blue);
		g.drawString("Descripcion",50,30);
		g.drawString("Codigo",120,30);
		g.drawString("Precio",190,30);
		g.drawString("Cantidad",260,30);		
		g.drawString("Total del Inventario = " + obtener_total(p),50,200);
		g.drawString("Valor neto del inventario = " + obtener_valor_neto(p)*obtener_total(p),50,230);
		String resultado = buscar(p,"45678");
		g.drawString("El resultado de la busqueda es: " + resultado,50,260);
		for(int i=0;i<=p.length;i++)
		{
			for(int j=0;j<p[i].length;j++)
			{
				p[i][j].ver_datos(g,k+=30);
				p[i][j].graficar(g,k);
				g.setColor(Color.black);
			}
		}
	 }
	 public int obtener_total(producto p[][])
	 {
	 	int acumulador = 0;
	 	double acumulador_precio=0;
	 	for(int i=0;i<p.length;i++)
	 	{
	 		for(int j=0;j<p[i].length;j++)
	 			acumulador += p[i][j].retornar_cantidad();
	 	}
	 	return acumulador;
	 }
	 public double obtener_valor_neto(producto p[][])
	 {
	 	int acumulador = 0;
	 	double acumulador_precio=0;
	 	for(int i=0;i<p.length;i++)
	 	{
	 		for(int j=0;j<p[i].length;j++)
	 			acumulador += p[i][j].retornar_precio();
	 	}
	 	return acumulador;
	 }
	 public String buscar(producto p[][], String codigo)
	 {
	 	String resultado="";
	 	String temporal="";
	 	for(int i=0;i<p.length;i++)
	 	{
	 		for(int j=0;j<p[i].length;j++)
	 		{
	 			temporal = p[i][j].obtener_codigo();
	 			if(temporal==codigo)
	 				resultado = p[i][j].obtener_producto();
	 		}
	 	}
	 	return resultado;
	 }
}
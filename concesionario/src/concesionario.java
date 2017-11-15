/**
 * @(#)concesionario.java
 *
 * concesionario Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/9/7
 */
 
import java.awt.*;
import java.applet.*;

class vehiculos
{
	private String modelo;
	private String marca;
	private String transmicion;
	private String capacidad;
	private double precio;
	
	public vehiculos(String modelo, String marca, String transmicion, String capacidad, double precio)
	{
		this.modelo = modelo;
		this.marca = marca;
		this.transmicion = transmicion;
		this.capacidad = capacidad;
		this.precio = precio;
	}
	public void ver_datos(Graphics g, int k)
	{
		g.setColor(Color.gray);
		g.drawString("" + modelo,50,50+k);
		g.drawString("" + marca ,120,50+k);
		g.drawString("" + transmicion,190,50+k);
		g.drawString("" + capacidad,270,50+k);
		g.drawString("" + precio,370,50+k);
	}
	public void obtener_datos(Graphics g, int k)
	{
		g.setColor(Color.gray);
		g.drawString("" + modelo,450,50+k);
		g.drawString("" + marca ,520,50+k);
		g.drawString("" + transmicion,590,50+k);
		g.drawString("" + capacidad,670,50+k);
		g.drawString("" + precio,750,50+k);
	}
	public String obtener_marca()
	{
		String resultado = marca;
		return resultado;
	}
}

public class concesionario extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		int k=0;
		int l=0;
		int i=0;
		int resultado=0;
		g.setColor(Color.blue);
		g.drawString("Modelo",50,60);
		g.drawString("Marca",120,60);
		g.drawString("Transmicion",190,60);
		g.drawString("Capacidad",270,60);
		g.drawString("Precio",370,60);
		vehiculos v[] = {new vehiculos("Vitara","Suzuki","Automatico","5 puertas",25000),
						 new vehiculos("Luv","Izusu","Manual","cabina simple",25500),
						 new vehiculos("Aveo","Chevrolet","Manual","5 puertas",19000),
						 new vehiculos("Cruze","Chevrolet","Automatico","5 puertas",30000),
						 new vehiculos("Sail","Chevrolet","Manual","4 puertas",20000)};
		
		for(i=0;i<v.length;i++)
		{
			v[i].ver_datos(g,k+=30);
		}
		g.drawString("Resultado de la busqueda",450,30);
		buscar(g,"Chevrolet",v);
		g.setColor(Color.blue);
		g.fillArc(150,250,150,150,0,216);
		g.drawString("Chevrolet",310,250);
		g.setColor(Color.red);
		g.fillArc(150,250,150,150,216,72);
		g.drawString("Suzuki",310,280);
		g.setColor(Color.yellow);
		g.fillArc(150,250,150,150,288,72);
		g.drawString("Izusu",310,310);
	}
	public void buscar(Graphics g, String buscar, vehiculos v[])
	{
		int k=0;
		String temporal;
		g.setColor(Color.blue);
		g.drawString("Modelo",450,60);
		g.drawString("Marca",520,60);
		g.drawString("Transmicion",590,60);
		g.drawString("Capacidad",670,60);
		g.drawString("Precio",740,60);
		for(int i=0;i<v.length;i++)
		{
			temporal = v[i].obtener_marca();
			if(temporal.equals(buscar))
			{
				v[i].obtener_datos(g,k+=30);
			}
		}
	}
}

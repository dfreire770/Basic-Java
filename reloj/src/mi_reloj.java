/**
 * @(#)reloj.java
 *
 * reloj Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/8/30
 */
 
import java.awt.*;
import java.applet.*;

class reloj
{
	private int hora;
	private int minutos;
	private int segundos;
	//public mi_reloj(int hora, int minutos, int segundos);
	public void setear(int hora, int minutos, int segundos)
	{
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	public void ver_datos(Graphics g)
	{

		g.drawString(hora + ":" + minutos + ":" + segundos,60,60);
	}
	public void incrementar()
	{
		if(segundos<60)
		{
			segundos++;
			if(segundos==60)
			{
				segundos=0;
				minutos++;
				if(minutos==60)
				{
					minutos=0;
					hora++;
					if(hora==24)
					{
						hora=0;
					}
				}
			}
		}
	}
}

public class mi_reloj extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		
		reloj r = new reloj();
		g.drawString("Hola que hace",150,150);
		r.setear(12,5,40);
		r.ver_datos(g);
		r.incrementar();
		r.ver_datos(g);
		
	}
}
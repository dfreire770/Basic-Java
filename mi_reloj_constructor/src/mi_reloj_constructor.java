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
	public reloj(int hora, int minutos, int segundos)
	{
		this.hora=hora;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	public void ver_datos(Graphics g, int x, int y)
	{
		Font a = new Font("Arial",Font.BOLD,30);
		g.setFont(a);
		g.drawString(hora + ":" + minutos + ":" + segundos,x,y);
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

public class mi_reloj_constructor extends Applet {
	
	public void init() {
	}

	public void paint(Graphics g) {
		reloj r = new reloj(23,59,59);
		r.ver_datos(g,60,60);
		r.incrementar();
		r.ver_datos(g,60,100);
	}
}
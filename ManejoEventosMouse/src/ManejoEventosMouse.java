
import java.applet.Applet;  
import java.awt.*;
import java.awt.event.*;

public class ManejoEventosMouse extends Applet implements MouseListener, MouseMotionListener
{
	public TextArea AreaDeTexto = new TextArea("\t---Manejo de eventos del Mouse---\n");
	public Button boton1 = new Button("Botón 1");
	public Button boton2 = new Button("Botón 2");
	public Button boton3 = new Button("Botón 3");
	public Button boton4 = new Button("Botón 4");
	
	public void init() 
	{
		setLayout(new BorderLayout(30,30));
		add(boton1,"North");
		add(boton2,"West");
		add(boton3,"East");
		add(boton4,"South");
		add(AreaDeTexto);
		boton1.addMouseListener(this);
		boton1.setBackground(Color.blue);
		boton2.addMouseListener(this);
		boton2.setBackground(Color.green);
		boton3.addMouseListener(this);
		boton3.setBackground(Color.green);
		//boton4.addMouseListener(this);
		boton4.setBackground(Color.lightGray);
		AreaDeTexto.setBackground(Color.magenta);
		boton4.addMouseMotionListener(this);
	}
	
	public void mousePressed(MouseEvent e)
	{
		AreaDeTexto.append("Se presionó el botón con el mouse\n");
	}
	
	public void mouseClicked(MouseEvent e)
	{
		AreaDeTexto.append("Se dio click al botón con el mouse\n");
	}
	
	public void mouseReleased(MouseEvent e)
	{
		AreaDeTexto.append("Se soltó el botón con el mouse\n");
	}
	
	public void mouseEntered(MouseEvent e)
	{
		AreaDeTexto.append("Se entró al botón con el mouse\n");
	}
	public void mouseExited(MouseEvent e)
	{
		AreaDeTexto.append("Se salió del boton con el mouse\n");
	}
	
	//manejar el evento cuando se mueve el ratón
		public void mouseDragged(MouseEvent e)
	{
		AreaDeTexto.append("Se arrastró en[" + e.getX() + ", " + e.getY()+ "]\n");
	}
	
	public void mouseMoved(MouseEvent e)
	{
		AreaDeTexto.append("Se movió en[" + e.getX() + ", " + e.getY()+ "]\n");
	}
	
	
	
}
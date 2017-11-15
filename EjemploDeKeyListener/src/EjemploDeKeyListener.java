import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class EjemploDeKeyListener extends Applet implements KeyListener {

	Label titulo = new Label ("KEYLISTENER");
	Label estado = new Label ("El estado de la tecla es:");
	Label t2 = new Label ("La tecla presionada es: ");
	Label res1 = new Label ();
	Label res2 = new Label ();
	TextField escritura = new TextField ();
	Font x;
	public void init() {
		x = new Font ("Comic Sans MS",Font.BOLD,16);
		setLayout(null);
		add (titulo);
		add (estado);
		add (t2);
		add (res1);
		add (res2);
		add (escritura);
		escritura.addKeyListener (this);

	}

	public void paint(Graphics g) {

		this.setBackground(Color.BLACK);
		titulo.setFont(x);
		titulo.setBackground(Color.black);
		titulo.setForeground(Color.green);
		titulo.setBounds(150,20,200,30);

		estado.setBackground(Color.black);
		estado.setForeground(Color.white);
		estado.setBounds(30,60,200,30);

		t2.setBackground(Color.black);
		t2.setForeground(Color.white);
		t2.setBounds(30,90,200,30);

		res1.setBackground(Color.black);
		res1.setForeground(Color.white);
		res1.setBounds(240,60,100,30);

		res2.setBackground(Color.black);
		res2.setForeground(Color.white);
		res2.setBounds(240,90,100,30);

		escritura.setBackground(Color.white);
		escritura.setBounds(30,130,300,30);
	}

	public void keyPressed (KeyEvent k) // Cuando Se ha pulsado una tecla
	{
		res1.setText("Tecla Presionada");
		res2.setText(""+k.getKeyChar());
	}

	public void keyTyped (KeyEvent k) // Se ha tecleado un carácter
	{
		res1.setText("");
		res2.setText(""+k.getKeyChar());
	}

	public void keyReleased (KeyEvent keys) // Cuando Se ha soltado la tecla
	{
		res1.setText("Tecla Liberada");
		res2.setText("");
	}
}

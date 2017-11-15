/**
 * @(#)biblioteca.java
 *
 * biblioteca Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/9/12
 */
 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class libro{
	private String Titulo;
	private String Autor;
	private String Materia;
	private String codigo;
	public libro(String Titulo, String Autor, String Materia, String codigo){
		this.Titulo = Titulo;
		this.Autor = Autor;
		this.Materia = Materia;
		this.codigo = codigo;
	}
	public String obtener_codigo(){
		return codigo;
	}
	public String obtener_Autor(){
		return Autor;
	}
	public String obtener_materia(){
		return Materia;
	}
	public void ver_datos(Graphics g,int k)
	{
		g.drawString(""+Titulo,400,60+k);
		g.drawString(""+Autor,500,60+k);
		g.drawString(""+Materia,600,60+k);
	}
	
}

public class biblioteca extends Applet implements ActionListener{
	
	Label lbbiblioteca = new Label ("Biblioteca");
	Label lbtitulo = new Label ("Titulo");
	Label lbautor = new Label ("Autor");
	Label lbmateria = new Label ("Materia");
	Label lbcodigo = new Label("Codigo");
	Label lbitem = new Label("Objeto de busqueda");
	TextField tftitulo = new TextField();
	TextField tfautor = new TextField();
	TextField tfmateria = new TextField();
	TextField tfcodigo = new TextField();
	TextField tfbuscar = new TextField();
	Button btingresar = new Button("Ingresar");
	Button btbuscar = new Button ("Buscar");
	libro book[] = new libro[7];	
	int i=0;
	int k=0;
	public void init() {
		setLayout(null);
		add(lbbiblioteca);
		add(lbtitulo);
		add(lbautor);
		add(lbmateria);
		add(lbcodigo);
		add(tftitulo);
		add(tfautor);
		add(tfmateria);
		add(tfcodigo);
		add(btingresar);
		add(btbuscar);
		add(tfbuscar);
		add(lbitem);
		btingresar.addActionListener(this);
		btbuscar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent x){
		if(x.getSource()==btingresar)
		{
			//update(this.getGraphics());
			if(i==book.length-1)
				btingresar.enable(false);
			else
				i=i+1;
			book[i]= new libro(tftitulo.getText(),tfautor.getText(),tfmateria.getText(),tfcodigo.getText());
			//this.getGraphics().drawString("Libro Ingresado",300,90);
			this.getGraphics().drawString("Titulo",400,60);
			this.getGraphics().drawString("Autor",500,60);
			this.getGraphics().drawString("Materia",600,60);
			book[i].ver_datos(this.getGraphics(),k+=30);
		}
		if(x.getSource()==btbuscar)
		{
			update(this.getGraphics());
			buscar(book,tfbuscar.getText());
		}
	}
	public void paint(Graphics g) {
		setBackground(Color.getHSBColor(100,0,100));
		lbbiblioteca.setBounds(200,30,70,20);
		lbtitulo.setBounds(10,60,120,20);
		tftitulo.setBounds(140,60,100,20);
		lbautor.setBounds(10,90,120,20);
		tfautor.setBounds(140,90,100,20);
		lbmateria.setBounds(10,120,100,20);
		tfmateria.setBounds(140,120,100,20);
		lbcodigo.setBounds(10,150,100,20);
		tfcodigo.setBounds(140,150,100,20);
		btingresar.setBounds(140,180,50,20);
		lbitem.setBounds(10,210,100,20);
		tfbuscar.setBounds(140,210,100,20);
		btbuscar.setBounds(270,210,50,20);
	}
	public void buscar(libro book[], String item){
		for(i=0;i<book.length;i++)
		{
			if(item.equals(book[i].obtener_Autor()) )
				book[i].ver_datos(this.getGraphics(),k+=30);
		}
	}
}
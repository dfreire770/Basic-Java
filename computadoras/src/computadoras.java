/**
 * @(#)computadoras.java
 *
 * computadoras Applet application
 *
 * @author Diego Freire
 * @version 1.00 2013/9/11
 */
 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

class computadora{
	private String codigo;
	private String memoriaRAM;
	private String disco;
	private String procesador;
	private int cantidad;
	private double precio_unidad;

	public computadora(String codigo, String memoriaRAM, String disco, String procesador, int cantidad, double precio_unidad)
	{
		this.codigo = codigo;
		this.memoriaRAM = memoriaRAM;
		this.disco = disco;
		this.procesador = procesador;
		this.cantidad = cantidad;
		this.precio_unidad = precio_unidad;
	}
	public void ver_datos(Graphics g)
	{
		g.drawString("Codigo: " + this.codigo,300,80);
		g.drawString("Memoria RAM: " + this.memoriaRAM,300,110);
		g.drawString("Disco Duro: " + this.disco,300,140);
		g.drawString("Procesador: " + this.procesador,300,170);
		g.drawString("Cantidad: " + this.cantidad,300,200);
		g.drawString("Precio Unidad: " + this.precio_unidad,300,230);
		
	}
	
	
	public String obtener_codigo()
	{
		return codigo;
	}
	public int obtener_cantidad()
	{
		return cantidad; 
	}
	public double obtener_precio()
	{
		return precio_unidad;
	}
	
	public void graficar(Graphics g,int k)//esta funcion se encarga de realizar el grafico de barras del saldo
	{
		k+=10;
		g.drawLine(400,250,450+k,250);
		g.drawLine(400,250,400,50);
		g.setColor(Color.blue);
		g.fillRect(400+k,250-cantidad,30,cantidad);
		g.setColor(Color.gray);
		g.drawString("" +cantidad,400+k,250-cantidad);
		g.setColor(Color.white);
		g.drawString(""+ codigo,400+k,250);
	}
}


public class computadoras extends Applet implements ActionListener {
	
	Label lbempresa = new Label("CompuMax");
	Label lbcodigo = new Label("Codigo del Producto");
	Label lbmemoriaram = new Label("Memoria Ram");
	Label lbdisco = new Label("Disco Duro");
	Label lbprocesador = new Label ("Procesador");
	Label lbcantidad = new Label("Cantidad");
	Label lbprecio = new Label("Precio Unidad");
	Label lbbuscar = new Label("Buscar por codigo");
	Label lbvalor_inventario = new Label("Valor Inventario");
	TextField tfcodigo = new TextField();
	TextField tfmemoriaram = new TextField();
	TextField tfdisco = new TextField();
	TextField tfprocesador = new TextField();
	TextField tfcantidad = new TextField();
	TextField tfprecio = new TextField();
	TextField codigo_buscar = new TextField();
	TextArea tavalor_inventario = new TextArea();
	Button btingresar = new Button("Ingresar");
	Button btbuscar = new Button("Buscar");
	computadora compu[][] = new computadora[3][3];
	int i=0;
	int j=0;
	int k=0;
	public void init() {
		setLayout(null);
		add(lbempresa);
		add(lbcodigo);
		add(lbmemoriaram);
		add(lbdisco);
		add(lbprocesador);
		add(lbcantidad);
		add(lbprecio);
		add(tfcodigo);
		add(tfmemoriaram);
		add(tfdisco);
		add(tfprocesador);
		add(tfcantidad);
		add(tfprecio);
		add(btbuscar);
		add(btingresar);
		add(lbbuscar);
		add(codigo_buscar);
		add(lbvalor_inventario);
		add(tavalor_inventario);
		btingresar.addActionListener(this);
		btbuscar.addActionListener(this);
		tavalor_inventario.setEditable(false);
	}
	public void actionPerformed(ActionEvent x){
	
		if(x.getSource()==btingresar)
		{
			//update(this.getGraphics());
			if(i==compu.length)
			{	
				i=0;
				if(j==compu.length-1)
					btingresar.enable(false);
				else 
					j=j+1;
			}
			compu[i][j] = new computadora(tfcodigo.getText(),tfmemoriaram.getText(),tfdisco.getText(),tfprocesador.getText(),Integer.parseInt(tfcantidad.getText()),Integer.parseInt(tfprecio.getText()));
			this.getGraphics().drawString("Producto ingresado",10,360);
			compu[i][j].graficar(this.getGraphics(),k);
			k+=50;
			i=i+1;	
			tavalor_inventario.setText("");
			tavalor_inventario.append(""+valor_inventario(compu));
		}
		if(x.getSource()==btbuscar)
		{
			update(this.getGraphics());
			buscar(compu,codigo_buscar.getText());
		}
	}	

	public void paint(Graphics g) {
		
		setBackground(Color.getHSBColor(100,0,100));
		lbempresa.setBounds(200,30,70,20);
		lbempresa.setBackground(Color.LIGHT_GRAY);
		lbempresa.setForeground(Color.cyan);
		lbcodigo.setBounds(10,60,120,20);
		tfcodigo.setBounds(140,60,100,20);
		lbmemoriaram.setBounds(10,90,120,20);
		tfmemoriaram.setBounds(140,90,100,20);
		lbdisco.setBounds(10,120,120,20);
		tfdisco.setBounds(140,120,100,20);
		lbprocesador.setBounds(10,150,120,20);
		tfprocesador.setBounds(140,150,100,20);
		lbcantidad.setBounds(10,180,120,20);
		tfcantidad.setBounds(140,180,120,20);
		lbprecio.setBounds(10,210,120,20);
		tfprecio.setBounds(140,210,100,20);
		btingresar.setBounds(10,240,50,20);
		lbbuscar.setBounds(10,270,120,20);
		codigo_buscar.setBounds(150,270,100,20);
		btbuscar.setBounds(260,270,50,20);
		lbvalor_inventario.setBounds(10,300,120,20);
		tavalor_inventario.setBounds(140,300,100,20);	
	}
	public void buscar(computadora compu[][], String codigo){
	 	for(int i=0;i<compu.length;i++)
	 	{
	 		for(int j=0;j<compu[i].length;j++)
	 		{
	 			if(codigo.equals(compu[i][j].obtener_codigo()))
	 			{
	 				compu[i][j].ver_datos(this.getGraphics());
	 			}
	 		}
	 	}
	}
	public double valor_inventario(computadora compu[][]){
		double acumulador = 0;
	 	for(int i=0;i<compu.length;i++)
	 	{
	 		for(int j=0;j<compu[i].length;j++){
	 			acumulador=compu[i][j].obtener_cantidad()*compu[i][j].obtener_precio()+acumulador;
	 		}		
	 	}
	 	return acumulador;
	}
}
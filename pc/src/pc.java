/**
 * @(#)pc.java
 *
 * pc Applet application
 *
 * @author 
 * @version 1.00 2013/9/12
 */


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
class computadora{

	private String memoriaRAM;
	private int cantidad;

	public computadora(String memoriaRAM, int cantidad)
	{
		this.memoriaRAM = memoriaRAM;
		this.cantidad = cantidad;
	}
	public void ver_datos(Graphics g)
	{
		g.drawString("Memoria RAM: " + this.memoriaRAM,300,110);
		g.drawString("Cantidad: " + this.cantidad,300,200);
	}
}

public class pc extends Applet implements ActionListener {
	Label lbempresa = new Label("CompuMax");
	Label lbcomputadora = new Label("Codigo del Producto");
	Label lbmemoriaram = new Label("Memoria Ram");
	Label lbcantidad = new Label("Cantidad");
	Label lbformadepago = new Label("Forma de pago");
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox ch1Gb = new Checkbox("1Gb",cbg,true);
	Checkbox ch2Gb= new Checkbox("2GB",cbg,false);
	Checkbox ch3Gb= new Checkbox("3GB",cbg,false);
	Checkbox ch4Gb= new Checkbox("4GB",cbg,false);
	TextField tfcantidad = new TextField();
	Button btingresar = new Button("Ingresar");
	Button btbuscar = new Button("Buscar");
	TextArea TAfactura=new TextArea("\tFactura", 50, 120, Scrollbar.HORIZONTAL);
	//TAfactura.setEditable(false);
	public void actionPerformed(ActionEvent x){	
		
		if(x.getSource()==btingresar){
			
		}
		if(x.getSource()==btbuscar){
			
		}
		
		
	}
	public void init() {
		setLayout(null);
		add(lbempresa);
		add(lbcantidad);
		add(tfcantidad);
		add(lbmemoriaram);
		add(TAfactura);
		add(btingresar);
		add(btbuscar);
 		add(ch1Gb);
 		add(ch2Gb);
		add(ch3Gb);
		add(ch4Gb);
	}
	

	public void paint(Graphics g) {
		setBackground(Color.getHSBColor(100,0,100));
		lbempresa.setBounds(200,30,70,20);
		lbempresa.setBackground(Color.LIGHT_GRAY);
		lbempresa.setForeground(Color.cyan);
		lbmemoriaram.setBounds(200,90,120,20);
		lbcantidad.setBounds(10,90,120,20);
		tfcantidad.setBounds(10,120,120,20);
		btingresar.setBounds(10,300,50,20);
		btbuscar.setBounds(80,300,50,20);
		TAfactura.setBounds(350,90,200,200);
		ch1Gb.setBounds(200,120,70,30);
		ch2Gb.setBounds(200,150,70,30);
		ch3Gb.setBounds(200,180,70,30);
		ch4Gb.setBounds(200,210,70,30);
		
		
	}
}
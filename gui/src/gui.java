/**
 * @(#)gui.java
 *
 * gui Applet application
 *
 * @author 
 * @version 1.00 2013/9/9
 */
 
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class gui extends Applet implements ActionListener {
	
	Button btcalcular = new Button("Calcular");	
	Label lbtexto = new Label("texto");
	TextField nombre = new TextField();
	public void init() {
		setLayout(null);
		add(btcalcular);
		add(lbtexto);
		add(nombre);
		btcalcular.addActionListener(this);
	}
	public void actionPerformed(ActionEvent x){
		if(x.getSource()==btcalcular){
			update(this.getGraphics());
			saludo(this.getGraphics());
		}
	}
	
	public void saludo(Graphics g){
		g.drawString("Hola",50,50);
	}
	
	public void paint(Graphics g) {
		btcalcular.setBounds(50,20,50,20);
		btcalcular.setBackground(Color.blue);
		btcalcular.setForeground(Color.cyan);
		lbtexto.setBounds(200,20,200,20);
		
	}
}
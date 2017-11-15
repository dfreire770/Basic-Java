/**
 * @(#)ecuaciones_gui.java
 *
 * ecuaciones_gui Applet application
 *
 * @author 
 * @version 1.00 2013/9/10
 */
 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;


class ecuacion
{
	private double a;
	private double b;
	private Double c;
	public ecuacion(double a,double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public ecuacion(double a,double b){
		this.a=a;
		this.b=b;
	}
	public void calcular_raices(Graphics g){
		if(c==null){
			double x;
			if(a!=0)
				g.drawString("El valor de x es= "+(-b)/a,100,300);
			else if(b==0)
				g.drawString("No hay solucion",100,300);
			else
				g.drawString("a debe ser diferente de 0",100,300);
		}else{
			if(a==0)
				g.drawString("a debe ser diferente de 0",100,300);
			else{
				double discriminante;
				double x1,x2;
				discriminante=(b*b)-(4*a*c);
				if(discriminante>0){
					x1 = (-1 * b + Math.sqrt(discriminante))/(2*a);
    				x2 = (-1 * b - Math.sqrt(discriminante))/(2*a);
    				g.drawString("Tiene 2 raices reales",100,300);
    				g.drawString("x1 = "+x1,100,330);
    				g.drawString("x2 = "+x2,100,360);
				}
				if(discriminante==0){
					x1=(-1 * b + Math.sqrt(discriminante))/(2*a);
					g.drawString("Tiene una raiz real x1= "+x1,100,300);
				}
				if(discriminante<0){
					x1=(-1*b)/(2*a);
					discriminante=(discriminante*-1);
					x2=Math.sqrt(discriminante)/(2*a);
					g.drawString("Tiene 2 raices imaginarias x1= "+x1+" + "+x2+"i",100,300);
					g.drawString("x2= "+x1+" - "+x2+"i",100,330);
				}
			}
		
		}
	}
			
	public void ver_datos(Graphics g){
		if(c==null)
			g.drawString("La ecuación lineal es: ("+a+")x"+" + ("+b+") = 0",100,270);
			
		else
			g.drawString("La ecuación de 2do grado es: ("+a+")x^2 + ("+b+")x + ("+c+") = 0",100,270);
			
		}
	public void graficar(Graphics g){
		int x=-50;
		g.setColor(Color.BLACK);
		g.drawLine(360,210,750,210);
		g.drawLine(550,0,550,420);
		int Coordenadasx[]= new int[100];
		int Coordenadasy[]=new int[100];
					
		if(c==null){
			for(int i=0;i<100;i++){
				Coordenadasx[i]=550+(x*10); 
				Coordenadasy[i]=210-((int)a*x+(int)b)*2;
				x++;
			}
		}
		else				
		for(int i=0;i<100;i++){
			Coordenadasx[i]=550+(x*10); 
			Coordenadasy[i]=210-((int)a*x*x+(int)b*x+c.intValue())*2;
			x++;
		}
		if(c==null)
			g.setColor(Color.GREEN);
		else
			g.setColor(Color.white);
		g.drawPolyline(Coordenadasx,Coordenadasy,100);
		g.setColor(Color.gray);
		g.setColor(Color.BLACK);		
	}
}
public class ecuaciones_gui extends Applet implements ActionListener {
    
    Button btcalcular = new Button("Calcular");
    Button btgraficar = new Button("Graficar");
    Label lbEcuaciones = new Label("Ecuaciones");
    Label lbA = new Label("a");
    Label lbB = new Label("b");
    Label lbC = new Label("c");
    TextField tfa = new TextField();
    TextField tfb = new TextField();
    TextField tfc = new TextField();
        
    public void init(){
        setLayout(null);
        add(lbEcuaciones);
        add(lbA);
        add(lbB);
        add(lbC);
        add(tfa);
        add(tfb);
        add(tfc);
        add(btcalcular);
        add(btgraficar);
        btcalcular.addActionListener(this);
        btgraficar.addActionListener(this);
    }
    public void actionPerformed(ActionEvent x){
        if(x.getSource()==btcalcular){
            update(this.getGraphics());
            ecuacion ec = new ecuacion(Integer.parseInt(tfa.getText()),Integer.parseInt(tfb.getText()),Integer.parseInt(tfc.getText()));
            ec.ver_datos(this.getGraphics());
			ec.calcular_raices(this.getGraphics());
			// ec.graficar(this.getGraphics());
        }
        if(x.getSource()==btgraficar){
        	//update(this.getGraphics());
            ecuacion ec = new ecuacion(Integer.parseInt(tfa.getText()),Integer.parseInt(tfb.getText()),Integer.parseInt(tfc.getText()));
           ec.graficar(this.getGraphics());
        }
    }
    public void paint(Graphics g){
    	setBackground(Color.LIGHT_GRAY);
        lbEcuaciones.setBounds(200,10,70,50);
        lbEcuaciones.setBackground(Color.blue);
        lbEcuaciones.setForeground(Color.white);
        lbA.setBounds(30,100,30,30);
        tfa.setBounds(70,100,100,30);
        lbB.setBounds(30,130,30,30);
        tfb.setBounds(70,130,100,30);
        lbC.setBounds(30,160,30,30);
        tfc.setBounds(70,160,100,30);
        btcalcular.setBounds(70,200,100,30);
        btgraficar.setBounds(200,200,100,30);
    }
}
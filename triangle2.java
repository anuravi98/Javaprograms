import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class triangle2 extends Frame implements Runnable,ActionListener
{Button b;Thread t;int x=0;int y=0;
triangle2()
{super("triangle");
setVisible(true);
setSize(500,500);
b=new Button("start");
add(b);
b.setBounds(50,50,100,100);
b.addActionListener(this);
setLayout(null);
}
public void run(){while(true){
	if(x!=50){x=x+5;
	y=y+10;}
	
	try{Thread.sleep(100);}catch(InterruptedException e){}
	repaint();
	}
}
public void actionPerformed(ActionEvent e){
	if(e.getSource()==b){t=new Thread(this);
	t.start();}
}
public void paint(Graphics g)
{g.drawLine(200,200,250,300);
g.drawLine(250,300,150,300);
g.drawLine(150,300,200,200);
g.drawOval(255-x,300-y,20,20);
}
public static void main(String args[])
{triangle2 t=new triangle2();}
}
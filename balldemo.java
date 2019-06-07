import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="balldemo" height=400 width=400></applet>*/
public class balldemo extends Applet implements ActionListener,Runnable
{Button b1,b2,b3,b4;Thread t;int x;boolean stopf,susf;
public balldemo()
{b1=new Button("start");
b2=new Button("stop");
b3=new Button("resume");
b4=new Button("suspend");
setLayout(null);
add(b1);
b1.setBounds(150,50,50,30);
b1.addActionListener(this);
add(b2);
b2.setBounds(200,50,50,30);
b2.addActionListener(this);add(b3);
b3.setBounds(250,50,50,30);
b3.addActionListener(this);add(b4);
b4.setBounds(300,50,50,30);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{if(e.getSource()==b1)
{stopf=false;susf=false;
t=new Thread(this);
t.start();}
if(e.getSource()==b2)
{x=10;
stopf=true;}
if(e.getSource()==b3)
{myresume();}
if(e.getSource()==b4)
{susf=true;}

}
synchronized void myresume()
{susf=false;
notifyAll();}
public void run()
{synchronized(this){while(!stopf){if(!susf){x=x+10;
if(x==300)
{x=10;}}else{try{
wait();}catch(InterruptedException i){System.out.println(i);}}
repaint();
try{Thread.sleep(100);}catch(InterruptedException e)
{System.out.println(e);}}
}}
public void paint(Graphics g)
{g.drawOval(x,150,100,100);
g.fillOval(x,150,100,100);
}
}
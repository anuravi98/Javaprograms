
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="fandemo" width=800 height=800></applet>*/
public class fandemo extends Applet implements Runnable,ActionListener
{
	int an1=-15,an2=75,an3=165,an4=255;
	Button b1,b2;Thread t;
	boolean stopflag=false;
	boolean minflag=false;
	int x=300,y1=400,y2=500;
	 
public void init()
{b1=new Button("start");
b2=new Button("stop");
  this.setSize(600, 400);
b1.setBounds(220,425,50,10);
b2.setBounds(300,425,50,10);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);}
public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    {  
        t = new Thread(this);
        t.start();
        stopflag=false;
    }else if(e.getSource()==b2) 
    	
    {stopflag=true;
    	t=null;
    	x=300;y1=400;y2=500;
   repaint(); }
    }
       public void paint(Graphics g)
    {

        g.drawOval(200, 50, 150, 150);
        g.fillArc(210, 60, 130, 130, an1, 30);
        g.fillArc(210, 60, 130, 130, an2, 30);
        g.fillArc(210, 60, 130, 130, an3, 30);
         g.fillArc(210, 60, 130, 130, an4, 30);
         g.drawLine(275,200,275,300);
         g.drawRect(200,300,150,50);
         g.drawRect(100,400,200,100);
        g.drawLine(200,400,200,500);
         g.drawLine(200,400,x,y1);
        g.drawLine(x,y1,x,y2);
        g.drawLine(x,y2,200,500);

           }
    public void run() 
    {
        try
        {
            while(!stopflag)
            {
                an1 = (an1 + 15) % 360;
                an2 = (an2 + 15) % 360;
                an3 = (an3 + 15) % 360;
                an4=(an4+15)%360;
                if(!minflag)
                {x=250;y1=350;y2=450;
                	minflag=true;}
            else
            	{x=150;y1=350;y2=450;
            		minflag=false;}
                             repaint();

                Thread.sleep(100);
            }
        }
        catch(InterruptedException ex)
        {
            System.out.println("Problem while putting thread to sleep.");
        }
    }

}

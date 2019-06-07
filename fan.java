
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="fandemo" width=500 height=500></applet>*/
public class fandemo extends Applet implements Runnable
{
	int an1=-35,an2=125,an=205;
	 public fandemo()
    {
        this.setSize(600, 400);
        Thread t = new Thread(this);
        t.start();
    }

       public void paint(Graphics g)
    {
        g.drawOval(200, 150, 150, 150);
        g.fillArc(210, 160, 130, 130, an1, 30);
        g.fillArc(210, 160, 130, 130, an2, 30);
        g.fillArc(210, 160, 130, 130, an3, 30);
           }
    public void run() 
    {
        try
        {
            while(true)
            {
                an1 = (an1 + 1) % 360;
                an2 = (an2 + 1) % 360;
                an3 = (an3 + 1) % 360;
                
                             repaint();

                Thread.sleep(10);
            }
        }
        catch(InterruptedException ex)
        {
            System.out.println("Problem while putting thread to sleep.");
        }
    }

}

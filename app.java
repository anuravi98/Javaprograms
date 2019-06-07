import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="app" width=300 height=300></applet>*/
public class app extends Applet implements ActionListener
{
Button b1;
Button b2;
Button b3;
int i=0;int x=0,y=0,t=500,m,a=0,b=0,c=0;
int a1=250,b11=350,b12=450;
int count=0;
AudioClip au; 
public void init(){b1=new Button("HELICOPTER");b2=new Button("BALLOON");b3=new Button("ROCKET");
add(b1);add(b2);add(b3);setVisible(true);setSize(300,300);setLayout(new FlowLayout());
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{if(e.getSource()==b1)
i=1;
else if(e.getSource()==b2){i=2;}
else if(e.getSource()==b3){i=3;}repaint();
}

public static void main(String args[])
{app a=new app();}
public void paint(Graphics g)
{
if(i==1)
{  g.fillArc(283+b,440-a,200,80,0+x,60);
    g.fillArc(283+b,440-a,200,80,120+x,60);
    g.fillArc(283+b,440-a,200,80,240+x,60);
  
    g.fillArc(130+b,520-a,60,60,0+y,75);
    g.fillArc(130+b,520-a,60,60,130+y,75);
    g.fillArc(130+b,520-a,60,60,250+y,75);
  
    g.fillRect(300+b,500-a,100,80);
    g.fillRoundRect(400+b,530-a,50,50,5,5);
    g.fillRect(380+b,480-a,8,25);
    g.fillRect(150+b,540-a,150,20);
    g.fillRect(330+b,580-a,8,20);
    g.fillRect(405+b,580-a,8,20);
    g.fillRect(320+b,600-a,102,10);
    g.fillArc(320+b,500-a,128,60,0,90);
    g.fillArc(127+b,458-a,90,90,240,45);
   
 
    g.fillRect(400+b,525-a,25,25);
 
  try{
          if(c<=5)
         {
 
         Thread.currentThread().sleep(t);
               x+=60;
               y+=75;
               m+=500;
            if(m==5000)
         {
              if(t>=100)
             {t=t-100;}
              else
            {
             if(a<=300)
             {a++;}
            else
             {b+=3;}}
           m=500;}
           if(b>=800)
         {b=-490;
          c++;}   repaint();
   }
    
    }
    catch(Exception e){}
   
 }
else if(i==2){g.drawOval(a1,b11,50,60);
		g.setColor(Color.red);
		g.fillOval(a1,b11,50,60);
		g.setColor(Color.black);
		g.drawLine(a1+25,b11+60,a1+25,b11+80);

try{Thread.currentThread().sleep(t);if(count%2==0)
					{a1+=20;}
					else
						{a1-=10;}
					b11-=20;
					count++;
			repaint();}catch(Exception e){}


}
else if(i==3)
{g.drawLine(250,b12,200,b12+50);
		g.drawLine(250,b12,300,b12+50);
		g.drawLine(200,b12+50,300,b12+50);
		g.drawLine(200,b12+50,200,b12+250);
		g.drawLine(300,b12+50,300,b12+250);
		g.drawLine(200,b12+250,300,b12+250);
		g.drawLine(230,b12+250,230,b12+260);
		g.drawLine(270,b12+250,270,b12+260);
		g.drawLine(230,b12+260,270,b12+260);
if((b12+260)==0)
	{b12=450;}try{
				Thread.currentThread().sleep(5);au=getAudioClip(getCodeBase(),"Rocket.wav");
	au.play();
			}
			catch(Exception e){}
			b12--;
			repaint();

		
}






}
}
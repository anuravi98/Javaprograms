import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class B extends Frame implements ActionListener, Runnable
{  
Button button1;
Color clr;
int i=1,j=1;
int o=390,n=1;
Thread t;

		button1 = new Button();
		button1.setLabel("CLICK");
		add(button1);
		 button1.addActionListener(this);
	
public void actionPerformed(ActionEvent e) 
	{   o=390; j=1;
	  if(e.getSource()==button1)
	    { 
		
        	t=new Thread(this);
			t.start();
	        
			
        }
	}
public void run()
{
int l=40; 
			System.out.println("j");
 i++; repaint();
		
       Graphics page=getGraphics();
	   	while(j<(i))
			{	
		   
	       Random rand = new Random();  
			int red = rand.nextInt(255);
			int green = rand.nextInt(255);
			int blue = rand.nextInt(255);
	   		clr= new Color(red,green,blue);
		   o=390;
		   
	      while(o>=50)
	      { page.setColor(clr); 
			page.fillOval (l*j,o, 30, 40);
			page.setColor(Color.white);	
			System.out.println(j+" "+i);
			System.out.println((l*j)+13);
			page.drawLine(((l*j)+13),o+35,(l*j)+13,o+45);
            
			
		 try{  Thread.sleep(1000);
                }
		               catch(Exception e){}
			page.setColor(Color.black);
			page.fillOval (l*j,o, 30, 40);
			page.setColor(Color.black);	
			page.drawLine(((l*j)+13),o+35,(l*j)+13,o+45);
            		   
			o-=70;
			
        }
		page.setColor(clr);
		page.fillOval (l*j,o, 30, 40);
			page.setColor(Color.white);	
			
			System.out.println((l*j)+13);
			page.drawLine(((l*j)+13),o+35,(l*j)+13,o+45);
            
		j++;
}
}

      button1.setLocation(200, 350);
    		 button1.setSize(60, 30);
     		 setBackground (Color.black);
	  
    	    
			
 
	
		
}	
	  


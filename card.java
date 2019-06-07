import java.awt.*;   
import java.awt.event.*; 
class CardLayoutExample extends Frame implements ActionListener 
{ 
     CardLayout card = new CardLayout(20,20); 
     CardLayoutExample() 
     { 
         setLayout(card); 
         Button Btnfirst = new Button("first "); 
         Button BtnSecond = new Button ("Second"); 
         Button BtnThird = new Button("Third"); 
         add(Btnfirst,"Card1"); 
         add(BtnSecond,"Card2"); 
         add(BtnThird,"Card3"); 
         Btnfirst.addActionListener(this); 
         BtnSecond.addActionListener (this); 
         BtnThird.addActionListener(this); 
     } 
     public void actionPerformed(ActionEvent e) 
     { 
       if(e.getActionCommand()=="first")
{Hel h=new Hel();}
     } 
} 
  public class card
   { 
        public static void main(String args[]) 
       { 
            CardLayoutExample frame = new CardLayoutExample(); 
            frame.setTitle("CardLayout in Java Example"); 
            frame.setSize(220,150); 
            frame.setResizable(false); 
            frame.setVisible(true); 
       } 
   }
 

class Hel extends Frame
{
int x=0,y=0,t=500,m,a=0,b=0,c=0;
    Hel()
 {
	      setLayout(new FlowLayout());
       setVisible(true);
       setSize(600,700);
   setBackground(Color.CYAN);
 }
 
    public void paint(Graphics g)
 {
    g.fillArc(283+b,440-a,200,80,0+x,60);
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
 
    g.setColor(Color.WHITE);
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
          c++;}
   repaint();
   }
    
    }
    catch(Exception e){}
   
   finally
    {
    if(c==6){
  
    g.setColor(Color.BLACK);
   g.fillArc(283+b,440-a,200,80,0+x,60);
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
 
    g.setColor(Color.WHITE);
    g.fillRect(400+b,525-a,25,25);
    try{
    if(true)
    {
     g.setColor(Color.BLACK);
   g.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,50));
   g.drawString("Aravind",350,250);   
       Thread.currentThread().sleep(100);
    x+=60;
    y+=75;
    if(b<=-110)
    {
    b+=8;
    }
    repaint();}}
    catch(Exception e){}
    }}
 }
 

}


 
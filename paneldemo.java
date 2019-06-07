import java.awt.*;
import java.awt.event.*;
public class paneldemo extends Frame implements ActionListener
{Panel p1,p2,p3,p4,p5;
TextField t1,t2,t3;
CardLayout c;
Button b;
Label l;
paneldemo()
{
	setVisible(true);
setLayout(new BorderLayout());
setSize(500,500);
addWindowListener(new WindowAdapter()
{public void windowClosing(WindowEvent we)
{System.exit(0);}});
p1=new Panel();
c=new CardLayout();

add(p1,BorderLayout.CENTER);p1.setLayout(c);
p2=new Panel();
t1=new TextField();
p2.add(t1);
t1.setBounds(100,100,90,100);
p1.add(p2,"page1");
p3=new Panel();
t2=new TextField();
l=new Label("hiiii",Label.LEFT);
p3.add(l);
p3.add(t2);
t2.setBounds(200,100,90,100);
l.setBounds(300,500,90,100);
p1.add(p3,"page2");
p4=new Panel();
t3=new TextField();
p4.add(t3);
t3.setBounds(300,100,90,100);
p1.add(p4,"page3");
p5=new Panel();
add(p5);
b=new Button("next");
p5.add(b);
add(p5,BorderLayout.SOUTH);
b.addActionListener(this);
b.setBounds(100,50,100,100);}
public void actionPerformed(ActionEvent e)
{c.next(p1);}


public static void main(String args[])
{paneldemo pp=new paneldemo();}
}

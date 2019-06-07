import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="Calc" height=400 width=400></applet>*/
public class Calc extends Applet implements ActionListener
{
double d,d1,d2;char c;
Button ad,sub,mul,div,clr,eql,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
TextField t;
int i=0;
String m=" ";
Panel p1=new Panel();
Panel p2=new Panel();
public void init()
{
BorderLayout b0=new BorderLayout();
setLayout(b0);
add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.CENTER);
b1=new Button("0");
b2=new Button("1");
b3=new Button("2");
b4=new Button("3");
b5=new Button("4");
b6=new Button("5");
b7=new Button("6");
b8=new Button("7");
b9=new Button("8");
b10=new Button("9");
ad=new Button("+");
sub=new Button("-");
mul=new Button("*");
div=new Button("/");
t=new TextField(10);
eql=new Button("=");
clr=new Button("clear");
p2.add(b1);
p2.add(b2);
p2.add(b3);
p2.add(b4);
p2.add(b5);
p2.add(b6);
p2.add(b7);
p2.add(b8);
p2.add(b9);
p2.add(b10);
p2.add(ad);
p2.add(sub);
p2.add(mul);
p2.add(div);
p2.add(clr);
p2.add(eql);
p1.add(t);
p2.setLayout(new GridLayout(5,5,2,2));
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
ad.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
clr.addActionListener(this);
eql.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
String a;
if(s.equals("0"))
{
t.setText("0");
}
if(s.equals("1"))
{
t.setText("1");
}
if(s.equals("2"))
{
t.setText("2");
}
if(s.equals("3"))
{
t.setText("3");
}
if(s.equals("4"))
{
t.setText("4");
}
if(s.equals("5"))
{
t.setText("5");
}
if(s.equals("6"))
{
t.setText("6");
}
if(s.equals("7"))
{
t.setText("7");
}
if(s.equals("8"))
{
t.setText("8");
}
if(s.equals("9"))
{
t.setText("9");
}
if(s.equals("+"))
{
d=Double.parseDouble(t.getText());
c='+';
t.setText("");
}
else if(s.equals("-"))
{
d=Double.parseDouble(t.getText());
c='-';
t.setText("");
}
else if(s.equals("*"))
{
d=Double.parseDouble(t.getText());
c='*';
t.setText("");
}
else if(s.equals("/"))
{
d=Double.parseDouble(t.getText());
c='/';
t.setText("");
}
if(s.equals("="))
{
d1=Double.parseDouble(t.getText());
if(c=='+')
{d2=d+d1;}
else if(c=='-')
d2=d-d1;
else if(c=='*')
d2=d*d1;
else if(c=='/')
d2=d/d1;
t.setText(""+d2);
}
if(s.equals("clear"))
{
t.setText(" ");
}
}
}
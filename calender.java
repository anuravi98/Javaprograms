import java.awt.*;
import java.awt.event.*;
class calender extends Frame implements ActionListener
{
Panel p1,p2,p3;
TextField t1,t2,t3;
Label l1,l2,l3,l4,l5,l6,l7,l8;
Button b[]=new Button[31];
Button b1[]=new Button[6];
Button b2;
calender()
{
setVisible(true);
setSize(500,500);
setLayout(new BorderLayout());
p1=new Panel();
add(p1,BorderLayout.NORTH);
p2=new Panel();
add(p2,BorderLayout.CENTER);
p3=new Panel();
add(p3,BorderLayout.SOUTH);
t1=new TextField(25);
p1.add(t1);
t2=new TextField(25);
p1.add(t2);
t3=new TextField(25);
p1.add(t3);
b2=new Button("submit");
p1.add(b2);
b2.addActionListener(this);
for(int i=0;i<31;i++)
{
b[i]=new Button((i+1)+"");
b[i].addActionListener(this);
}
for(int i=0;i<6;i++)
{
b1[i]=new Button("");
b1[i].addActionListener(this);
}
p2.setLayout(new GridLayout(7,7));
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b2)
{
int j=0;
if(t1.getText().equals("mon"))
j=1;
if(t1.getText().equals("tue"))
j=2;
if(t1.getText().equals("wed"))
j=3;
if(t1.getText().equals("thu"))
j=4;
if(t1.getText().equals("fri"))
j=5;
if(t1.getText().equals("sat"))
j=6;
l1=new Label("sun");
p2.add(l1);
l2=new Label("mon");
p2.add(l2);
l3=new Label("tue");
p2.add(l3);
l4=new Label("wed");
p2.add(l4);
l5=new Label("thu");
p2.add(l5);
l6=new Label("fri");
p2.add(l6);
l7=new Label("sat");
p2.add(l7);
for(int i=0;i<j;i++)
p2.add(b1[i]);
for(int i=0;i<28;i++)
p2.add(b[i]);
if(t2.getText().equals("jan")||t2.getText().equals("mar")||t2.getText().equals("may")||t2.getText().equals("jul")||t2.getText().equals("aug")||t2.getText().equals("oct")||t2.getText().equals("dec"))
{
p2.add(b[28]);p2.add(b[29]);p2.add(b[30]);
}
if(t2.getText().equals("apr")||t2.getText().equals("jun")||t2.getText().equals("sep")||t2.getText().equals("nov"))//||t2.getText().equals("aug")||t2.getText().equals("oct")||t2.getText().equals("dec"))
{
p2.add(b[28]);p2.add(b[29]);
}
int w=Integer.parseInt(t3.getText())%4;
if(t2.getText().equals("feb")&&(w==0))
p2.add(b[28]);
}
if(e.getSource()==b[0])
{
String str="1"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[1])
{
String str="2"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[2])
{
String str="3"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[3])
{
String str="4"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[4])
{
String str="5"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[5])
{
String str="6"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[6])
{
String str="7"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[7])
{
String str="8"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
if(e.getSource()==b[8])
{
String str="9"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}if(e.getSource()==b[9])
{
String str="10"+t2.getText()+t3.getText();
l8=new Label(str);
p3.add(l8);
}
}
public static void main(String args[])
{
calender c=new calender();
}
}


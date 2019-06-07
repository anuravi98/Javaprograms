import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tabdemo 
{String s1,s2,s3;
	tabdemo()
{JFrame jf=new JFrame("tabdemo");
jf.setLayout(null) ;
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(500,500);jf.setVisible(true);
JTabbedPane jt=new JTabbedPane();
jt.addTab("dress",new dresspanel(s1));
jt.addTab("accesories",new accpanel(s2));
jt.addTab("shoes",new shoespanel(s3));
jt.add("confirmation",new conpanel(s1,s2,s3));
jf.add(jt);jt.setBounds(10,10,400,400);
}
public static void main(String args[])
{SwingUtilities.invokeLater(new Runnable() {
public void run() {
new tabdemo();
}
});}
}
class dresspanel extends JPanel implements ActionListener
{   String s1;
	dresspanel(String s)
	{s1=s;
		JRadioButton b1=new JRadioButton("shirt");
		JRadioButton b2=new JRadioButton("kurta");
		JRadioButton b3=new JRadioButton("maxi");
		add(b1);add(b2);
		add(b3);b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);bg.add(b2);bg.add(b3);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		s1=e.getActionCommand();
	}

}
class accpanel extends JPanel implements ActionListener
{ String s2;
	accpanel(String s)
	{s2=s;
		JRadioButton b1=new JRadioButton("scarf");
		JRadioButton b2=new JRadioButton("watch");
		JRadioButton b3=new JRadioButton("ring");
		add(b1);add(b2);
		add(b3);b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);bg.add(b2);bg.add(b3);


	}
	public void actionPerformed(ActionEvent e)
	{
		s2=e.getActionCommand();
	}

}class shoespanel extends JPanel implements ActionListener
{ String s3;
	shoespanel(String s)
	{s3=s;
		JRadioButton b1=new JRadioButton("heels");
		JRadioButton b2=new JRadioButton("flats");
		JRadioButton b3=new JRadioButton("wedges");
		add(b1);add(b2);
		add(b3);b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);bg.add(b2);bg.add(b3);


	}
	public void actionPerformed(ActionEvent e)
	{
		s3=e.getActionCommand();
	}

}
class conpanel extends JPanel
{String s1,s2,s3;
	conpanel(String s1,String s2,String s3)
    {this.s1=s1;this.s2=s2;this.s3=s3; }
	public void paintComponent(Graphics g)
	{super.paintComponent(g);
		
        Font f=new Font("calibiri",Font.BOLD,20);
        g.setFont(f);g.drawString("the selection is complete",100,100);
	}

}
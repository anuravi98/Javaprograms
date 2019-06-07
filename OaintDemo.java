import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
// This class extends JPanel. It overrides
// the paintComponent() method so that random
// lines are plotted in the panel.
class PaintPanel extends JPanel {
 // used to generate random numbers
// Construct a panel.
PaintPanel() {
// Put a border around the panel.
setBorder(
BorderFactory.createLineBorder(Color.ORANGE, 15));

}
// Override the paintComponent() method.
protected void paintComponent(Graphics g) {
// Always call the superclass method first.
super.paintComponent(g);
int x=10, y=10, x2=10, y2=10;
// Get the height and width of the component.

// Get the insets.

// Draw ten lines whose endpoints are randomly generated.
for(int i=0; i < 10; i++) {// Obtain random coordinates that define
// the endpoints of each line.
x = x+10;
y = y+10;
x2 = x2+10;
y2 = y2+10;
// Draw the line.
g.drawLine(x, y, x2, y2);
}
}
}
// Demonstrate painting directly onto a panel.
public class PaintDemo {
JLabel jlab;
PaintPanel pp;
PaintDemo() {
// Create a new JFrame container.
JFrame jfrm = new JFrame("Paint Demo");
// Give the frame an initial size.
jfrm.setSize(200, 150);
// Terminate the program when the user closes the application.
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// Create the panel that will be painted.
pp = new PaintPanel();
// Add the panel to the content pane. Because the default
// border layout is used, the panel will automatically be
// sized to fit the center region.
jfrm.add(pp);
// Display the frame.
jfrm.setVisible(true);
}
public static void main(String args[]) {
// Create the frame on the event dispatching thread.
SwingUtilities.invokeLater(new Runnable() {
public void run() {
new PaintDemo();
}
});
}
}
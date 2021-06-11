import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Map5 extends JFrame
{
    JButton b1,b2,b3;
    JLabel l1;

    public Map5()
    {    
        setTitle("Dholakpur Map");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
  
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("dholakpurmap.png")));
        setLayout(null);
       
        setSize(800,300);
        setSize(800,300);
    }
	public static void main(String[] args) {
    new Map5();
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Map2 extends JFrame
{
    JButton b1,b2,b3;
    JLabel l1;

    public Map2()
    {    
        setTitle("NIT Delhi Map");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
  
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("Nitmap.png")));
        setLayout(null);
       
        setSize(800,301);
        setSize(800,301);
     
    }
	public static void main(String[] args) {
    new Map2();
    }
}

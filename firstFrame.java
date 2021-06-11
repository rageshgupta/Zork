import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class firstFrame extends JFrame
{
    JButton b1,b2,b3;
    JLabel l1;

    public firstFrame()
    {    //JFrame.setBackground(Colour.RED);
        setTitle("");
        setSize(300,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        /*
        One way
        -----------------
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\Computer\\Downloads\\colorful design.png"));
        add(background);
        background.setLayout(new FlowLayout());
        l1=new JLabel("Here is a button");
        b1=new JButton("I am a button");
        background.add(l1);
        background.add(b1);
        */

        // Another way
        setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("image.jpeg")));
        setLayout(null);
        //l1=new JLabel("Here is a button");
        b1=new JButton("INTRO");
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                dispose();
                new intro();
            } 
        });
        b2=new JButton("PLAY");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                dispose();
                new play();
            }
            
        });
        b3=new JButton("HELP");
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                dispose();
                new help();
            }
            
        });
       // add(l1);
        add(b1);
        add(b2);
        add(b3);
        b1.setBounds(100,300,80,50);
        b2.setBounds(200,300,80,50); 
        b3.setBounds(300,300,80,50); 
        // Just for refresh :) Not optional!
        setSize(492,398);
        setSize(492,398);
    }

} 
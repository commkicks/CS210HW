import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class testeing extends JPanel {
    private JButton runButton;
    private JButton closeButton;

    public MyPanel() {
        //construct components
        runButton = new JButton ("RUN");
        closeButton = new JButton ("Close");

        //set components properties
        runButton.setToolTipText ("click to run excercise");

        //adjust size and set layout
        setPreferredSize (new Dimension (944, 584));
        setLayout (null);

        //add components
        add (runButton);
        add (closeButton);

        //set component bounds (only needed by Absolute Positioning)
        runButton.setBounds (730, 555, 100, 20);
        closeButton.setBounds (835, 555, 100, 20);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("MyPanel");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.pack();
        frame.setVisible (true);
   }
}
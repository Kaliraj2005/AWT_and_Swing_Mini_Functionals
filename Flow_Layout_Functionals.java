package AWT_Swing_Projects;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Flow_Layout_Functionals
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));

        frame.add(new JButton("0"));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.addWindowListener(new WindowListener()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                System.out.println("Windows has Opened !!!");
            }
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Windows is Closing now !!!");
            }
            @Override
            public void windowClosed(WindowEvent e)
            {
                System.out.println("You are Exited now !!!");
            }
            @Override
            public void windowIconified(WindowEvent e) {}
            @Override
            public void windowDeiconified(WindowEvent e) {}
            @Override
            public void windowActivated(WindowEvent e)
            {
                System.out.println("Windows is Activated now !!!");
            }
            @Override
            public void windowDeactivated(WindowEvent e) {}
        });

        frame.setVisible(true);
    }
}

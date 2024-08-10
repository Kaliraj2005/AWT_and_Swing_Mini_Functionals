package AWT_Swing_Projects;

import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout_Functionals
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new GridLayout(3,3,0,0));

        JButton btn_0 = new JButton("0");
        JButton btn_1 = new JButton("1");
        JButton btn_2 = new JButton("2");
        JButton btn_3 = new JButton("3");
        JButton btn_4 = new JButton("4");
        JButton btn_5 = new JButton("5");
        JButton btn_6 = new JButton("6");
        JButton btn_7 = new JButton("7");
        JButton btn_8 = new JButton("8");
        JButton btn_9 = new JButton("9");

        frame.add(btn_0);
        btn_0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 0");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_1);
        btn_1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 1");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_2);
        btn_2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 2");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_3);
        btn_3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 3");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_4);
        btn_4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 4");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_5);
        btn_5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 5");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_6);
        btn_6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 6");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_7);
        btn_7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 7");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_8);
        btn_8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 8");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.add(btn_9);
        btn_9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("You are Clicked Button - 9");
                System.out.println("Can You Click Another One Button ?");
            }
        });
        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowOpened(WindowEvent e)
            {
                System.out.println("Window is Opened now !!!");
            }
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.out.println("Window is Closed now !!!");
            }
            @Override
            public void windowClosed(WindowEvent e)
            {
                System.out.println("You are Exited now !!!");
            }
        });

        frame.setVisible(true);
    }
}

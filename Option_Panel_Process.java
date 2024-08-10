package AWT_Swing_Projects;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Option_Panel_Process extends JFrame
{
    public Option_Panel_Process()
    {
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
    public static void main(String[] args)
    {
        new Option_Panel_Process();
        JOptionPane.showMessageDialog(null, "This is a message dialog box", "title", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "Here is some useless info", "title", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!", "title", JOptionPane.WARNING_MESSAGE);

        JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT OR ELSE!", "title", JOptionPane.ERROR_MESSAGE);

        int answer1 = JOptionPane.showConfirmDialog(null, "bro, do you even code?");
        System.out.println(answer1);

        String name = JOptionPane.showInputDialog("What is your name?: ");
        System.out.println(name);

        ImageIcon icon = new ImageIcon("smile.png");

        String[] responses = {"No, you are!", "thank you!", "Oops"};
        int answer2 = JOptionPane.showOptionDialog(
                null,
                "You are the best! :D",
                "Secret message",
                JOptionPane.DEFAULT_OPTION,
                0,
                icon,
                responses,
                responses[0]);
        System.out.println(answer2);
    }
}

package AWT_Swing_Projects;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
class ProgressBar
{
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,100);

    ProgressBar()
    {
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("BOLD",Font.BOLD,25));
        bar.setForeground(Color.red);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        progression();
    }
    public void progression()
    {
        int counter = 0;
        while(counter<=100)
        {
            bar.setValue(counter);
            try
            {
                Thread.sleep(50);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            counter +=1;
        }
        bar.setString("Completed !!! ");
    }
    public static void main(String args[])
    {
        new ProgressBar();
    }
}

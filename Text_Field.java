import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
class TextField extends JFrame implements ActionListener, WindowListener
{
    JButton button;
    JTextField textField;
    TextField()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Enter");
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.GREEN);
        button.setFont(new Font("BOLD",Font.PLAIN,25));

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("BOLD",Font.PLAIN,35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        textField.setText("USERNAME");

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            System.out.println("You Entered ->  "+ textField.getText());
        }
    }
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
    @Override
    public void windowIconified(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowDeactivated(WindowEvent e) {}
}
public class Text_Field
{
    public static void main(String[] args)
    {
        new TextField();
    }
}


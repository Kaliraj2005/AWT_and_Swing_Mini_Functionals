package AWT_Swing_Projects.Combo_Box;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Combo_Box extends JFrame implements ActionListener,WindowListener
{
    JComboBox comboBox;
    Combo_Box()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","bird"};

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        comboBox.setEditable(true);

        comboBox.addItem("horse");
        comboBox.insertItemAt("pig", 0);
        comboBox.setSelectedIndex(0);

//        System.out.println(comboBox.getItemCount());
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == comboBox)
        {
            System.out.println(comboBox.getSelectedItem());

            //System.out.println(comboBox.getSelectedIndex());
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


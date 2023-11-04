
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BackgroundChange extends JFrame implements ActionListener{
    private JButton b1,b2,b3;

    BackgroundChange(){
        this.setDefaultCloseOperation(3);
        this.setTitle("Color change");
        this.setLayout(null);
        this.setSize(400,400);

        b1 = new JButton("RED");
        b1.setBounds(0,0,75, 50);
        b1.setFocusable(false);
        b1.addActionListener(this);
        b2 = new JButton("GREEN");
        b2.setBounds(75,0,75, 50);
        b2.setFocusable(false);
        b2.addActionListener(this);
        b3 = new JButton("BLUE");
        b3.setBounds(150,0,75, 50);
        b3.setFocusable(false);
        b3.addActionListener(this);

        this.add(b1);
        this.add(b2);
        this.add(b3);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            this.getContentPane().setBackground(Color.RED);
        }
        if(e.getSource() == b2){
            this.getContentPane().setBackground(Color.GREEN);
        }
        if(e.getSource() == b3){
            this.getContentPane().setBackground(Color.BLUE);
        }
    }
    public static void main(String[] args) {
        BackgroundChange f = new BackgroundChange();

        f.setVisible(true);
    }
}

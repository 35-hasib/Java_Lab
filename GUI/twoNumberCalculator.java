import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class mycalculator extends JFrame implements ActionListener{
    public JLabel l1,l2,l3;
    public JButton b1,b2,b3,b4;
    public JTextField t1,t2,t3;
    mycalculator(){
        this.setDefaultCloseOperation(3);
        this.setSize(320,192);
        this.setResizable(false);
        this.setLayout(null);
        this.setTitle("Simple Calculator");

        l1 = new JLabel("Number 1 :");
        l1.setBounds(0,0,100,50);
        l2 = new JLabel("Number 2 :");
        l2.setBounds(0,50,100,50);
        l3 = new JLabel("Result = ");
        l3.setBounds(0,100,100,50);

        t1 = new JTextField();
        t1.setBounds(100,0,100,50);
        t2 = new JTextField();
        t2.setBounds(100,50,100,50);
        t3 = new JTextField();
        t3.setBounds(100,100,100,50);

        b1 = new JButton("+");
        b1.setBounds(200,0,50,50);
        b1.setFocusable(false);
        b1.addActionListener(this);
        b2 = new JButton("-");
        b2.setBounds(250,0,50,50);
        b2.setFocusable(false);
        b2.addActionListener(this);
        b3 = new JButton("*");
        b3.setBounds(200,50,50,50);
        b3.setFocusable(false);
        b3.addActionListener(this);
        b4 = new JButton("/");
        b4.setBounds(250,50,50,50);
        b4.setFocusable(false);
        b4.addActionListener(this);

        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(b4);



    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            String a = t1.getText();
            String b = t2.getText();
            int x = Integer.valueOf(a);
            int y = Integer.valueOf(b);
            x += y;
            String c = String.valueOf(x);
            t3.setText(c);
        }
        if(e.getSource() == b2){
            String a = t1.getText();
            String b = t2.getText();
            int x = Integer.valueOf(a);
            int y = Integer.valueOf(b);
            x -= y;
            String c = String.valueOf(x);
            t3.setText(c);
        }
        if(e.getSource() == b3){
            String a = t1.getText();
            String b = t2.getText();
            int x = Integer.valueOf(a);
            int y = Integer.valueOf(b);
            x *= y;
            String c = String.valueOf(x);
            t3.setText(c);
        }
        if(e.getSource() == b4){
            String a = t1.getText();
            String b = t2.getText();
            double x = Double.valueOf(a);
            double y = Double.valueOf(b);

            x /= y;
            String c = String.valueOf(x);
            t3.setText(c);
        }
    }
    
}

public class twoNumberCalculator {
    public static void main(String[] args) {
        mycalculator f = new mycalculator();

        f.setVisible(true);
    }
}

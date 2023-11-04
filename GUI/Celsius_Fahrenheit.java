
import javax.swing.*;
import java.awt.event.*;

public class Celsius_Fahrenheit extends JFrame implements ActionListener{
    private JLabel l1,l2;
    private JTextField t1,t2;
    private JButton b;

    Celsius_Fahrenheit(){
        this.setDefaultCloseOperation(3);
        this.setTitle("F_C");
        this.setLayout(null);
        this.setSize(400,400);

        l1 = new JLabel("F");
        l1.setBounds(0,0,50,50);
        l2 = new JLabel("C");
        l2.setBounds(0,50,50,50);

        t1 = new JTextField();
        t1.setBounds(50,0,100,50);
        t2 = new JTextField();
        t2.setBounds(50,50,100,50);
        t2.setEditable(false);

        b = new JButton("Convert");
        b.setFocusable(false);
        b.setBounds(150,0,100,50);
        b.addActionListener(this);

        this.add(l1);
        this.add(l2);
        this.add(t1);
        this.add(t2);
        this.add(b);

    }

    public void actionPerformed(ActionEvent e){
        int f = Integer.valueOf(t1.getText());
        int c = (f-32)*5/9;
        if(e.getSource() == b){
            t2.setText(String.valueOf(c));
        }
    }
    public static void main(String[] args) {
        Celsius_Fahrenheit f = new Celsius_Fahrenheit();

        f.setVisible(true);
    }
}

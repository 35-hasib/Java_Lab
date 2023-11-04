
import javax.swing.*;
import java.awt.event.*;

public class FutureValue extends JFrame implements ActionListener{
    private JLabel l1,l2,l3;
    private JTextField t1,t2,t3,ta;
    
    private JButton b;

    FutureValue(){
        this.setDefaultCloseOperation(3);
        this.setTitle("Future Value");
        this.setLayout(null);
        this.setSize(400,400);

        l1 = new JLabel("Interst Rate");
        l1.setBounds(0,0,120,50);
        l2 = new JLabel("Invesment Amount");
        l2.setBounds(0,50,120,50);
        l3 = new JLabel("Years");
        l3.setBounds(0,100,120,50);
        

        t1 = new JTextField();
        t1.setBounds(120,0,100,50);
        t2 = new JTextField();
        t2.setBounds(120,50,100,50);
        t3 = new JTextField();
        t3.setBounds(120,100,100,50);
        ta = new JTextField();
        ta.setBounds(120,150,100,50);
        ta.setEditable(false);

        b = new JButton("Future Value");
        b.setBounds(0,150,120,50);
        b.setFocusable(false);
        b.addActionListener(this);


        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(ta);
        this.add(b);
    }

    public void actionPerformed(ActionEvent e){
        double x = Double.valueOf(t1.getText());
        double y = Double.valueOf(t2.getText());
        double z = Double.valueOf(t3.getText());

        // x = x/12;
        z = z*12;
        double a = y * Math.pow(1+x , z);

        if(e.getSource() == b){
            ta.setText(String.valueOf(a));
        }
    }

    public static void main(String[] args) {
        FutureValue f = new FutureValue();

        f.setVisible(true);
    }
}

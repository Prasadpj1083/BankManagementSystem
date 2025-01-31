package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    main_Class(String pin){
        this.pin=pin;
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=imageIcon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i2);
        JLabel i3=new JLabel(imageIcon1);
        i3.setBounds(0,0,1550,830);
        add(i3);

        JLabel label=new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("Systen",Font.BOLD,28));
        i3.add(label);

        b1=new JButton("DEPOSIT");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(405,270,150,35);
        b1.addActionListener(this);
        i3.add(b1);

        b3=new JButton("FAST CASH");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(405,320,150,35);
        b3.addActionListener(this);
        i3.add(b3);

        b4=new JButton("MINI STATEMENT");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,320,150,35);
        b4.addActionListener(this);
        i3.add(b4);

        b2=new JButton("CASH WITHDRAWAL");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(705,270,150,35);
        b2.addActionListener(this);
        i3.add(b2);

        b5=new JButton("PIN CHANGE");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(405,367,150,35);
        b5.addActionListener(this); // For b5
        i3.add(b5);

        b6=new JButton("BALANCE ENQUIRY");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,367,150,35);
        b6.addActionListener(this);
        i3.add(b6);

        b7=new JButton("EXIT");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,416,150,35);
        b7.addActionListener(this);
        i3.add(b7);

        b8 = new JButton("Example Button"); // Initialize the button
        b8.setBounds(150, 200, 120, 30); // Set position and size
        b8.addActionListener(this); // Add action listener to the button
        add(b8); // Add button to the frame




        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] args) {
        new main_Class("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){

            new Deposite(pin);
            setVisible(false);
        }
        if (e.getSource() == b8) {
            JOptionPane.showMessageDialog(null, "Button Clicked!");
        } else if (e.getSource()==b7) {
            System.exit(0);
            
        } else if (e.getSource()==b2) {
            new CashWithdrowal(pin);
            setVisible(false);

        } else if (e.getSource()==b6) {
            new BalanceEnqury(pin);

        } else if (e.getSource()==b3) {
            new FastCash(pin);
            setVisible(false);

        }else if (e.getSource()==b5) {
            new pin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new mini(pin);
            setVisible(false);

        }

    }
}


package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnqury extends JFrame implements ActionListener {
    JLabel label2;
    JButton b1;
    String pin;
    BalanceEnqury(String pin){
        this.pin=pin;

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=imageIcon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i2);
        JLabel i3=new JLabel(imageIcon1);
        i3.setBounds(0,0,1550,830);
        add(i3);

        JLabel label1=new JLabel("Your Current Balance is Rs :");
        label1.setForeground(Color.WHITE);
        label1.setBounds(430,180,700,35);
        label1.setFont(new Font("System",Font.BOLD,16));
        i3.add(label1);

        label2=new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setBounds(430,220,700,35);
        label2.setFont(new Font("System",Font.BOLD,16));
        i3.add(label2);

        b1=new JButton("Back");
        b1.setBounds(700,406,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        i3.add(b1);

        int balance=0;
        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin_no='" + pin + "'");
            while (resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));

                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        }
        label2.setText(""+balance);


        setLayout(null);
        setSize(1550,830);
        setLocation(0,0);
        setVisible(true);
    }



    public static void main(String[] args) {
        new BalanceEnqury("");

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new main_Class(pin);

    }
}

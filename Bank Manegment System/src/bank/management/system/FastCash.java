package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    FastCash(String pin){
        this.pin=pin;
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=imageIcon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i2);
        JLabel i3=new JLabel(imageIcon1);
        i3.setBounds(0,0,1550,830);
        add(i3);

        JLabel label=new JLabel("Select Withdrawal Amount");
        label.setBounds(445,180,700,25);
        label.setForeground(Color.white);
        label.setFont(new Font("Systen",Font.BOLD,28));
        i3.add(label);

        b1=new JButton("Rs.100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(405,270,150,35);
        b1.addActionListener(this);
        i3.add(b1);

        b3=new JButton("Rs.500");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(405,320,150,35);
        b3.addActionListener(this);
        i3.add(b3);

        b4=new JButton("Rs.1000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,320,150,35);
        b4.addActionListener(this);
        i3.add(b4);

        b2=new JButton("Rs.2000");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(705,270,150,35);
        b2.addActionListener(this);
        i3.add(b2);

        b5=new JButton("Rs.5000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(405,367,150,35);
        b5.addActionListener(this); // For b5
        i3.add(b5);

        b6=new JButton("Rs.10000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,367,150,35);
        b6.addActionListener(this);
        i3.add(b6);

        b7=new JButton("Back");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(700,416,150,35);
        b7.addActionListener(this);
        i3.add(b7);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    public static void main(String[] args) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       //int balance=0;
        if(e.getSource()==b7){
            setVisible(false);
            new main_Class(pin);
        }else{
            String amount=((JButton)e.getSource()).getText().substring(4);
            Conn c=new Conn();
            Date  date=new Date();
            try
            {
                ResultSet resultSet=c.statement.executeQuery("select * from bank where pin_no ='"+pin+"'");
                int balance=0;
                while (resultSet.next()) {
                    if (resultSet.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));

                    } else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if(e.getSource()!= b7 && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','WITHDRAW','" + amount + "')");
                JOptionPane.showMessageDialog(null,"Debited Successfully");

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            setVisible(false);
            new main_Class(pin);
        }

    }
}
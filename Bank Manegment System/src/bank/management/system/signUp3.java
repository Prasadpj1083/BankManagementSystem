package bank.management.system;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signUp3 extends JFrame implements ActionListener {
    JRadioButton k1,k2,k3,k4;
    JCheckBox c1,c2,c3,c4,c5,c6;

    JButton submit,cancel;
    String formNo;

    signUp3(String formNo) {
        this.formNo = formNo;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1=new JLabel("Page 3 :");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2=new JLabel("Account Details :");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3=new JLabel("Account Type :");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,120,400,40);
        add(l3);

        k1=new JRadioButton("Saving Account");
        k1.setFont(new Font("Raleway",Font.BOLD,14));
        k1.setBounds(110,160,150,30);
        k1.setBackground(new Color(215,252,252));
        add(k1);

        k2=new JRadioButton("Fix Deposit");
        k2.setFont(new Font("Raleway",Font.BOLD,14));
        k2.setBounds(360,160,200,30);
        k2.setBackground(new Color(215,252,252));
        add(k2);

        k3=new JRadioButton("Current Account");
        k3.setFont(new Font("Raleway",Font.BOLD,14));
        k3.setBounds(360,200,200,30);
        k3.setBackground(new Color(215,252,252));
        add(k3);

        k4=new JRadioButton("Recurring Deposit Account");
        k4.setFont(new Font("Raleway",Font.BOLD,14));
        k4.setBounds(110,200,220,30);
        k4.setBackground(new Color(215,252,252));
        add(k4);

        ButtonGroup b1=new ButtonGroup();
        b1.add(k1);
        b1.add(k2);
        b1.add(k3);
        b1.add(k4);

        JLabel l4=new JLabel("Card Number :");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,280,200,30);
        add(l4);

        JLabel l5=new JLabel("(Your 16 Digit Card Number:)");
        l5.setFont(new Font("Raleway",Font.BOLD,14));
        l5.setBounds(100,310,340,20);
        add(l5);

        JLabel l6=new JLabel("XXXX-XXXX-XXXX-9696   ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,280,200,30);
        add(l6);

        JLabel l7=new JLabel("(It Would appear on ATM card check book and Statement)");
        l7.setFont(new Font("Raleway",Font.BOLD,14));
        l7.setBounds(330,310,500,20);
        add(l7);

        JLabel l8=new JLabel("Pin:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,350,200,30);
        add(l8);

        JLabel l9=new JLabel("****");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,350,200,30);
        add(l9);

        JLabel l10=new JLabel("(Four Digit Password:)");
        l10.setFont(new Font("Raleway",Font.BOLD,14));
        l10.setBounds(100,370,340,20);
        add(l10);

        JLabel l11=new JLabel("Service Required:  ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,420,200,30);
        add(l11);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,470,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,470,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,520,200,30);
        add(c3);

        c4=new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,520,200,30);
        add(c4);

        c5=new JCheckBox("Check Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,570,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,570,200,30);
        add(c6);

        JCheckBox c7=new JCheckBox("I here by decleares that the Above entered details is correct to the best of my Knlowleage ",true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,610,550,30);
        add(c7);

        JLabel l12=new JLabel("Form Number :");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(600,10,200,30);
        add(l12);


        JLabel formNumber=new JLabel(formNo);
        formNumber.setFont(new Font("Raleway",Font.BOLD,20));
        formNumber.setBounds(720,10,100,30);
        add(formNumber);

        submit=new JButton("Submit");
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,670,100,30);
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        add(submit);

        cancel=new JButton("Cancel");
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,670,100,30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        add(cancel);

        setLayout(null);
        setSize(850,750);
        setLocation(450,60);
        getContentPane().setBackground(new Color(56, 199, 177));//Color peaker


        setVisible(true);

    }
    public static void main(String[] args) {
        new signUp3(" ");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String aType=null;
        if(k1.isSelected()){
            aType="Saving Account";
        } else if (k2.isSelected()) {
            aType="Fix Deposit";
        }
        else if (k3.isSelected()) {
            aType=" Current Account";
        }
        else if (k4.isSelected()) {
            aType="Recurring Deposit Account";
        }

        Random ran=new Random();
        long firstSeven=(ran.nextLong()) %90000000 +1409963000000000L;
        String cardNo=""+Math.abs(firstSeven);
        long first3=(ran.nextLong()) %9000L + 1000L;

        String pin=""+Math.abs(first3);

        String sr=null;
        if(c1.isSelected()){
            sr+="ATM Card";
        } else if (c2.isSelected()) {
            sr+="Internet Banking";
        }else if (c3.isSelected()) {
            sr+="Mobile Banking";
        } else if (c4.isSelected()) {
            sr+="Email Alerts";
        }else if (c5.isSelected()) {
            sr+="Check Book";
        }else if (c6.isSelected()) {
            sr+="E-Statement";
        }

        try{
            if(e.getSource()==submit){
                if(aType.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the Fills");
                }else {
                    Conn c1=new Conn();
                    String q1="insert into signupthree values('"+formNo+"', '"+aType+"','"+cardNo+"','"+pin+"','"+sr+"')";
                    String q2="insert into login values('"+formNo+"','"+cardNo+"','"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number"+cardNo+"\n Pin :"+pin);
                    new Deposite(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == cancel) {
                System.exit(0);
            }

        }catch(Exception E3){
            E3.printStackTrace();
        }


    }
}

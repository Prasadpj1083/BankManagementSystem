package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.spec.ECField;
import java.sql.ResultSet;

public class loginPage extends JFrame implements ActionListener {
    public static void main(String[] args) {
            new loginPage();
    }

    JLabel lable1;
    JLabel label2;
    JLabel label3;

    JTextField textField;
    JPasswordField passwordField;

    JButton button1;
    JButton button2;
    JButton button3;

    loginPage(){
        super("Bank Management System");//This are print in the top of the Line This is project name.Its the top

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/Bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon j1=new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image j2=j1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon j3=new ImageIcon(j2);
        JLabel imageJ=new JLabel(j3);
        imageJ.setBounds(630,350,100,100);
        add(imageJ);



        lable1 =new JLabel("WELCOME TO ATM");
        lable1.setForeground(Color.WHITE);
        lable1.setFont(new Font("AvantGrade",Font.BOLD,38));
        lable1.setBounds(230,125,450,40);
        add(lable1);

        label2 =new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,80);
        add(label2);

        textField=new JTextField(15);
        textField.setBounds(325,220,230,30);
        textField.setFont(new Font("Arial",Font.BOLD,28));
        textField.addActionListener(this);
        add(textField);

        label3 =new JLabel("Pin :");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("Arial",Font.BOLD,28));
        label3.setBounds(150,255,375,80);
        add(label3);

        passwordField=new JPasswordField(14);
        passwordField.setBounds(325,285,230,30);
        passwordField.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField);


        button1=new JButton("Sign In");
        button1.setFont(new Font("Ariel",Font.BOLD,15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.black);
        button1.setBounds(280,350,100,30);
        button1.addActionListener(this);
        add(button1);

        button2=new JButton("CLEAR");
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.black);
        button2.setBounds(390,350,100,30);
        button2.setFont(new Font("Ariel",Font.BOLD,15));
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("Sign Up");
        button3.setFont(new Font("Ariel",Font.BOLD,15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.black);
        button3.setBounds(510,350,100,30);
        button3.addActionListener(this);
        add(button3);


        ImageIcon k1=new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image k2=k1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon k3=new ImageIcon(k2);
        JLabel imageK=new JLabel(k3);
        imageK.setBounds(0,0,850,480);
        add(imageK);


        setLayout(null);
        setSize(850,480);//This method use only frame defining but not visible then use visible to the frame visibility
        setLocation(450,200);//This Jframe are open in the middle level you can also set the size
        setVisible(true);//then pass the true then frame are the visible


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                Conn c=new Conn();
                String cardno =textField.getText();
                String pin = passwordField.getText();
                String q="select * from login where card_no = '"+cardno+"' and pin = '"+pin+"'";

//                create table login(form_No varchar(30),card_no varchar(50),pin varchar(30));
                ResultSet resultSet=c.statement.executeQuery(q);
                System.out.println("Checking if ResultSet has data...");
                try {
                    if (resultSet.next()) {
                        System.out.println("Login successful!");
                        setVisible(false);
                        new main_Class(pin);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN. Please try again.");
                    }
                }catch(Exception e4){
                    e4.printStackTrace();

                    }


            } else if (e.getSource() == button2) {
                textField.setText(" ");
                passwordField.setText("");

                
            } else if (e.getSource() == button3) {
                new SignUp();
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace(); //Any error can occur then show in Error prompt
        }


    }
}

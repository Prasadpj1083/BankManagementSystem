package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {
    JButton b1,b2;

    TextField textField;

    String pin;
    Deposite(String pin){

        this.pin=pin;
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2=imageIcon.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(i2);
        JLabel i3=new JLabel(imageIcon1);
        i3.setBounds(0,0,1550,830);
        add(i3);

        JLabel label1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT ");
        label1.setForeground(Color.WHITE);
        label1.setBounds(460,180,400,35);
        label1.setFont(new Font("System",Font.BOLD,16));
        i3.add(label1);
        textField=new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.white);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Rale way",Font.BOLD,22));
        i3.add(textField);

        b1=new JButton("Deposit");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        i3.add(b1);

        b2=new JButton("Back");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        i3.add(b2);



        setLayout(null);
        setSize(1550,1080);//Full screen
        setLocation(0,0);//Full Screen
        setVisible(true);
    }
    public static void main(String[] args) {
        new Deposite("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount= textField.getText();
            Date date=new Date();
            if(e.getSource() == b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please Enter the amount you want to deposit");

                }else {
                    Conn c=new Conn();
//                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit',''"+amount+"')");//MYcode
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");//Chatgbt
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+"Deposit Successfully");
                    setVisible(false);
                    new main_Class(pin);


                }

            }else if(e.getSource() == b2){
                setVisible(false);
                new main_Class(pin);
            }



        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}

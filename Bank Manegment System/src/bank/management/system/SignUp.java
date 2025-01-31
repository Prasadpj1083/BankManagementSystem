package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.print.attribute.standard.JobStateReasons;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {

    JTextField textName,textAddress,Pincode,lableState;
    JTextField lableCity;
    JTextField textFName;
    JTextField TextDob;
    JDateChooser dateChooser;
    JTextField textEmail;

    JRadioButton r1,r2,r3;
    JRadioButton MarrageStatusMarride,UnMarrageStatusMarride;
    JButton next;
    String formNo;

     Random random=new Random();
     long first4=(random.nextLong()% 9000L)+1000L;
     String first =" "+Math.abs(first4);




    SignUp() {
        super("Application Form");

        // Set layout to null for absolute positioning
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 100, 100);
        add(image);




        JLabel lable1=new JLabel("Application Form Number :"+first);
        lable1.setBounds(160,20,600,40);
        lable1.setFont(new Font("Ralway",Font.BOLD,38));
        getContentPane().setBackground(new Color(135, 206, 235));
        add(lable1);

        JLabel label2=new JLabel("Page 1:");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Detail:");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName=new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,22));
        labelName.setBounds(100,180,100,30);
        add(labelName);

        textName =new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(340,180,400,30);
        add(textName);

        JLabel labelFName=new JLabel("Father Name :");
        labelFName.setFont(new Font("Raleway",Font.BOLD,22));
        labelFName.setBounds(100,240,200,30);
        add(labelFName);

        textFName=new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(340,240,400,30);
        add(textFName);

        JLabel labalDOB=new JLabel("Date Of Birt :");
        labalDOB.setFont(new Font("Raleway",Font.BOLD,22));
        labalDOB.setBounds(100,300,300,30);
        add(labalDOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(340,300,400,30);
        add(dateChooser);

        JLabel LableGander=new JLabel("Gender :");
        LableGander.setFont(new Font("Raleway",Font.BOLD,22));
        LableGander.setBounds(100,350,200,30);
        add(LableGander);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(340,350,90,30);
        r1.setBackground(new Color(72, 209, 204));

        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(440,350,90,30);
        r2.setBackground(new Color(255, 182, 193));
        add(r2);

        r3=new JRadioButton("Other");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBounds(550,350,90,30);
        r3.setBackground(new Color(255, 153, 51));
        add(r3);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        JLabel lableAddress=new JLabel("Email Address :");
        lableAddress.setFont(new Font("Raleway",Font.BOLD,20));
        lableAddress.setBounds(100,400,200,30);
        add(lableAddress);

        textEmail=new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(340,400,400,30);
        add(textEmail);

        JLabel LableMarrageStatus=new JLabel("Marrage Status :");
        LableMarrageStatus.setFont(new Font("Raleway",Font.BOLD,20));
        LableMarrageStatus.setBounds(100,450,200,30);
        add(LableMarrageStatus);

        MarrageStatusMarride=new JRadioButton("Married");
        MarrageStatusMarride.setFont(new Font("Raleway",Font.BOLD,14));
        MarrageStatusMarride.setBounds(340,450,90,30);
        add(MarrageStatusMarride);

        UnMarrageStatusMarride=new JRadioButton("UnMarried");
        UnMarrageStatusMarride.setFont(new Font("Raleway",Font.BOLD,14));
        UnMarrageStatusMarride.setBounds(440,450,120,30);
        add(UnMarrageStatusMarride);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(MarrageStatusMarride);
        buttonGroup1.add(UnMarrageStatusMarride);

        JLabel lableAddress1=new JLabel("Address :");
        lableAddress1.setFont(new Font("Raleway",Font.BOLD,20));
        lableAddress1.setBounds(100,500,200,30);
        add(lableAddress1);

        textAddress=new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(340,500,400,30);
        add(textAddress);

        JLabel labelCity=new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setBounds(100,550,200,30);
        add(labelCity);

        lableCity=new JTextField();
        lableCity.setFont(new Font("Raleway",Font.BOLD,14));
        lableCity.setBounds(340,550,400,30);
        add(lableCity);

        JLabel labelPineCode=new JLabel("Pin Code :");
        labelPineCode.setFont(new Font("Raleway",Font.BOLD,20));
        labelPineCode.setBounds(100,600,200,30);
        add(labelPineCode);

        Pincode=new JTextField();
        Pincode.setFont(new Font("Raleway",Font.BOLD,14));
        Pincode.setBounds(340,600,400,30);
        add(Pincode);

        JLabel labelState=new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setBounds(100,650,200,30);
        add(labelState);

        lableState=new JTextField();
        lableState.setFont(new Font("Raleway",Font.BOLD,14));
        lableState.setBounds(340,650,400,30);
        add(lableState);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,700,80,30);
        next.addActionListener(this);
        add(next);


        // Frame size and location
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formNo=first;
        String formName=textName.getText();
        String fName=textFName.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();//Select date store in dob
        String gender=null;
        if(r1.isSelected()){
            gender="male";
        }else if(r2.isSelected()){
            gender="Female";
        }else if(r3.isSelected()){
            gender="Other";
        }
        String email=textEmail.getText();
        String marrage=null;
        if(MarrageStatusMarride.isSelected()){
            marrage="Married";
        }else{
            marrage="UnMarried";
        }
        String address=textAddress.getText();
        String city=lableCity.getText();
        String pinCode=Pincode.getText();
        String state=lableState.getText();

        try{
            if(textName.getText().equals(" ")){
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            }else{
                Conn conn=new Conn();
                String q = "insert into signup values ('" + formNo + "','" + formName + "','" + fName + "','" + dob + "','" + gender + "','" + email + "','" + marrage + "','" + address + "','" + city + "','" + pinCode + "','" + state + "')";

                conn.statement.executeUpdate(q); //Value Data table insert To use execute Update table values input
                new signUpConn(formNo);
                setVisible(false); //close the frame to use the visible method to close the frame to run smoothly
            }

        }catch (Exception E){
            E.printStackTrace();
        }





    }

}

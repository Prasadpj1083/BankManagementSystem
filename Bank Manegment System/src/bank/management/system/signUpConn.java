package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signUpConn extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JRadioButton r1,r2;
    JRadioButton e1,e2;
    JButton next;

    JTextField textPanNumber,textAddharNumber;
    String formNo;
    signUpConn(String formNo){
        super("Application Form:");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formNo=formNo;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,400,40);
        add(l1);

        JLabel l2=new JLabel("ADDITIONAL DETAIL");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,400,40);
        add(l2);

        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,140,400,40);
        add(l3);

        String religion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,145,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,200,400,40);
        add(l4);

        String category[]={"General","OBC","SC","ST","Other"};
        comboBox2=new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,205,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,260,400,40);
        add(l5);

        String income[] ={"0<10000","10000<500000","500000<10000","100000<More"};
        comboBox3=new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,265,320,30);
        add(comboBox3);

        JLabel l6=new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,320,400,40);
        add(l6);

        String education[] ={"Graduate","Post-Graduate","Doctor","Other"};
        comboBox4=new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,325,320,30);
        add(comboBox4);

        JLabel l7=new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,370,400,40);
        add(l7);

        String occupation[] ={"Salaried","Self-Employeed","Business","Student","Retired","Other"};
        comboBox5=new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,375,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("Pan Number :");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,420,400,40);
        add(l8);

        textPanNumber=new JTextField();
        textPanNumber.setFont(new Font("Raleway",Font.BOLD,14));
        textPanNumber.setBounds(350,420,400,30);
        add(textPanNumber);

        JLabel l9=new JLabel("AddharCard Number :");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,470,400,40);
        add(l9);

        textAddharNumber=new JTextField();
        textAddharNumber.setFont(new Font("Raleway",Font.BOLD,14));
        textAddharNumber.setBounds(350,470,400,30);
        add(textAddharNumber);

        JLabel l10=new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,520,400,40);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,520,70,40);
        add(r1);

        r2=new JRadioButton("NO");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(440,520,70,40);
        add(r2);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(r1);
        buttonGroup1.add(r2);

        JLabel l11=new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,560,400,40);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,560,70,40);
        add(e1);

        e2=new JRadioButton("NO");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(440,560,70,40);
        add(e2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(e1);
        buttonGroup.add(e2);

        JLabel l12=new JLabel("Form Number :");
        l12.setFont(new Font("Raleway",Font.BOLD,20));
        l12.setBounds(600,10,200,30);
        add(l12);

        JLabel formNumber=new JLabel(formNo);
        formNumber.setFont(new Font("Raleway",Font.BOLD,20));
        formNumber.setBounds(740,10,100,30);
        add(formNumber);

        next=new JButton("NEXT");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);






        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(211, 201, 19));//Color peaker


        setVisible(true);

    }



    public static void main(String[] args) {
        new signUpConn(" ");

    }

    public void actionPerformed(ActionEvent e) {
        // Retrieve selected items and input text
        String religion = (String) comboBox.getSelectedItem();
        String cat = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occu = (String) comboBox5.getSelectedItem();
        String pan = textPanNumber.getText();
        String adhar = textAddharNumber.getText();   // JComboBox for Occupation
        String pan1 = textPanNumber.getText();    // JTextField for PAN Number
        String adhar1 = textAddharNumber.getText(); // JTextField for Aadhar Number

        String sitizen = null;
        if (r1.isSelected()) {
            sitizen = "Yes";  // Assuming r1 is a radio button for Senior Citizen
        } else if (r2.isSelected()) {
            sitizen = "No";   // Assuming r2 is another radio button for Senior Citizen
        }

        String eAccount = null;
        if (e1.isSelected()) {
            eAccount = "Yes"; // Assuming r3 is a radio button for Existing Account
        } else if (e2.isSelected()) {
            eAccount = "No";  // Assuming r4 is another radio button for Existing Account
        }

        try {
            // Validate that all fields are filled
            if (pan.trim().isEmpty() || adhar.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                // Insert into the database
                Conn c1 = new Conn();
                String q = "INSERT INTO signUpConn (formNumber, Religion, Category, Income, Education, Occupation, PanNumber, AddharCardNumber, SenirCitizen, ExisitngAccount) " +
                        "VALUES ('" + formNo + "', '" + religion + "', '" + cat + "', '" + income + "', '" + edu + "', '" + occu + "', '" + pan1 + "', '" + adhar1 + "', '" + sitizen + "', '" + eAccount + "')";
                c1.statement.executeUpdate(q);

                // Show success message
                JOptionPane.showMessageDialog(null, "Data Inserted Successfully!");
                new signUp3(formNo); // Navigate to the next form
                setVisible(false);     // Close the current form
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}

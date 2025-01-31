package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton exitButton;

    mini(String pin) {
        this.pin = pin;
        setTitle("Mini Statement");
        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);
        getContentPane().setBackground(new Color(255, 204, 204));

        JLabel title = new JLabel("Mini Statement");
        title.setFont(new Font("System", Font.BOLD, 15));
        title.setBounds(150, 20, 200, 20);
        add(title);

        JLabel cardLabel = new JLabel();
        cardLabel.setBounds(20, 80, 300, 20);
        add(cardLabel);

        JLabel statementLabel = new JLabel();
        statementLabel.setBounds(20, 140, 400, 200);
        add(statementLabel);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 400, 300, 20);
        add(balanceLabel);

        try {
            Conn c = new Conn();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM login WHERE pin = '" + pin + "'");
            if (rs.next()) {
                cardLabel.setText("Card Number: " + rs.getString("card_no").substring(0, 4) +
                        "XXXXXXXX" + rs.getString("card_no").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;
            Conn c = new Conn();
            ResultSet rs = c.statement.executeQuery("SELECT * FROM bank WHERE pin_no = '" + pin + "'");

            StringBuilder transactions = new StringBuilder("<html>");
            while (rs.next()) {
                String date = rs.getString("date");
                String type = rs.getString("type");
                String amount = rs.getString("amount");

                transactions.append(date).append("&nbsp;&nbsp;&nbsp;")
                        .append(type).append("&nbsp;&nbsp;&nbsp;")
                        .append(amount).append("<br><br>");

                balance += type.equalsIgnoreCase("Deposit") ? Integer.parseInt(amount) : -Integer.parseInt(amount);
            }
            transactions.append("</html>");
            statementLabel.setText(transactions.toString());

            balanceLabel.setText("Your Total Balance is Rs " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        exitButton = new JButton("Exit");
        exitButton.setBounds(20, 500, 100, 25);
        exitButton.addActionListener(this);
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.WHITE);
        add(exitButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}

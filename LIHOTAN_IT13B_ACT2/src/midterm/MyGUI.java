/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm;

//import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author DH-PC
 */
public class MyGUI {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Login");

    JTextField jTextFieldUsername = new JTextField();
    JPasswordField jPasswordField = new JPasswordField();
    JLabel labelUsername = new JLabel("Username: ");
    JLabel labelPassword = new JLabel("Password: ");
    JButton jButtonLogin = new JButton("Login");
    
    myFrame.setBounds(600,300,400,250);
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    myFrame.setLayout(new GridLayout(3,2));
    myFrame.getContentPane().add(labelUsername);
    myFrame.getContentPane().add(jTextFieldUsername);
    myFrame.getContentPane().add(labelPassword);
    myFrame.getContentPane().add(jPasswordField);
    myFrame.getContentPane().add(jButtonLogin);
    
    jButtonLogin.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
        String username = jTextFieldUsername.getText();
        String password = new String(jPasswordField.getPassword());
        JOptionPane.showMessageDialog(myFrame, "Username: " + username + "\nPassword: " + password);
    }
    });
 myFrame.setVisible(true);
    }
}

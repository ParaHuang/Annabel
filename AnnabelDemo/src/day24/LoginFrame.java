package day24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//inheritance. 
//JFrame: the window in java
public class LoginFrame extends JFrame{
	public static void main(String[] args) {
		LoginFrame frame = new LoginFrame();
		frame.setVisible(true);
	}
	
	//constructor
	public LoginFrame() {
		setSize(500,400);
		setLocationRelativeTo(this);		//set window in the center of screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//set exit the program when you close the window
		
		//get the contentPane
		Container contentPane = getContentPane();
		//layout
		contentPane.setLayout(null);
		
		JButton loginBtn = new JButton("Login");
		//set up the size and location
		loginBtn.setBounds(130, 300, 100, 40);
		contentPane.add(loginBtn);
		
		JButton registerBtn = new JButton("Register");
		registerBtn.setBounds(270, 300, 100, 40);
		contentPane.add(registerBtn);
		
		Font contentFont = new Font("Comic Sans MS",Font.PLAIN,24);
		//JLabel
		JLabel title = new JLabel("Welcome Login");
		title.setBounds(70, 20, 360, 80);
		title.setFont(new Font("Comic Sans MS",Font.BOLD,50));
		title.setForeground(Color.MAGENTA);   //#ff00ff
		contentPane.add(title);
		
		JLabel account = new JLabel("Account:");
		account.setBounds(70, 130, 120, 30);
		account.setFont(contentFont);
		account.setForeground(Color.GRAY);
		contentPane.add(account);
		
		JLabel password = new JLabel("Password:");
		password.setBounds(70, 210, 120, 30);
		password.setFont(contentFont);
		password.setForeground(Color.GRAY);
		contentPane.add(password);
		
		JTextField accountBox = new JTextField();
		accountBox.setBounds(190, 123, 240, 45);
		accountBox.setFont(contentFont);
		contentPane.add(accountBox);
		
		JPasswordField passwordBox = new JPasswordField();
		passwordBox.setBounds(190, 203, 240, 45);
		passwordBox.setFont(contentFont);
		contentPane.add(passwordBox);	
		
		//account->admin, password->123			login successfully
		//invalid account or password
		//when you click on a button, it intriguer something -> ActionListener
		
		//keep listening on action	->	click
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// whatever you want to do when you click the button, you define it here
				// 1.get the text we inputed inside of text box
				String account = accountBox.getText();
				String password = passwordBox.getText();
//				System.out.println(account+"---"+password);
				// 2.compare them with admin,123
				if("admin".equals(account) && "123".equals(password)) {
					// 3.solution
//					System.out.println("login successfully");
//					JOptionPane.showMessageDialog(LoginFrame.this, "Login Successfully");
					//open MainFrame
					ColorFrame frame = new ColorFrame();
					frame.setVisible(true);
					dispose();		//close the current windowm
				}else {
					JOptionPane.showMessageDialog(LoginFrame.this, "invalid account or password");
				}
			}
		} );
		
		
		
	}
}

package day24;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

//inheritance. 
//JFrame: the window in java
public class MainFrame extends JFrame{
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
	
	//constructor
	public MainFrame() {
		setSize(500,400);
		setLocationRelativeTo(this);		//set window in the center of screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//set exit the program when you close the window
		
		//get the contentPane
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		//layout
//		contentPane.setLayout(new BorderLayout());//BorderLayout is a default layout
		
		JButton centerBtn = new JButton("center button");
		contentPane.add(centerBtn);
		
		JButton northBtn = new JButton("north button");
		contentPane.add(northBtn,BorderLayout.NORTH);
		
		JButton southBtn = new JButton("south button");
		contentPane.add(southBtn,BorderLayout.SOUTH);
		
		JButton eastBtn = new JButton("east");
		contentPane.add(eastBtn,BorderLayout.EAST);
		
		JButton westBtn = new JButton("west");
		contentPane.add(westBtn,BorderLayout.WEST);
	}
}

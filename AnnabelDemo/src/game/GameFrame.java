package game;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame{
	public static void main(String[] args) {
		new GameFrame();
	}
	
	public GameFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 700);
		setLocationRelativeTo(this);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		JLabel lbl = new JLabel(new ImageIcon("img/dinosaur.png"));
		lbl.setBounds(900, 550, 80, 80);
		contentPane.add(lbl);
//		JButton btn = new JButton(new ImageIcon("img/dinosaur.png"));
//		btn.setBounds(200, 550, 80, 80);
//		contentPane.add(btn);
//		JButton btn1 = new JButton(new ImageIcon("img/dinosaur.png"));
//		btn1.setBounds(400, 550, 80, 80);
//		contentPane.add(btn1);
		
		lbl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//move btn by direction key
				int code = e.getKeyCode();
//				System.out.println(code);
				//left:37 up:38 right:39 down:40
				int x = lbl.getX();	//the x of current position
				int y = lbl.getY();
				//go left
				if(code == 37) {
					lbl.setLocation(x-10, y);
				}
				//go right
				if(code == 39) {
					lbl.setLocation(x+10, y);
				}
				//go up
				if(code == 38) {
					lbl.setLocation(x, y-10);
				}
				//
				if(code == 40) {
					lbl.setLocation(x, y+10);
				}
			}
		});
				
		setVisible(true);
		//set focus after the window is visible
		lbl.requestFocus(true);
		
		/*
		//tap key: press down, lose it/up
		btn.addKeyListener(new KeyListener() {
			
			//when you press down a character key
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyTyped");
			}
			
			//when you lose a key
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyReleased");
			}

			//when a key is pressed down
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("keyPressed");
			}
		});
		*/
	}
}

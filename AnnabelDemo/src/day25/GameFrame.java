package day25;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GameFrame extends JFrame{
	public static void main(String[] args) {
		new GameFrame().setVisible(true);
	}
	
	Random random = new Random();
	int secretNumber;
	public GameFrame() {
		secretNumber = random.nextInt(1, 101);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,300);
		setLocationRelativeTo(this);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		Font font = new Font("Comic Sans MS", Font.PLAIN, 22);
		
		JLabel label = new JLabel("enter a number:");
		label.setBounds(30, 10, 170, 40);
		label.setFont(font);
		contentPane.add(label);
		
		JTextField numberBox = new JTextField();
		numberBox.setBounds(210, 10, 260, 40);
		numberBox.setFont(font);
		contentPane.add(numberBox);

		JButton guessBtn = new JButton("Guess");
		JButton restartBtn = new JButton("Restart");

		guessBtn.setBounds(80, 70, 160, 40);
		restartBtn.setBounds(260, 70, 160, 40);
		
		contentPane.add(guessBtn);
		contentPane.add(restartBtn);
		
		JLabel resultLabel = new JLabel();
		resultLabel.setBounds(50, 130, 450, 60);
		resultLabel.setFont(font);
		contentPane.add(resultLabel);
		
		guessBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//1.get the number out from text box
				String text = numberBox.getText();
				int guessNumber = Integer.parseInt(text);
				
				//2.compare this number with secret number
				//display the result of comparison
				if(guessNumber > secretNumber) {
//					JOptionPane.showMessageDialog(GameFrame.this, "too big");
					resultLabel.setText("too big");
					numberBox.requestFocus();
				}else if(guessNumber < secretNumber) {
//					JOptionPane.showMessageDialog(GameFrame.this, "too small");
					resultLabel.setText("too small");
					numberBox.requestFocus();
				}else {
//					JOptionPane.showMessageDialog(GameFrame.this, "congratulations! you guessed correctly");
					resultLabel.setText("");
					int option = JOptionPane.showConfirmDialog(GameFrame.this, 
							"congratulations! you guessed right.Do you want to restart the game","Please select",JOptionPane.YES_NO_OPTION);
//					System.out.println(option);
					if(option == 0) {
						//restart
						restartBtn.doClick();//click the button by code
					}
				}
			}
		});
		
		restartBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				secretNumber = random.nextInt(1, 101);
				JOptionPane.showMessageDialog(GameFrame.this, "you just set up a new secret number, have fun");
				numberBox.setText("");
				numberBox.requestFocus();
			}
		});
	}
}























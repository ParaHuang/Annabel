package day24;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorFrame extends JFrame{
	Color[] colors = {Color.RED,Color.YELLOW,Color.BLUE,Color.GREEN};
	public ColorFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(this);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		JButton redBtn = new JButton("red");
		JButton yellowBtn = new JButton("yellow");
		JButton blueBtn = new JButton("blue");
		JButton greenBtn = new JButton("green");

		contentPane.add(redBtn);
		contentPane.add(yellowBtn);
		contentPane.add(blueBtn);
		contentPane.add(greenBtn);

		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				contentPane.setBackground(Color.RED);
				String command = e.getActionCommand();
				int index = Integer.parseInt(command);
				contentPane.setBackground(colors[index]);
			}
		};
		
		//setActionCommand->set a mark
		redBtn.setActionCommand("0");
		yellowBtn.setActionCommand("1");
		blueBtn.setActionCommand("2");
		greenBtn.setActionCommand("3");
		
		redBtn.addActionListener(listener);
		yellowBtn.addActionListener(listener);
		blueBtn.addActionListener(listener);
		greenBtn.addActionListener(listener);
		
		
		
		/*
		redBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		yellowBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.YELLOW);
			}
		});
		blueBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.BLUE);
			}
		});
		greenBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		*/
	}
}

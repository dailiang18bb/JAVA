package test;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PlayGround_013 implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton("Click me");

	public static void main(String[] args) {
		PlayGround_013 test = new PlayGround_013();
		test.createFrame();
	}

	public void createFrame() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		frame.getContentPane().add(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		button.setText("I've been clicked");
	}

}

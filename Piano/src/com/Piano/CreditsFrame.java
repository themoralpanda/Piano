package com.Piano;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CreditsFrame extends PianoFrame {
    JPanel panel;
    JLabel name,title_message,main_message,main_message2,version,version_value,dedication ;
    
	public CreditsFrame(String title){
		super(title);
		
		Font f1 = new Font("Comic sans ms",Font.ITALIC,30);
		panel = new JPanel();
		title_message = new JLabel("Credits");
		main_message = new JLabel(" A simple music synthesizer ");
		main_message2 = new JLabel("to compose simple tunes for fun");
		version = new JLabel("Version - ");
		version_value = new JLabel("1.0");
		dedication = new JLabel("Dedicated to my fav A.R.RAHMAN ");
		name = new JLabel(" - Vicky :) :)");
		panel.setLayout(null);
		
		title_message.setBackground(Color.WHITE);
		title_message.setBounds(200,30 , 200, 100);
		title_message.setFont(f1);
		title_message.setForeground(Color.PINK);
		
		
		main_message.setBackground(Color.WHITE);
		main_message.setBounds(50,160 , 800, 50);
		main_message.setFont(f1);
		main_message.setForeground(Color.ORANGE);
		
		main_message2.setBackground(Color.WHITE);
		main_message2.setBounds(60,220 , 800, 50);
		main_message2.setFont(f1);
		main_message2.setForeground(Color.WHITE);
		
		version.setBackground(Color.WHITE);
		version.setBounds(200,300 , 200, 50);
		version.setFont(f1);
		version.setForeground(Color.WHITE);
		
		version_value.setBackground(Color.WHITE);
		version_value.setBounds(420,300 , 200, 50);
		version_value.setFont(f1);
		version_value.setForeground(Color.ORANGE);
		
		
		dedication.setBackground(Color.WHITE);
		dedication.setBounds(75,550 , 800, 50);
		dedication.setFont(f1);
		dedication.setForeground(Color.GREEN);
		
		name.setBackground(Color.WHITE);
		name.setBounds(300,400 , 200, 100);
		name.setFont(f1);
		name.setForeground(Color.RED);
		
		
		
		panel.setBackground(Color.BLACK);
		panel.add(title_message);
		panel.add(main_message);
		panel.add(main_message2);
		panel.add(version);
		panel.add(version_value);
		panel.add(dedication);
		panel.add(name);
		
		
		
		
		
		
		
		
		
		
		Container c = frame.getContentPane();
		c.add(panel);
		
		
		frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
		frame.setBackground(Color.BLACK);
		frame.setSize(650, 650);
		frame.setVisible(true);
	}
}

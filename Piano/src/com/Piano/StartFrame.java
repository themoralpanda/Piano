package com.Piano;
import java.awt.Container;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import org.jfugue.*;
class StartFrame extends PianoFrame{

	
	
	//components in the vertical bar
	JLabel title;
	JButton D,G,A;
	JButton C,E,F,B,C1,D1,G1,F1,A1;
	JButton record , play , credits;
	
	Box hrz1,hrz2;
	Box main_vert;
	JScrollPane jP;
	JTextArea jT;
	Player p;
	JPanel panel , record_panel;
	Font f1 ;
	
	StringBuilder pattern = new StringBuilder(" ");
	
	public StartFrame(String title){
		super(title);
	
		p= new Player();
		
		//first horizontal bar
		
		this.title = new JLabel("Vicky's - Piano");
		f1 = new Font("Georgia ",Font.BOLD,25);
		Font f = new Font("Comic sans ms",Font.BOLD,25);
		this.title.setFont(f);
		this.title.setBackground(new java.awt.Color(255,23,0));
		this.title.setForeground(new java.awt.Color(255	,0,0));
		
		
		
		record_panel = new JPanel();
		record_panel.setBackground(Color.BLACK);
		
		record = new JButton("Record");
		record.setBackground(Color.WHITE);
		record.setBounds(50, 200, 200, 50);
		record.setFont(f1);
		record.setForeground(new java.awt.Color(250,0,0));
		
		credits = new JButton("Credits");
		credits.setBackground(Color.WHITE);
		credits.setBounds(530, 200, 200, 50);
		credits.setFont(f1);
		credits.setForeground(new java.awt.Color(0,0,250));


		
		play = new JButton("Play");
		play.setBackground(Color.WHITE);
		play.setBounds(300, 200, 100, 50);
		play.setFont(f1);
		play.setForeground(new java.awt.Color(0,250,0));

		
		record_panel.setLayout(null);
		record_panel.add(record);
		record_panel.add(play);
	
		
	    
	   
		
		//crating first horizontal bar
		hrz1 = Box.createHorizontalBox();
		//adding components to first horiz bar
		hrz1.add(Box.createHorizontalStrut(20));
		hrz1.add(this.title);
		hrz1.add(Box.createHorizontalStrut(20));
		hrz1.add(this.record_panel);
		hrz1.add(Box.createHorizontalStrut(50));
		hrz1.add(this.credits);
		
		
		java.awt.Dimension  dimension = new java.awt.Dimension();
		dimension.height = 250;
		dimension.width = 50;
		panel = new JPanel();
		
		//second horizontal bar components
		
		Font f1 = new Font("Comic sans ms",Font.ITALIC,30);
		 
		
		//C = new EnterButton( 100,250,      50,3,  50,250  , 100,250,     100,100  ,  85,100   ,  85,3     );
		
		panel.setLayout(null);
		
		C = new JButton("C");
		C.setBackground(Color.WHITE);
		C.setBounds(50, 3, 50, 200);
		//C.setPreferredSize(dimension);
		
			C1 = new JButton("C#");
			C1.setBounds(85, 3, 30, 100);
			//C1.setPreferredSize(dimension);
			C1.setBackground(Color.BLACK);
			
		
		D = new JButton("D");
		D.setBounds(100, 3, 50, 200);
		//D.setPreferredSize(dimension);
		D.setBackground(Color.WHITE);
		
		
			D1 = new JButton("D#");
			D1.setBounds(135, 3, 30, 100);
		//	D1.setPreferredSize(dimension);
			D1.setBackground(Color.BLACK);
			
		E = new JButton("E");
		//E.setPreferredSize(dimension);
		E.setBackground(Color.WHITE);
		E.setBounds(150, 3, 50, 200);
		
		
		F = new JButton("F");
		//F.setPreferredSize(dimension);
		F.setBackground(Color.WHITE);
		F.setBounds(200, 3, 50, 200);
		
			F1 = new JButton("F#");
			F1.setBounds(235, 3, 30, 100);
			//F1.setPreferredSize(dimension);
			F1.setBackground(Color.BLACK);
		
		G = new JButton("G");
		//G.setPreferredSize(dimension);
		G.setBackground(Color.WHITE);
		G.setBounds(250, 3, 50, 200);
		
			G1 = new JButton("G#");
			G1.setBounds(285, 3, 30, 100);
			//G1.setPreferredSize(dimension);
			G1.setBackground(Color.BLACK);
			
		A = new JButton("A");
		//A.setPreferredSize(dimension);
		A.setBackground(Color.WHITE);
		A.setBounds(300, 3, 50, 200);
		
			A1 = new JButton("A#");
			A1.setBounds(335, 3, 30, 100);
			//A1.setPreferredSize(dimension);
			A1.setBackground(Color.BLACK);
			
		B = new JButton("B");
		//B.setPreferredSize(dimension);
		B.setBackground(Color.WHITE);
		B.setBounds(350, 3, 50, 200);
		
		
		panel.add(C);
		panel.add(C1);
		panel.add(D);
		panel.add(D1);
		panel.add(E);
		panel.add(F);
		panel.add(F1);
		panel.add(G);
		panel.add(G1);
		panel.add(A);
		panel.add(A1);
		panel.add(B);
		
	
	

		
		
		hrz2 = Box.createHorizontalBox();
		
		
		hrz2.add(panel);
		
		hrz2.setBorder(javax.swing.border.LineBorder.createBlackLineBorder());
		
		//vertical box in the outer layer
		main_vert = Box.createVerticalBox();
		main_vert.add(Box.createVerticalStrut(10));
		main_vert.add(hrz1);
		main_vert.add(Box.createVerticalStrut(100));
		main_vert.add(hrz2);
		main_vert.add(Box.createVerticalStrut(10));
		
		//action listeners for the buttons
		
		
		//record button action listeners
		record.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					pattern = new StringBuilder("");
					JOptionPane.showMessageDialog(frame.getContentPane(),"Recording started ! * start Composing  * ");
					//JOptionPane.showMessageDialog(frame.getContentPane(),pattern.to);
					
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});

		//play button action listeners
		play.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					if(pattern.toString().equalsIgnoreCase(" "))
						JOptionPane.showMessageDialog(frame.getContentPane(),"REcord your tune first buddy ! ");
					else
					{
					String temp = new String(pattern);
					p.play(temp);
				    Thread.sleep(3000);					
					JOptionPane.showMessageDialog(frame.getContentPane(),"* So how is the tune that you have just composed ?  * ");
					}
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});

		//credits button action listeners
		credits.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					CreditsFrame credits = new CreditsFrame("Credits");
					//credits.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					credits.setSize(800, 600);
					//credits.setVisible(true);
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		
		//C Button
		C.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					new NoteThread(new String("C"),p);
					pattern.append(C.getText());
					pattern.append(" ");
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//D button action.
		D.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					new NoteThread(new String("D"),p);
					pattern.append(D.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//E button action.
		E.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					new NoteThread(new String("E"),p);
					pattern.append(E.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});

		
		
		//F Button
		F.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					new NoteThread(new String("F"),p);
					pattern.append(F.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});

		//G Button
		G.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					new NoteThread(new String("G"),p);
					pattern.append(G.getText());
					pattern.append(" ");
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//A Button
		A.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					new NoteThread(new String("A"),p);
					pattern.append(A.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		//B Button
		B.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					new NoteThread(new String("B"),p);
					pattern.append(B.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		C1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					new NoteThread(new String("C#"),p);
					pattern.append(C1.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		D1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					new NoteThread(new String("D#"),p);
					pattern.append(D1.getText());
					pattern.append(" ");
					
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		F1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					new NoteThread(new String("F#"),p);
					pattern.append(F1.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		G1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					new NoteThread(new String("G#"),p);
					pattern.append(G1.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		A1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				try{
					
					new NoteThread(new String("A#"),p);
					pattern.append(A1.getText());
					pattern.append(" ");
				}
				catch(Exception e){
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		//container settings
		Container c = frame.getContentPane();
		c.setBackground(Color.BLACK);
		c.add(main_vert);
		frame.setVisible(true);
		frame.setSize(800, 600);
		
		
		
		
		
		
		
		
	}
}

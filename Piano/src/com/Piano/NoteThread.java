package com.Piano;

import org.jfugue.Player;


public class NoteThread extends Thread {
	String pattern;
	Player p;
	public NoteThread(String a ,Player p1){
		super("Thread - "+a);
		pattern = a;
		p = p1;
		start();	
	}
	
	public void run(){
		p.play(pattern);
	}
}

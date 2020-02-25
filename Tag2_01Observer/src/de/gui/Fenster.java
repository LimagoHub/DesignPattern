package de.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Fenster extends Frame{
	
	public Fenster() {
		setSize(300,300);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				beenden();
			}
		});
		Button button = new Button("Drück mich");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				beenden();
				
			}
		});
		add(button);
	}
	
	private void beenden() {
		// Code zum Sichern der Daten
		dispose();
	}

	public static void main(String[] args) {
		new Fenster().setVisible(true);;

	}

}

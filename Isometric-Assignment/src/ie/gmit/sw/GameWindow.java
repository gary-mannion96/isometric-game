package ie.gmit.sw;

import java.awt.*;
import javax.swing.*;

public class GameWindow {
	private static final int DEFAULT_SIZE = 1280;

	private GameView view;

/*	private int[][] model = { { 1, 0, 0, 0, 0, 0, 0, 0, 0, 2 }, { 0, 1, 0, 0, 0, 0, 0, 0, 0, 2 },
			{ 0, 0, 2, 0, 0, 0, 0, 0, 0, 2 }, { 0, 0, 0, 1, 0, 0, 0, 0, 0, 2 }, { 2, 2, 2, 2, 1, 0, 0, 0, 0, 2 },
			{ 3, 3, 3, 3, 1, 1, 1, 0, 0, 1 }, { 5, 5, 5, 5, 3, 3, 1, 0, 0, 1 }, { 4, 4, 4, 5, 3, 3, 1, 0, 0, 0 },
			{ 4, 4, 4, 4, 5, 3, 1, 6, 6, 6 }, { 4, 4, 4, 4, 4, 3, 1, 7, 7, 7 } };

	// This matrix is a representation of where objects (things) in the game are
	// placed
	private int[][] objects = { { 0, 0, 0, 5, 5, 5, 5, 5, 5, 0 }, { 5, 0, 0, 0, 5, 5, 5, 5, 5, 0 },
			{ 5, 5, 0, 0, 0, 5, 5, 5, 5, 9 }, { 5, 5, 2, 0, 0, 0, 5, 5, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 5, 5, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 5, 0 }, { 0, 0, 0, 0, 0, 3, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };*/

	public GameWindow() {
		
		try {
			
			view = new GameView();
			
			Dimension d = new Dimension(DEFAULT_SIZE, DEFAULT_SIZE/2);
		
			view.setPreferredSize(d);
			view.setMinimumSize(d);
			view.setMaximumSize(d);
	
			JFrame f = new JFrame();
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.getContentPane().setLayout(new FlowLayout());
			f.add(view);
			f.addKeyListener(view);
			f.setSize(1500, 1500);
			f.setLocation(50, 50);
			f.pack();
			f.setVisible(true);
			
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "User Interface Failed to Start", "Failed to Start", JOptionPane.ERROR_MESSAGE);
		}

	}
}
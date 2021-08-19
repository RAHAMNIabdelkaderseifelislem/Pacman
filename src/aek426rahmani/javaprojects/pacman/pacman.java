package aek426rahmani.javaprojects.pacman;

import javax.swing.JFrame;

public class pacman extends JFrame{

	public pacman() {
		add(new model());
	}
	
	
	public static void main(String[] args) {
		pacman pac = new pacman();
		pac.setVisible(true);
		pac.setTitle("Pacman");
		pac.setSize(380,420);
		pac.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pac.setLocationRelativeTo(null);
		
	}

}
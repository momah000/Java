import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

class Cell extends JButton {

    private static final int NUM_COLOURS = 3;

    private ImageIcon[] icons;
    private int type;

    public Cell() {
	ImageIcon[] icons;

	icons = new ImageIcon[NUM_COLOURS];
	for (int i=0; i<NUM_COLOURS; i++) {
	    icons[i] = new ImageIcon("data/ball-" + Integer.toString(type) + ".png");
	}
	
    	this.type = 0;
    	setBackground(Color.WHITE);
    	setIcon();
    	setBorderPainted(false);
    }

    private void setIcon() {
	setIcon(icons[type]);
    }

    public void update() {
    	type = type + 1;
    	setIcon();
    }
    
}

public class App extends JFrame implements ActionListener {

    private Cell myCell;
    
    public App() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	myCell = new Cell();
	myCell.addActionListener(this);
	add(myCell);
	pack();
	setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
	myCell.update();
    }
    
    public static void main(String[] args) {
	new App();
    }
    
}

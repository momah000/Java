import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphicalView extends JFrame implements View {
	private JLabel input;
	private Timer model;
	public GraphicalView (Timer model, Controller controller) {
		setLayout (new GridLayout(2, 3));
		this.model = model;
		Jbutton hoursPlus;
		hoursPlus= new JButton("Increment Hours");
		hoursPlus.addActionListener(controller);
		add(hoursPlus);
		Jbutton minutesPlus;
		minutesPlus= new JButton("Increment Minutes");
		minutesPlus.addActionListener(controller);
		add(minutesPlus);
		Jbutton secondPlus;
		secondPlus= new JButton("Increment Minutes");
		secondPlus.addActionListener(controller);
		add(secondPlus);
		input = new JLabel();
		add(input);
		
		//setup as well as a label (JLabel) that indicates the time. 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 100);

		//display the window
		setVisible(true);
	}
	public void update () {
	input.setText(model.toString());
}
}
  
Controller
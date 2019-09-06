import java.awt.event.*;

public class Controller implements ActionListener {
	
	private Timer model;
	
	private View[] views;
	private int numberOfViews;
	
	public Controller(){
	
		views = new View[2];
		numberOfViews = 0;
		model = new Timer() ;
		register(new GraphicalView(model, this));
		register(new TextView(model));
		update();
	}
	private void register(View view) {
		views[numberOfViews] = view;
		numberOfViews++;
	}
	private void update() {
		for (int i = 0; i < numberOfViews; i++) {
			views[i].update();
		}
	}
	
	public void actionPerformed ( ActionEvent e ) {
		if(e.getAction.command().equals("Increment Hours")){
			model.incrementHours();
		}
		else if(e.getAction.command().equals("Increment Minutes")){
			model.incrementMinutes();
		}
		else if(e.getAction.command().equals("Increment Seconds")){
			model.incrementSeconds();
		}
		else if(e.getAction.command().equals("Decrement Hours")){
			model.decrementHours();
		}
		else if(e.getAction.command().equals("Decrement Minutes")){
			model.decrementMinutes();
		}
		else if(e.getAction.command().equals("Decrement Seconds")){
			model.decrementSeconds();
		}
		
	
	    update();
	}
}
  

public class TurtleDrawings {

	public static void main(String[] args) {

		// ExampleTurtle t = new ExampleTurtle();
		
		// Pen p = new Pen();
		// t.setPen(p);

		// TurtleView view = new SwingTurtleView();
		// t.setView(view);

		// view.initialize();
		// t.draw();

		MyTurtle turtle = new MyTurtle();
		
		Pen p = new Pen();
		turtle.setPen(p);

		TurtleView view = new SwingTurtleView();
		turtle.setView(view);

		view.initialize();
		turtle.draw();

	} 


} 
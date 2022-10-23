import java.lang.Math;

public class MyTurtle extends BaseTurtle {
	public void draw() {

        this.setDelay(20);
        double max = 10;
        double min = 1;

        for (int i = 0; i < 360; i++) {
            pen.setRandomColor();
			this.moveTo(0, 0);
            this.line(Math.floor(Math.random()*(max-min+1)+min));
            this.turn(1);
        }

    }

    private void line(double size) {
        this.forward(size);
	}
}
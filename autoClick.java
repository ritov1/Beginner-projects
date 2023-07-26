import java.awt.*;
import java.awt.event.InputEvent;

public class autoClick {
	public static void main(String[] args) {
		while (true) {
			try {

				System.out.println("click");
				Robot r = new Robot();
				int button = InputEvent.BUTTON1_DOWN_MASK;
				r.mouseMove(500, 500);
				r.mousePress(button);
				r.mouseRelease(button);
				Thread.sleep(20000);

			} catch (InterruptedException e) {
				e.printStackTrace();

			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

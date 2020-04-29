import java.awt.Desktop;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

//C:\aatt\AATT\src\resume
public class Draganddrop {

	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		Desktop desktop = Desktop.getDesktop();
		File dirToOpen = null;
		try {
			// Wait(10000);
			dirToOpen = new File("C://aatt//AATT//src//resume");
			desktop.open(dirToOpen);


		} catch (IllegalArgumentException iae) {
			System.out.println("folder Not Found");
		}
		Thread.sleep(5000);

		System.out.println("started");
		Runtime.getRuntime().exec("C://Users//inkuppara//Desktop//AATT//Resume.exe");
		System.out.println("Completed");

	}
	


}

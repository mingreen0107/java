import javax.swing.*;

public class HelloWorldSwingg {

	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		JLabel label = new JLabel("Hello World");
		
		frame.getContentPane().add(label);
		frame.pack();
		frame.setVisible(true);
	}
}

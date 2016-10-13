//outputs hello world using GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HelloWorldGUI2 {
	private static class HelloWorldDisplay extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString( "Hello World!", 10, 10 );
		}
	}
	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		HelloWorldDisplay displayPanel = new HelloWorldDisplay();
		JButton okButton = new JButton("ENTER");
		ButtonHandler listener = new ButtonHandler();
		okButton.addActionListener(listener);
		JPanel content = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(displayPanel, BorderLayout.SOUTH);
		content.add(okButton,BorderLayout.NORTH);
		JFrame window = new JFrame("GUI Test");
		window.setContentPane(content);
		window.setSize(1920,500);
		window.setLocation(100,100);
		window.setVisible(true);
		System.out.print(okButton);
	}
}

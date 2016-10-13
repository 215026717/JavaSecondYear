//display a bar graph using GUI
import java.awt.*;
import javax.swing.*;
public class BarGraph extends JPanel{
		public void BarGraph(){
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D)g; 
			g2.setColor(Color.RED);
			g2.fillRect(10,getHeight()-20,100,20);
			g2.setColor(Color.BLUE);
			g2.fillRect(120,getHeight()-10,100,10);
			g2.setColor(Color.GREEN);
			g2.fillRect(230,getHeight()-30,100,30);
			g2.setColor(Color.ORANGE);
			g2.fillRect(340,getHeight()-40,100,40);
			g.setColor(Color.BLACK);
			g.drawString("Project -- 20%",340,getHeight()-50);	
			g.drawString("Midterms -- 30%",230,getHeight()-40);
			g.drawString("Quizzes -- 10%",120,getHeight()-20);
			g.drawString("Final -- 40%",10,getHeight()-30);
		}
	public static void main(String[] args){
		JFrame window = new JFrame();
		BarGraph content = new BarGraph();
		window.setContentPane(content);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(750,500);
		window.setVisible(true);
	}
}

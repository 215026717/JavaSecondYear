//a game where a player shoots at a moving balloon using GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BalloonGame extends JPanel implements KeyListener{
   private int x,y,xO,yO,posx,posy,c,z,a,sec,x1,y1;
   private double h,lh,lx,ly,shotx,shoty;
   public BalloonGame(){
      x = (int)(Math.random()*700);
      y = (int)(Math.random()*450);
      xO = 50;
      yO = 50;
      lh = 54/18;
      posx = -20;
      addKeyListener(this);
      setFocusable(true);
   }
   public void Shoot(){    
      if (y > 0)
         y -= 1;
      if ((-15 < posx && posx < getWidth()+5) && (-15 < posy && posy < getHeight()+5)){
         if (posy < (getHeight()-54)-ly){
            c = 10;
            z = 10;
         }
         posx -= shotx;
         posy -= shoty;
      }
      if (a == 0 && (((x < posx && posx < (x+50)) && (y < posy && posy < (y+50)))||((x < (posx+10) && (posx+10) < (x+50)) && (y < posy && posy < (y+50)))||(((x < (posx+10) && (posx+10) < (x+50)) && y < (posy+10) && (posy+10) < (y+50)))||((x < posx && posx < (x+50)) && (y < (posy+10)) && (posy+10) < (y+50)))){
         xO = x;            
         yO = y;
         x = (int)(Math.random()*700);
         y = (int)(Math.random()*450);
         a = 15;
         h += 1;
      }
         repaint();  
      if (!((0 < posx && posx < getWidth()) && (0 < posy && posy < getHeight()))){
         a = 0;
      }    
      } 
   public void Count(){
      sec += 1;
      if (sec > 67)
         System.exit(0);
   }
   public void paintComponent(Graphics g){
      super.paintComponent(g);
      Graphics2D g2 = (Graphics2D)g;
      g.drawString(String.format("Balloons Shot: %.0f",h), 0, 10);
      g.drawString(String.format("Timer: %d secs",sec), 0, 20);      
      g.drawOval(x,y,50,50);
      g.drawOval(xO-30,yO,a,a);
      g.drawOval(xO-10,yO+20,a,a);
      g.drawOval(xO+20,yO-10,a,a);
      g.drawOval(xO-30,yO-30,a,a);
      g2.setStroke(new BasicStroke(5));
      g2.drawLine((int)(getWidth()/2-lx),(int)((getHeight()-54)-ly),(int)getWidth()/2,getHeight());
      g.fillOval(posx,posy,c,z);
      if (sec >= 60){
         g.setFont(new Font("Arial", Font.BOLD + Font.PLAIN, 36));
         g.drawString("Game Over",(int)getWidth()/2-80,(int)getHeight()/2-30);
         g2.setFont(new Font("TimesNewRoman",Font.PLAIN,12));
         g2.drawString(String.format("You shot %.0f Balloons",h),(int)getWidth()/2-80,(int)getHeight()/2);
         posy = -100;         
      }
   }
   public void keyPressed(KeyEvent evt){
      int key = evt.getKeyCode();
      if (key == KeyEvent.VK_LEFT){
         lx += lh;
         if (ly <= 0 && lx > 0)
            ly -= lh;
         else
            ly += lh;
         repaint();
      }
      else if (key == KeyEvent.VK_RIGHT){
         if (ly < 0 && lx > 0)
            ly += lh;
         else
            ly -= lh;
         lx -= lh;
         repaint();         
      }
      else if (key == KeyEvent.VK_UP){
         c = 0;
         z = 0;
         a = 0;
         posx = (int)(getWidth()/2-5);
         posy = (int)(getHeight()-5);
         shotx = ((getWidth()/2) - (getWidth()/2-lx))/2;
         shoty = ((getHeight()) - ((getHeight()-54)-ly))/2;  
      }
   }
   public void keyReleased(KeyEvent evt){
   }
   public void keyTyped(KeyEvent evt){
   }
   private static class Shooter implements ActionListener{
      private BalloonGame balloon = new BalloonGame();
      public Shooter(BalloonGame balloon){
         this.balloon = balloon;
      }
      public void actionPerformed(ActionEvent e){
         balloon.Shoot();
      }
   }
   private static class Closer implements ActionListener{
      private BalloonGame balloon = new BalloonGame();
      public Closer(BalloonGame balloon){
         this.balloon = balloon;
      }
      public void actionPerformed(ActionEvent e){
         balloon.Count();
      }
   }
   public static void main(String[] args) {
   JFrame window = new JFrame();
   BalloonGame content = new BalloonGame();
   Shooter listener = new Shooter(content);
   Closer listener2 = new Closer(content);
   window.setContentPane(content);
   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   window.setLocation(120,70);
   Timer timer = new Timer(150, listener);
   Timer timer2 = new Timer(1000,listener2);
   timer.start();
   timer2.start();
   window.setSize(750,500);
   window.setVisible(true);
   }
}

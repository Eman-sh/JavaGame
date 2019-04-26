public class Test {
     public static void main(String[] args) {
        JFrame frame = new JFrame("Blacky Game");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        FirstGame game= new  FirstGame();
        frame.add(game);
        frame.setVisible(true);
        //frame.add(Blacky game)
 
GamePanel ا
 
package babies.game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
package babies.game;
import java.awt.Color;
import java.awt.Graphics;
public class FirstGame  extends GamePanel {
                 int n1 =0;
                 int n2 =0;
                 int n3 =0;
                 int n4 =0;
            @Override
            public void draw(Graphics g) {
                g.drawRect(n1, 40, 20, 10); 
        g.setColor(Color.blue);
        
        g.fillRect(80, n2, 20, 10); 
        g.setColor(Color.green);
        
        g.drawOval(n3, 50, 50, 70); 
        g.setColor(Color.yellow);
        
        g.fillOval(170, n4, 50, 50); 
        g.setColor(Color.red);
            }

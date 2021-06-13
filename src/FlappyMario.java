

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlappyMario extends JFrame {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JLabel pipe = new JLabel();
	JLabel Mariokart = new JLabel();
	public void run() {
		BufferedImage player = null;
		
		try {
			player = ImageIO.read(this.getClass().getResourceAsStream("MarioKart.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label.setIcon(new ImageIcon(player));
		BufferedImage pipe = null;
		try {
			pipe = ImageIO.read(this.getClass().getResourceAsStream("pipe.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		label.setIcon(new ImageIcon(pipe));

	frame.add(panel);	
	panel.add(label);
	frame.setVisible(true);
	frame.pack();
	
	}
}

package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	public BufferedImage image;

	ImageMorph(int x, int y, int width, int height) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.width=width;
		this.height=height;
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream("paris.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
//		g.setColor(Color.cyan);
//		g.fillRect(x, y, width, height);
		g.drawImage(image, x,y, width,height,null);
	}
	@Override
	public void update() {
		
	}
	
}
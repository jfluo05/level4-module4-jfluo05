package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{

	CirclePolymorph(int x, int y, int width, int height) {
		super(x, y);
		width=50;
		height=50;
		this.width=width;
		this.height=height;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, width, height);
	} 
	public void update(){
    
   	 int startX = 200;
	x=startX+(int)(10*Math.cos(counter));
	int startY = 200;
	y=startY+(int)(10*Math.sin(counter));
	
	counter +=Math.PI/32;
    }
	
}


package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

	public class MouseMorph extends Polymorph{

		MouseMorph(int x, int y, int width, int height) {
			super(x, y);
			// TODO Auto-generated constructor stub
			this.width=width;
			this.height=height;
		}
		@Override
		public void draw(Graphics g) {
			g.setColor(Color.red);
			g.fillRect(PolymorphWindow.currentX, PolymorphWindow.currentY, width, height);
		}
		
	}


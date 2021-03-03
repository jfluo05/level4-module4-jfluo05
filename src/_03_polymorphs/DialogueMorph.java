package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

	public class DialogueMorph extends Polymorph{

		DialogueMorph(int x, int y, int width, int height) {
			super(x, y);
			width=100;
			height=100;
			this.width=width;
			this.height=height;
		}

		@Override
		public void draw(Graphics g) {
			// TODO Auto-generated method stub
			g.setColor(Color.cyan);
			g.fillRect(x, y, width, height);
		}
		@Override
		public void update() {
			
		}
		
	}

import java.awt.Color;
import java.awt.Graphics;

import _03_polymorphs.Polymorph;

	public class DialogueMorph extends Polymorph{

		DialogueMorph(int x, int y, int width, int height) {
			super(x, y);
			width=50;
			height=50;
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

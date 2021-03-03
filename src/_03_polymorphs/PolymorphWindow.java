package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    Polymorph circlePoly;
    Polymorph mouseMorph;
    Polymorph imageMorph;
    Polymorph dialogueMorph;
    
    public static int currentX;
    public static int currentY;
    
    
    public static void main(String[] args) {
    	
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 window.addMouseMotionListener(this);
   	 window.addMouseListener(this);
		
		 
   	 circlePoly = new CirclePolymorph(50, 50, 50, 50);
   	 mouseMorph= new MouseMorph(60,60, 50, 50);
   	imageMorph= new ImageMorph(40,40, 50, 50);
   	dialogueMorph= new DialogueMorph(100,100, 50, 50);
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 circlePoly.draw(g);
   	mouseMorph.draw(g);
   	imageMorph.draw(g);
   	dialogueMorph.draw(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 circlePoly.update();
   	 mouseMorph.update();
  	imageMorph.update();
  	dialogueMorph.update();
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		currentX=e.getX();
		currentY=e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("clicked");
		//JOptionPane
		// TODO Auto-generated method stub
		if(e.getX()>100 && e.getX()<200 && e.getY()>100 && e.getY()<200) {
			System.out.println("herro");
			JOptionPane.showMessageDialog(null, "Hello!");
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

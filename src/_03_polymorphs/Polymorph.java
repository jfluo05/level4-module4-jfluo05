package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
   protected int x;
   protected int y;
   protected int width;
   protected int height;
   float counter=0;
   
	protected Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public void setX(int x){
        this.x=x; 
    }
    public void setY(int y){
        this.y=y; 
    }
    public void setWidth(int width){
        this.width=width; 
    }
    public void setHeight(int height){
        this.height=height; 
    }
    public void update(){
    	
    }
    
    public abstract void draw(Graphics g);
}

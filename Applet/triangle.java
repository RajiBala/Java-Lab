//to print circles in a triangle 
import java.applet.*;
 import java.awt.*; 
 /* <applet code = "triangle" width = 300 height = 300> </applet> */
 public class triangle extends Applet
 { 
	public void paint(Graphics g)
	{
	int i,j,x,y;
	int num =1;
	 y=10;
	 for(i=0;i<=1000;i++)
	 {
		 x=10;
		 for(j=0;j<=i;j++)
		 {
			 g.setColor (Color.yellow);
			 g.fillOval(x,y,50,50);
			 x=x+50;
			 
			 
		 }
		 y=y+50;
		 	
	
	
	
	
	}
	}
 }

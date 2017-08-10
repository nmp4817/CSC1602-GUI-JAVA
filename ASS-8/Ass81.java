/*1. Write a Java Program(Use Applets) to display a given string, in the specified colour & font.*/

import java.awt.*;
import java.applet.*;

/*
<applet code="Ass81.java" height=600 width=600>
</applet>
*/

public class Ass81 extends Applet
{
	Font f;

	public void init()
	{
		f=new Font("Arial",Font.BOLD,35);
		setBackground(Color.blue);
	}

	public void paint(Graphics g)
	{

		g.setFont(f);
		g.setColor(Color.red);
		g.drawString("HELLO WORLD",100,100);
	}
}
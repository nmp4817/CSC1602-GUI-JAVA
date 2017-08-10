import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Ass852 extends Applet
{
	TextArea t;
	
	public void init()
	{
		setLayout(null);
	  	t=new TextArea();
	  	t.setEditable(false);
		
	   	t.setBounds(30,70,500,200);
	   	add(t);
	   
	  }
}	  

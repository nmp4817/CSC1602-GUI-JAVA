/*5. Write a Java Program(Use Applets) to enter the data in the fields and
display it as a text on the screen in another applet.
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;

/*
<applet code="Ass851" Name="Input" width=800 height=800>
</applet>

<applet code="Ass852" Name="Output" width=600 height=500>
</applet>
*/

public class Ass851 extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField Name,Class,Marks;
	Button b;
	Font f;

	public void init()
	{        
		setLayout(null);

		f=new Font("ARIAL",Font.BOLD,30);
	
		l1=new Label("Name");
		l1.setBounds(200,50,200,30);
		l1.setFont(f);
		add(l1);

		l2=new Label("Class");
		l2.setBounds(200,100,200,30);
		l2.setFont(f);
		add(l2);

		l3=new Label("Marks");
		l3.setBounds(200,150,200,30);
		l3.setFont(f);
		add(l3);

		Name=new TextField();
		Name.setBounds(400,50,300,30);
		add(Name);
	
		Class=new TextField();
		Class.setBounds(400,100,300,30);
		add(Class);
	
		Marks=new TextField();
		Marks.setBounds(400,150,300,30);
		add(Marks);

		b=new Button("Open");
		b.setBounds(200,400,250,30);
		b.setBackground(Color.yellow);
		b.addActionListener(this);
		add(b);

		setBackground(Color.red);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();

		if(str.equals("Open"))
		{
			String s1=Name.getText();
			String s2=Class.getText();
			String s3=Marks.getText();

			try
  			 {
   				 AppletContext ac=getAppletContext();
				 Applet ap=ac.getApplet("Output");
				 TextArea t=(TextArea)ap.getComponentAt(31,71);
				 t.append(s1+"\n"+s2+"\n"+s3+"\n"); 
			 }
			catch(Exception e){}

			

			Name.setText("");
			Class.setText("");
			Marks.setText("");
		}
	}

}
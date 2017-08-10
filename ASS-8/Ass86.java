/*6. Write a Java Program (Use Applets & AWT class components)
to enter the data of student name, his class & marks.
There should be a list item which displays the list of all existing students and
two buttons, one which enables the user to save the data entered in entry fields and
second which enables the user to delete a record from the list */


import java.io.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="Ass86" width=800 height=600>
</applet>
*/

public class Ass86 extends Applet implements ActionListener
{
	Label name=null,cls=null,mark=null,list=null,error=null;
	TextField na=null,clas=null,marks=null;
	Button save=null,del=null,up=null;
	List ls;
	Font f;
	FileOutputStream fop=null;
	File file;

	public void init()
	{
		setLayout(null);
		Font f=new Font("Times New Roman",Font.PLAIN,15);
		
		error=new Label("");
		error.setBounds(70,300,100,25);
		error.setFont(f);

		name=new Label("Enter your name : ");
		name.setBounds(50,70,150,25);
		name.setFont(f);

		na=new TextField();
		na.setBounds(210,70,150,25);
		na.setFont(f);
	
		cls=new Label("Class : ");
		cls.setBounds(50,100,150,25);
		cls.setFont(f);
		
		clas=new TextField();
		clas.setBounds(210,100,150,25);
		clas.setFont(f);

		mark=new Label("Total Marks : ");
		mark.setBounds(50,130,150,25);
		mark.setFont(f);

		marks=new TextField();
		marks.setBounds(210,130,150,25);
		marks.setFont(f);

		save=new Button("Save");
		save.setBounds(120,250,70,25);
		save.setFont(f);
		
		del=new Button("Delete");
		del.setBounds(200,250,70,25);
		del.setFont(f);

		up=new Button("Update");
		up.setBounds(400,250,70,25);
		up.setFont(f);


		list=new Label("List of Students :");
		list.setBounds(50,160,150,25);
		list.setFont(f);
	
		ls=new List();
		ls.setBounds(210,160,150,70);
		ls.setFont(f);
		

		add(name);
		add(na);	
		add(cls);	
		add(clas);
		add(mark);	
		add(marks);
		add(save);
		add(del);
		add(list);
		add(ls);
		add(up); 
	
		save.addActionListener(this);
		del.addActionListener(this);
		up.addActionListener(this);
		ls.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		String s=ae.getActionCommand();
		String str=null;
		String data=null;

		if(s.equals("Save"))
		{
		       if (na.getText().equals("")||clas.getText().equals("")||marks.getText().equals(""))
		       {
	   			error.setText("Fill Completely");
				add(error);
				repaint();
			}
		       else
       		       {
				error.setVisible(false);
				data=name.getText();
				str=na.getText();
				ls.add(str);
				 
				data=" "+na.getText();
				data=data+"\n"+cls.getText()+" "+clas.getText()+"\n"+mark.getText()+" "+marks.getText();
				na.setText(" ");
				clas.setText(" ");
				marks.setText(" ");
	
			}
		}
		
		else if(s.equals("Delete"))
		{
			String t=ls.getSelectedItem();
			ls.remove(t);
		}

		else if(s.equals("Update"))
		{
			String t=ls.getSelectedItem();
			na.setText(t);
		}
			

	}

}
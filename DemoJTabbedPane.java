Develop a program to demonstrate tabbedpane in string.

import java.awt.*;
import javax.swing.*;

public class DemoJTabbedPane extends JApplet
{
	JTabbedPane jtp;
	JPanel p1,p2;
	JCheckBox  cb1,cb2;
	JButton b1,b2;
	
	public void init()
	{
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		jtp = new JTabbedPane();

		p1=new JPanel();
		cb1=new JCheckBox("Red");
		cb2=new JCheckBox("Blue");

		p1.add(cb1);
		p1.add(cb2);

		p2=new JPanel();
		b1=new JButton("Dhule");
		b2=new JButton("Pune");

		p2.add(b1);
		p2.add(b2);

		jtp.addTab("Color",p1);
		jtp.addTab("Citys",p2);
		c.add(jtp,BorderLayout.CENTER);
	}
}
/*<applet code="DemoJTabbedPane.class" height=800 width=800></applet>*/		
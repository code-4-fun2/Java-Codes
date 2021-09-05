import java.awt.*;
import java.applet.*;
public class DemoBorderLayout extends Applet
{
	Button b1,b2,b3,b4,b5;

	public void init()
	{
		BorderLayout b=new BorderLayout(20,10);
		this.setLayout(b);

		b1=new Button("TOP");
		b2=new Button("RIGHT");
		b3=new Button("BOTTOM");
		b4=new Button("LEFT");	
		b5=new Button("CENTER");

		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.EAST);
		add(b3,BorderLayout.SOUTH);
		add(b4,BorderLayout.WEST);
		add(b5,BorderLayout.CENTER);
		
		this.setVisible(true);
	}	

}/*<applet code="DemoBorderLayout.class" width=400 height=400 ></applet>*/
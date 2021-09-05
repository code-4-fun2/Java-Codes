import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class DemoItemEvent extends Applet implements ItemListener
{
	Checkbox cb1,cb2;
	Label l1,l2;

	public void init()
	{
		this.setLayout(null);

		cb1 = new Checkbox("Windows");
		cb2 = new Checkbox("Linux");
		l1 = new Label();
		l2 = new Label();

		add(cb1);
		add(cb2);	
		add(l1);
		add(l2);
	
		cb1.setBounds(50,100,100,30);
		cb2.setBounds(170,100,100,30);
		l1.setBounds(50,150,200,30);
		l2.setBounds(50,200,200,30);

		cb1.addItemListener(this);
		cb2.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==cb1)
		{
			l1.setText("Selected Checkbox: "+ cb1.getLabel());
			l2.setText("State:"+ cb1.getState());
		}
		else if(ie.getSource()==cb2)
		{
			l1.setText("Selected Checkbox: "+ cb2.getLabel());
			l2.setText("State:"+ cb2.getState());
		}
	}
}/*<applet code="DemoItemEvent.java" width=400 height=400></applet>*/
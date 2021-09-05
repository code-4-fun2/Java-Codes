import java.awt.*;
import java.applet.*;
public class DemoGridLayout extends Applet
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	public void init()
	{
		setLayout(new GridLayout(4,2,10,20));

		l1=new Label("Enter First Number");
		t1=new TextField(10);

		l2=new Label("Enter Second Number");
		t2=new TextField(10);

		l3=new Label("Result");
		t3=new TextField(10);

		b1=new Button("Add");
		b2=new Button("Sub");

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(b2);
	}
}
/*<applet code="DemoGridLayout.class" width=400 height=400></applet>*/
import java.awt.*;
import java.applet.*;
public class DemoCheckbox extends Applet
{
	Checkbox c1,c2,c3,c4;
	CheckboxGroup cbg;
	public void init()
	{
		c1=new Checkbox("Red");
		c2=new Checkbox("Blue");

		cbg=new CheckboxGroup();
		c3=new Checkbox("Male",true,cbg);
		c4=new Checkbox("Female",false,cbg);
		
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
}
/*<applet code="DemoCheckbox.class" width=400 height=400></applet>*/
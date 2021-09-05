import java.awt.*;
import javax.swing.*;
public class DemoJcomboBox extends JFrame
{
	JComboBox jc;
	DemoJcomboBox()
	{
		Container c = getContentPane();
		c.setLayout(null);

		jc=new JComboBox();
		jc.addItem("Red");
		jc.addItem("Green");
		jc.addItem("Blue");
		
		c.add(jc);
		jc.setBounds(50,100,100,40);
	}
	public static void main(String args[])
	{
		DemoJcomboBox d= new DemoJcomboBox();
		
		d.setTitle("Changing Colors");
		d.setVisible(true);
		d.setSize(300,300);
	}
}
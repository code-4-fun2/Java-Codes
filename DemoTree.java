import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class DemoTree extends JApplet
{
	DefaultMutableTreeNode rt,color,city,red,blue,dhule,pune;
	JScrollPane jsp;
	JTree jt;
	public void init()
	{
		Container c =getContentPane();
		c.setLayout(new BorderLayout());
		
		rt = new DefaultMutableTreeNode("Root");
		color = new DefaultMutableTreeNode("Colours");
		red = new DefaultMutableTreeNode("Red");
		blue = new DefaultMutableTreeNode("Blue");
		city = new DefaultMutableTreeNode("Cites");
		dhule = new DefaultMutableTreeNode("Dhule");
		pune = new DefaultMutableTreeNode("Pune");
		
		color.add(red);
		color.add(blue);
		
		city.add(dhule);
		city.add(pune);
		
		rt.add(color);
		rt.add(city);

		jt = new JTree(rt);
	
		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		jsp=new JScrollPane(jt,vsb,hsb);
		c.add(jsp,BorderLayout.WEST);
		
	}
}
/*<applet code="DemoTree.class" height=980 width=1080></applet>*/
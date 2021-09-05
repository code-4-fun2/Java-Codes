import java.awt.*;
import javax.swing.*;
public class DemoJTable extends JApplet
{
	JTable jt;
	JScrollPane jsp;
	public void init()
	{
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		
		String data[][]= {{"10","abc","CO"},
				  {"11","pqr","IT"},
				  {"12","xyz","CO"}};
		String colHeads[]= {"RollNo","Name","Branch"};

		jt = new JTable(data,colHeads);

		int vsb=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int hsb=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		jsp = new JScrollPane(jt,vsb,hsb);		

		c.add(jsp,BorderLayout.CENTER);
		c.setVisible(true);
	}
}/*<applet code="DemoJTable.java" width=400 height=400></applet>*/
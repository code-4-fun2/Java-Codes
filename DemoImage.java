import java.awt.*;
import javax.swing.*;
public class DemoImage extends JApplet
{
	JButton btn1;
	ImageIcon is1,is2,is3;
	
	public void init()
	{
		Container c = getContentPane();
		c.setLayout(null);

		is1 =new ImageIcon("img1.jpg");

		btn1=new JButton(is1);
		c.add(btn1);
		btn1.setBounds(0,0,1980,980);

		is2 =new ImageIcon("img2.jpg");
		is3 =new ImageIcon("img3.jpg");
			
		btn1.setRolloverIcon(is2);
		btn1.setPressedIcon(is3);

		this.setVisible(true);
	}
}/*<applet code="DemoImage.class" width=400 height=400></applet>*/
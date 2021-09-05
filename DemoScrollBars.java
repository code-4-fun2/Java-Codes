import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class DemoScrollBars extends Applet implements AdjustmentListener
{
	Scrollbar cbRed,cbGreen,cbBlue;

	public void init()
	{
		this.setLayout(null);

		cbRed = new Scrollbar(Scrollbar.VERTICAL,20,30,0,255);
		cbGreen = new Scrollbar(Scrollbar.VERTICAL,20,30,0,255);
		cbBlue = new Scrollbar(Scrollbar.VERTICAL,20,30,0,255);
	
		add(cbRed);
		add(cbGreen);
		add(cbBlue);

		cbRed.setBounds(50,50,100,200);
		cbGreen.setBounds(200,50,100,200);
		cbBlue.setBounds(350,50,100,200);

		this.setVisible(true);	

		cbRed.addAdjustmentListener(this);
		cbGreen.addAdjustmentListener(this);
		cbBlue.addAdjustmentListener(this);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		int r = cbRed.getValue();
		int g = cbGreen.getValue();
		int b = cbBlue.getValue();
	
		Color c = new Color(r,g,b);
		
		this.setBackground(c);
	}
}/*<applet code="DemoScrollBars.class" width=400 height=400></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class DemoSquare extends Applet implements ActionListener
{
	Label lblNum,lblRes;
	TextArea txtNum,txtRes;
	Button btnSq;

	public void init()
	{
		GridLayout g=new GridLayout(3,2,50,50);
		this.setLayout(g);
		
		lblNum=new Label("Enter Number :");
		txtNum=new TextArea("");
		
		lblRes=new Label("Output :");
		txtRes=new TextArea("");

		btnSq=new Button("Square");
		
		add(lblNum);
		add(txtNum);
		add(lblRes);
		add(txtRes);
		add(btnSq);
		
		btnSq.addActionListener(this);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		int num=Integer.parseInt(txtNum.getText());
		int res=num*num;
		txtRes.setText(""+res);
	}
}/*<applet code="DemoSquare.class" width=400 height=400></applet>*/
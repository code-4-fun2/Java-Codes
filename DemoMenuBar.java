import java.awt.*;
public class DemoMenuBar extends Frame
{
	MenuBar mb;
	Menu insert,home;
	MenuItem paste;
	CheckboxMenuItem picture;

	DemoMenuBar()
	{
		mb=new MenuBar();
		this.setMenuBar(mb);

		insert=new Menu("Insert");
		picture=new CheckboxMenuItem("picture",true);
		insert.add(picture);		

		home=new Menu("Home");
		paste=new MenuItem("Paste");
		home.add(paste);

		mb.add(insert);
		mb.add(home);
	}
	public static void main(String args[])
	{
		DemoMenuBar d = new DemoMenuBar();
		d.setVisible(true);
		d.setSize(300,300);
	}
}
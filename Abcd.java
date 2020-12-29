import java.awt.*;
import java.awt.event.*;
class Abcd extends Frame 
{
	Abcd()
	{
		setSize(300,300);
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("home");
		mb.add(m1);
		Menu m2=new Menu("option");
		MenuItem m3=new MenuItem("cut");
		MenuItem m4=new MenuItem("close");
		//Fr obj=new Fr();
		//obj.add(m4);
		m2.add(m3);
		m2.add(m4);
		mb.add(m2);
		addWindowListener(new Fr());
		setLayout(null);
		setVisible(true);
		setMenuBar(mb);
		
	}
	public static void main(String argd[])
	{
		new Abcd();
	}

}
class Fr extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{	
		
		Frame obj=new Frame();
		obj.dispose();
		System.out.print("closing");
		System.exit(0);
		
	}
}
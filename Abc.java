import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Abc extends JFrame 
{
	Abc()
	{
		setVisible(true);
		setSize(300,300);
		addWindowListener(new Fr());
	}
	public static void main(String args[])
	{
		new Abc();
	}

}
class Fr extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{	
		
		JFrame obj=new JFrame();
		obj.dispose();
		System.out.print("closing");
		System.exit(0);
		
	}
}
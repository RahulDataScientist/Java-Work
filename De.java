import java.awt.*;
import javax.swing.*;
// then we make class extended by frame
class De extends JFrame
{
	De()
	{	//To set the font size of Heading
		Font f=new Font("Serif",Font.BOLD,50);
		//Header is the Box where we place our Heading
		//first we take a panel for heading
		JPanel heading;
		heading =new JPanel();
		//for set Background color 50 % Transparent so we use (new Color(0,0,0,50) other wise we use Color.colorname
		heading.setBackground(new Color(0,0,0,50));
		
		heading.setBounds(0,0,900,100);
		JLabel name=new JLabel("Registration form");
		name.setForeground(Color.WHITE);
		name.setBounds(200,50,400,50);
		//we set the font of name
		name.setFont(f);
		//we add the name in heading
		heading.add(name);
		JTextField Username=new JTextField("Name");
		//set  bounds 
		Username.setBounds(50,50,300,50);
		////for set Background color   use (new Color(0,0,0) other wise we use Color.colorname
		Username.setBackground(new Color(210,180,140));
		JTextField Email=new JTextField("Email");
		//set  bounds 
		Email.setBounds(50,100,300,50);
		////for set Background color   use (new Color(0,0,0) other wise we use Color.colorname
		Email.setBackground(new Color(210,180,140));
		JTextField address=new JTextField("Address");
		//set  bounds 
		address.setBounds(50,150,300,50);
		////for set Background color   use (new Color(0,0,0) other wise we use Color.colorname
		address.setBackground(new Color(210,180,140));
				MenuBar mb=new MenuBar();
		Menu m1=new Menu("Gender");
		mb.add(m1);
		Menu m2=new Menu("date of birth");
		MenuItem m3=new MenuItem("cut");
		MenuItem m4=new MenuItem("close");
		//Fr obj=new Fr();
		//obj.add(m4);
		//mb.setBounds(50,200,300,50);
		m2.add(m3);
		m2.add(m4);
		mb.add(m2);
			setMenuBar(mb);
		setSize(900,600);
		setLayout(null);
		//to close the interface
		JPanel login=new JPanel();
		// we set layout for loggin pannel than we set bounds otherwise overriding
		login.setLayout(null);
		//we set the Size of login pannel
		login.setSize(600,400);
		//for set Background color 60 % Transparent so we use (new Color(0,0,0,60) other wise we use Color.colorname
		login.setBackground(new Color(0,0,0,60));
		login.setBounds(250,175,400,350);
		
		//Now we create two Text field one for user name and another for Password by the help JTextField class and JPasswordField class 
		//JTextField Username=new JTextField("Enter User Name");
		//set  bounds 
		Username.setBounds(50,50,300,50);
		////for set Background color   use (new Color(0,0,0) other wise we use Color.colorname
		Username.setBackground(new Color(210,180,140));
		login.add(Username);
		login.add(Email);
		login.add(address);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon background_image=new ImageIcon("Trr.jpg");
		
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(900,600,Image.SCALE_SMOOTH); 
		background_image=new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		//background.add(login);
		background.add(heading);
		
		background.setBounds(0,0,900,600);
		background.add(login);
		add(background);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new De();
	}
	
}

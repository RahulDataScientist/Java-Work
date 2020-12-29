//Create a user interface with passsword and login system
//first of  all import packages
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//import java.util.Exception;

// then we make class extended by frame
class Demos extends JFrame implements ActionListener 
{	JTextField Username;
	JPasswordField password;
	Demos()
	{	//To set the font size of Heading
		Font f=new Font("Serif",Font.BOLD,50);
		Font f3=new Font("Serif",Font.BOLD,20);
		//Header is the Box where we place our Heading
		//first we take a panel for heading
		JPanel heading;
		heading =new JPanel();
		//for set Background color 50 % Transparent so we use (new Color(0,0,0,50) other wise we use Color.colorname
		heading.setBackground(new Color(0,0,0,50));
		
		heading.setBounds(0,0,900,100);
		JLabel name=new JLabel("Data Collection and Managemet");
		//set foreground color means we set the color of font 
		name.setForeground(Color.WHITE);
		name.setBounds(200,50,400,50);
		//we set the font of name
		name.setFont(f);
		//we add the name in heading
		heading.add(name);
		//now we create login pannel
		JPanel login=new JPanel();
		// we set layout for loggin pannel than we set bounds otherwise overriding
		login.setLayout(null);
		//we set the Size of login pannel
		login.setSize(400,350);
		//for set Background color 60 % Transparent so we use (new Color(0,0,0,60) other wise we use Color.colorname
		login.setBackground(new Color(0,0,0,60));
		login.setBounds(250,175,400,350);
		JLabel jl=new JLabel("Username");
		jl.setForeground(Color.BLACK);
		jl.setBounds(50,15,150,50);
		jl.setFont(f3);
		login.add(jl);
		JLabel j3=new JLabel("Password");
		j3.setForeground(Color.BLACK);
		j3.setBounds(50,115,300,50);
		j3.setFont(f3);
		//
		login.add(j3);
		//N we create two Text field one for user name and another for Password by the help JTextField class and JPasswordField class 
		Username=new JTextField("");
		//set  bounds 
		Username.setBounds(50,50,300,50);
		////for set Background color   use (new Color(0,0,0) other wise we use Color.colorname
		Username.setBackground(new Color(210,180,140));
		login.add(Username);
		
		password=new JPasswordField("");
		password.setBackground(new Color(210,180,140));
		password.setForeground(Color.WHITE);
		password.setBounds(50,150,300,50);
		login.add(password);
		
		JButton Signup=new JButton("Signup");
		Signup.setBounds(50,250,100,50);
		Signup.setBackground(new Color(160,182,45));
		login.add(Signup);
		
		JButton login_button=new JButton("Login");
		login_button.setBounds(250,250,100,50);
		login_button.setBackground(new Color(160,182,45));
		login.add(login_button);
		login_button.addActionListener(this);
		//frame making
		setSize(900,600);
		setLayout(null);
		//to close the interface
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon background_image=new ImageIcon("rrr.jpg");
		
		Image img=background_image.getImage();
		Image temp_img=img.getScaledInstance(900,600,Image.SCALE_SMOOTH); 
		background_image=new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.CENTER);
		background.add(login);
		background.add(heading);
		
		background.setBounds(0,0,900,600);
		add(background);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) 
{
	String s=Username.getText();                                                                                                                  char[] p=password.getPassword();
	String pass=new String(p);
	System.out.println(s);
	System.out.println(p);
	if(s.equals("rahul") && pass.equals("12345"))
	{
		System.out.println("login");
	}
	else
	{
		System.out.println("not login");
		
	}		
	
}
	public static void main(String args[]) //throws Exception
	{
		new Demos();
	}
	
	
}


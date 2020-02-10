package Calculator;
import java.awt.*;
import java.awt.event.*;

public abstract class Calculator_App implements ActionListener {
	
	Frame f=new Frame();
	Label l1=new Label("First Number");
	Label l2=new Label("Second Number");
	Label l3=new Label("Result");
	Label l4=new Label("Calculator Application");
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	
	Button b1=new Button("Add");
	Button b2=new Button("Sub");
	Button b3=new Button("Mult");
	Button b4=new Button("Div");
	Button b5=new Button("Exit");
	Button b6=new Button("Clear");
	
	Calculator_App()
	{
		l1.setBounds(50,100,100,20);
		l2.setBounds(50,140,100,20);
		l3.setBounds(50,180,100,20);
		
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		
		b1.setBounds(30,250,50,20);
		b2.setBounds(90,250,50,20);
		b3.setBounds(150,250,50,20);
		b4.setBounds(210,250,50,20);
		b6.setBounds(270,250,50,20);
		b5.setBounds(330,250,50,20);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,350);
		f.setLocation(500,200);
		
		//closing the frame AWT
		f.addWindowListener(new WindowAdapter()
				{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
				});
	}
	
	public static void main(String args[])
	{
		new Operation();
		
	}
	
}

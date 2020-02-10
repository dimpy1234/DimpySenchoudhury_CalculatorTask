package Calculator;

import java.awt.event.ActionEvent;

public class Operation extends Calculator_App {
	public void actionPerformed(ActionEvent e)
	{
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		
		if(e.getSource()==b1)
		{
			t3.setText(String.valueOf(n1+n2));
			
		}
		if(e.getSource()==b2)
		{
			t3.setText(String.valueOf(n1-n2));
		}
		if(e.getSource()==b3)
		{
			t3.setText(String.valueOf(n1*n2));
		}
		if(e.getSource()==b4)
		{
			t3.setText(String.valueOf(n1/n2));
		}
		if(e.getSource()==b5)
		{
			System.exit(0);
		}
		if(e.getSource()==b6)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
		}
			
	}

}

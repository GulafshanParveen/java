import java.awt.*;

import java.awt.event.*;
public class Bgcolor extends Applet implements ActionListener
{
	Button redButton;
	public void Bgcolor(){
	redButton=new Button("Red");
	redButton.addActionListener(this);
	add (redButton);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
	setBackground(Color.red);
	repaint();
	}
	public static void main(String args[]){
	new Bgcolor();
	}
}

import java.awt.*;
import java.awt.event.*;
class AEvent extends Frame implements ActionListener{
	TextField tf;
	AEvent(){
	tf=new TextField();
	tf.setBounds(60,50,90,30);
	Button b=new Button("CLICK ME");
	b.setBounds(100,110,180,130);
	b.addActionListener(this);
	add(b);
	add(tf);
	setSize(300,300);
	setLayout(null);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
	tf.setText("WELCOME");
	System.exit(0);	
	}
	public static void main(String args[]){
	new AEvent();
	}
}

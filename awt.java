import java.awt.*;
import java.awt.event.*;
class awt extends Frame
{
	awt()
	{
	Frame f=new Frame("GULAFSHA");
	Label l=new Label();
	l.setBounds(70,70,250,20);
	Button b=new Button("GULAFSHAN");
	b.setBounds(100,100,80,50);
	setLayout(null);
	setVisible(true);
	setSize(800,800);
	add(b);
	}
	f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	});
	public static void main(String[] arg)
	{
	awt a1=new awt();
	}
}

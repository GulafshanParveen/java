import java.awt.*;
import java.awt.event.*;
public class FrameClosing4 extends Frame implements ActionListener
{
  public FrameClosing4()
  {
    setLayout(new FlowLayout());
    Button btn = new Button("OK");
    Button b2 = new Button("DONE");
    btn.setBounds(100,110,180,130);
    b2.setBounds(100,110,180,130);
    btn.addActionListener(this);
    add(btn);       
    add(b2);
    setTitle("Frame closing Style 4");
    setSize(500, 500);
    setVisible(true);
   }
   public void actionPerformed(ActionEvent e)
   {
     System.exit(0);
   }
   public static void main(String args[])
   {
     new FrameClosing4();
   }
}

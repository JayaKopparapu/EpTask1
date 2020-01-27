import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Add implements ActionListener
{
Frame f;
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3;
Add()
{
f=new Frame("addition");
l1=new Label("enter a value");
l2=new Label("enter b value");
l3=new Label("result");
t1=new TextField(10);
t2=new TextField(10);
t3=new TextField(10);
b1=new Button("add");
b2=new Button("reset");
b3=new Button("cancel");
f.add(l1);
f.add(t1);
f.add(l2);
f.add(t2);
f.add(l3);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
f.setVisible(true);
f.setLayout(new FlowLayout());
f.setSize(400,400);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource().equals(b1))
{
int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int c=a+b;
t3.setText(String.valueOf(c));
}
else if(ae.getSource().equals(b2))
{
t1.setText("");
t2.setText("");
t3.setText("");
}
else
f.setVisible(false);
}
public static void main(String...zx)
{
new Add();
}
}
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Bill
{
JFrame f;
JTabbedPane t;
Bill()
{
f=new JFrame("Billing centre");
f.setVisible(true);
f.setSize(400,400);
t=new JTabbedPane();
t.addTab("Welcome page",new Welcome());
t.addTab("current",new Current());
t.addTab("water",new Water());
t.addTab("internet",new Internet());
f.add(t);
}
public static void main(String...zx)
{
new Bill();
}
}
class Welcome extends JPanel
{
JLabel l1,l2;
Welcome()
{
setLayout(new FlowLayout());
setBackground(Color.pink);
//l1=new JLabel("welcome to Billing Center");
l2=new JLabel(new ImageIcon("bill.png"));
//add(l1);
add(l2);
}
}
class Current extends JPanel implements ActionListener
{
JPanel p;
JLabel l,l1,l2,l3,l4,l5,l6;
JTextField t,t1,t2,t3;
JButton b,b1;
int c,d,e,f;
Current()
{
//p=new JPanel();
setLayout(new FlowLayout());
setBackground(Color.cyan);
l=new JLabel("enter units");
l1=new JLabel("result");
l2=new JLabel("/-");
l3=new JLabel(new ImageIcon("bill1.png"));
l4=new JLabel(new ImageIcon("bill3.png"));
l5=new JLabel("HOUSEHOLDER NAME");
l6=new JLabel("Enter House Num");
t=new JTextField(10);
t1=new JTextField(10);
t2=new JTextField(10);
t3=new JTextField(10);
b=new JButton("find amount");
b1=new JButton("reset data");
add(l4);
add(l5);
add(t2);
add(l6);
add(t3);
add(l);
add(t);
add(b);
add(b1);
add(l1);
add(t1);
add(l2);
add(l3);
b.addActionListener(this);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource().equals(b))
{
int a=Integer.parseInt(t.getText());
//int b=t5.getText();
if(a<=50)
{
c=a*1;
t1.setText(String.valueOf(c));
}
else if(a>50&&a<=100)
{
d=50*1+(a-50)*2;
t1.setText(String.valueOf(d));
}			
else if(a>100&&a<150)
{
e=50*1+50*2+(a-100)*3;
t1.setText(String.valueOf(e));
}
else
{
f=50*1+50*2+50*3+(a-150)*4;
t1.setText(String.valueOf(f));
}
}
else
{
t.setText("");
t1.setText("");
t2.setText("");
t3.setText("");
}
}
}
class Water extends JPanel implements ActionListener
{
JPanel p;
JLabel l,l1,l2,l3;
JTextField t1,t2;
JButton b1,b2;
Water()
{
p=new JPanel();
setBackground(Color.magenta);
p.setLayout(new FlowLayout());
l=new JLabel("enter how many months");
l1=new JLabel(new ImageIcon("bill2.png"));
l2=new JLabel("amount is");
l3=new JLabel("/-");
b1=new JButton("find amount");
b2=new JButton("reset data");
t1=new JTextField(10);
t2=new JTextField(10);
p.add(l1,FlowLayout.LEFT);
p.add(l);
p.add(t1);
p.add(b1);
p.add(l2);
p.add(t2);
p.add(l3);
p.add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
add(p);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource().equals(b1))
{
int a=Integer.parseInt(t1.getText());
if(a==1)
{
int c=100*a;
t2.setText(String.valueOf(c));
}
else if(a==2)
{
int c=100*a;
t2.setText(String.valueOf(c));
}
else if(a==3)
{
int c=100*a;
t2.setText(String.valueOf(c));
}
else if(a==4)
{
int c=100*a;
t2.setText(String.valueOf(c));
}
else if(a==5)
{
int c=100*a;
t2.setText(String.valueOf(c));
}
else if(a==6)
{
int c=100*a;
t2.setText(String.valueOf(c));
}
else if(a==7)
{
JOptionPane.showMessageDialog(null,"ur are paying ur bill too late, fine of 500rs will be added to ur bill");
int c=100*a+500;
t2.setText(String.valueOf(c));
}
else if(a==8)
{
JOptionPane.showMessageDialog(null,"ur are paying ur bill too late, fine of 500rs will be added to ur bill");
int c=100*a+500;
t2.setText(String.valueOf(c));
}
else if(a==9)
{
JOptionPane.showMessageDialog(null,"ur are paying ur bill too late, fine of 500rs will be added to ur bill");
int c=100*a+500;
t2.setText(String.valueOf(c));
}
else if(a==10)
{
JOptionPane.showMessageDialog(null,"ur are paying ur bill too late, fine of 500rs will be added to ur bill");
int c=100*a+500;
t2.setText(String.valueOf(c));
}
else if(a==11)
{
JOptionPane.showMessageDialog(null,"ur are paying ur bill too late, fine of 500rs will be added to ur bill");
int c=100*a+500;
t2.setText(String.valueOf(c));
}
else if(a==12)
{
JOptionPane.showMessageDialog(null,"ur are paying ur bill too late, fine of 500rs will be added to ur bill");
int c=100*a+500;
t2.setText(String.valueOf(c));
}
else
{
JOptionPane.showMessageDialog(null,"month not found");
}
}
else 
{
t1.setText("");
t2.setText("");
}
}
}
class Internet extends JPanel implements ActionListener
{
JPanel p;
JLabel l,l1,l2,l3,l4,l5;
JTextField t2;
JButton b,b1;
JComboBox c,c1;
Internet()
{
//p=new JPanel();
setLayout(new FlowLayout());
setBackground(Color.orange);
l=new JLabel("choose ur plan");
l1=new JLabel("amount");
l2=new JLabel("/-");
l3=new JLabel(new ImageIcon("bill7.png"));
l4=new JLabel(new ImageIcon("bill6.png"));
l5=new JLabel(new ImageIcon("bill5.png"));
t2=new JTextField(10);
b=new JButton("reset data");
b1=new JButton("find amount");
c=new JComboBox();
c1=new JComboBox();
c.addItem("BSNL");
c.addItem("vodafone");
c.addItem("airtel");
c.addItem("idea");
c1.addItem("1 month");
c1.addItem("6 months");
c1.addItem("12 months");
add(l3);
add(c);
add(l);
add(c1);
add(b1);
add(l1);
add(t2);
add(l2);
add(b);
add(l4);
add(l5);
b.addActionListener(this);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String j=(String)c.getSelectedItem();
String j1=(String)c1.getSelectedItem();
if(ae.getSource().equals(b1))
{
if(j.equals("BSNL") && j1.equals("1 month"))
{
int x=222*1;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing BSNL data plan");
}
else if(j.equals("vodafone") && j1.equals("1 month"))
{
int x=199*1;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing VODAFONE data plan");
}
else if(j.equals("airtel") && j1.equals("1 month"))
{
int x=192*1;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing AIRTEL data plan");
}
else if(j.equals("idea") && j1.equals("1 month"))
{
int x=179*1;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing IDEA data plan");
}
else if(j.equals("BSNL") && j1.equals("6 months"))
{
int x=222*6-100;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing BSNL data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 100/- off on this data plan");
}
else if(j.equals("vodafone") && j1.equals("6 months"))
{
int x=199*6-50;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing VODAFONE data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 50/- off on this data plan");
}
else if(j.equals("airtel") && j1.equals("6 months"))
{
int x=192*6-75;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing AIRTEL data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 75/- off on this data plan");
}
else if(j.equals("idea") && j1.equals("6 months"))
{
int x=179*6-75;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing IDEA data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 75/- off on this data plan");
}
else if(j.equals("BSNL") && j1.equals("12 months"))
{
int x=222*12-500;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing BSNL data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 500/- off on this data plan");
}
else if(j.equals("vodafone") && j1.equals("12 months"))
{
int x=199*12-400;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing VODAFONE data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 400/- off on this data plan");
}
else if(j.equals("airtel") && j1.equals("12 months"))
{
int x=192*12-425;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing AIRTEL data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 425/- off on this data plan");
}
else if(j.equals("idea") && j1.equals("12 months"))
{
int x=179*12-375;
t2.setText(String.valueOf(x));
JOptionPane.showMessageDialog(null,"Thanks for choosing IDEA data plan");
JOptionPane.showMessageDialog(null,"congrats, u got 375/- off on this data plan");
}
}
else if(ae.getSource().equals(b))
{
t2.setText("");
}
}
}


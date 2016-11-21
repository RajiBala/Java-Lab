/*<applet code = "appjbutton.java" width = "320" height = "120">
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class appjbutton extends Applet implements ActionListener,TextListener
{

JTextField txtf,res;
Label l1,l3;
JButton get;
public void init()
{

txtf = new JTextField(10);
//txtf.addTextListener(this);

res = new JTextField(10); 
txtf.setText("ENTER");

res.setText("number of words in the text field");
setLayout(new GridLayout(0,2));
get = new JButton("get");
get.addActionListener(this);

add(txtf);

add(res);
add(get);
}
public void stop()
{
}
public void actionPerformed(ActionEvent a1)
{
if (a1.getSource()== get)
{
String s = (txtf.getText());
int a = s.length();
String x = String.valueOf(a);
res.setText(x);
repaint();
}
}
public void textValueChanged(TextEvent te)
{
}
}

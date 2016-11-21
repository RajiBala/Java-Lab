/*<applet code = "calculate.java" width = "320" height = "120">
</applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class calculate extends Applet implements ActionListener,TextListener
{
int sum,a,b;
TextField num1,num2,res;
Label l1,l2,l3;
Button calc;
public void init()
{
a=b=sum=0;
num1 = new TextField(10);
num1.addTextListener(this);
num2 = new TextField(10);
num2.addTextListener(this);
res = new TextField(10);
l1 = new Label("ENTER FIRST NUMBER");
l2 = new Label("ENTER SECOND NUMBER");
l3 = new Label("SUM");
setLayout(new GridLayout(0,2));
calc = new Button("CALCULATE");
calc.addActionListener(this);
add(l1);
add(num1);
add(l2);
add(num2);
add(l3);
add(res);
add(calc);
}
public void stop()
{
}
public void actionPerformed(ActionEvent a1)
{
if (a1.getActionCommand().equals("CALCULATE"))
{
a=Integer.parseInt(num1.getText());
b=Integer.parseInt(num2.getText());
int c = a+b;
String s=String.valueOf(c);
res.setText(s);
repaint();
}
}
public void textValueChanged(TextEvent te)
{
}
}



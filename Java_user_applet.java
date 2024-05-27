//add two number by user input
import java.applet.*;
import java.awt.*;
public class Java_user_applet extends Applet{
TextField t1,t2;
public void init(){
 //TextFields t1,t2;
 t1=new TextField(10);
 t2=new TextField(10);
add(t1);
add(t2);
}
public void paint(Graphics g){
int x=0,y=0,z=0;
String s1,s2,s;
try{
s1=t1.getText();
s2=t2.getText();
x=Integer.parseInt(s1);
y=Integer.parseInt(s2);}
catch(Exception ex){}
z=x+y;
s=String.valueOf(z);
g.drawString(s,100,200);
}
public boolean action(Event e,Object o){repaint();
return true;}
}
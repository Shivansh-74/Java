import java.applet.*;
import java.awt.*;
public class Java_Applet extends Applet{
String s;
public void init(){
 s=getParameter("String");
}
public void paint(Graphics g){
g.drawString(s,100,200);
}
}
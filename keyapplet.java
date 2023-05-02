import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class key extends Applet implements KeyListener{

int x=20;
int y=30;
String msg=" ";

public void init()
{
addKeyListener(this);
requestfocus();
}

public void keyPressed(KeyEvent k)
{
showStatus("Key pressed");
msg="Key pressed";
repaint();
}

public void keyReleased(KeyEvent k)
{
showStatus("Key up");
msg="Key up";
repaint();
}

public void keyTyped(KeyEvent k)
{
showStatus("Key typed");
msg="Key typed";
repaint();
}

public void paint(Graphics g)
{
g.drawString(msg.x,y);
}

}
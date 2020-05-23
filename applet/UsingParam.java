import java.applet.Applet;
import java.awt.*;
/*
    <applet code="UsingParam" width="300" height="200">
        <param name="site" value="mysirG.com" />
    </applet>
 */
 public class UsingParam extends Applet{
    private String defaultMessage = "hello";

    public void paint(Graphics g){
        String s1 = getParameter("site");
        if(s1 == null)
            s1 = defaultMessage;
        g.drawString(s1, 50, 25);
    }
 }
/*
* File Name: Text.java
* Assignment: Lab 6 Exercise A and B
* Lab Section: B01
* Completed by: Max Enns
* Submission Date: November 4th, 2024
*/

import java.awt.*;

public class Text implements Component{
    protected int x;
    protected int y;
    protected String text;

    public Test(String s, int a, int b){
        text = s;
        x = a;
        y = b;

    }

    @Override
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawString(text, x, y);

    }


}

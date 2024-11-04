/*
* File Name: BorderDecorator.java
* Assignment: Lab 6 Exercise A and B
* Lab Section: B01
* Completed by: Max Enns
* Submission Date: November 4th, 2024
*/

import java.awt.*;


public class BorderDecorator extends Decorator {

    public BorderDecorator(Component cmp, int a, int b, int h, int w){
        comp = cmp;
        x = a;
        y = b;
        height = h;
        width = w;
    }

    @Override
    public void draw(Graphics g){
        super.draw(g);
        Graphics2D g2d = (Graphics2D) g;
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        g2d.setStroke(dashed);
        g.drawRect(x,y,width,height);

    }

}

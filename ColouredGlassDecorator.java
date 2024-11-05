/*
* File Name: ColouredGlassDecorator.java
* Assignment: Lab 6 Exercise B
* Lab Section: B01
* Completed by: Max Enns
* Submission Date: November 4th, 2024
*/

import java.awt.*;
public class ColouredGlassDecorator extends Decorator {


    public ColouredGlassDecorator(Component c, int x, int y, int width, int height) {
        comp = c;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        
        super.draw(g);
        Graphics2D g2d = (Graphics2D) g; 
        g2d.setColor(Color.green); 
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 * 0.1f)); 
        g2d.fillRect(x,  y,  width,  height);
    }

}
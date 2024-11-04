/*
* File Name: Decorator.java
* Assignment: Lab 6 Exercise A and B
* Lab Section: B01
* Completed by: Max Enns
* Submission Date: November 4th, 2024
*/

import java.awt.*;



public class Decorator {
    protected Component comp;
    protected int x;
    protected int y;
    protected int width;
    public int height;

       @Override
    public void draw(Graphics g) {
        if (cmp != null) {
            cmp.draw(g);
        }
    }

}
package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Ball {
    int x = 250;
    int y = 250;
    int dx = 1;
    int dy = 1;

    public void draw(PApplet pApplet)
    {
        x = x + dx;
        y = y + dy;

        pApplet.stroke(255);
        pApplet.strokeWeight(10);
        pApplet.point(x, y);
    }
}

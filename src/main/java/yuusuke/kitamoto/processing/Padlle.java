package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Padlle implements Syoutotu{
    int x = 255;
    int y = 450;
    int w = 30;
    int h = 10;

    public void draw(PApplet pApplet) {
        if(pApplet.keyPressed){
            System.out.println(pApplet.keyCode);
            if(pApplet.keyCode ==39) x = x + 1;
            if(pApplet.keyCode ==37) x = x + 1;
        }

        pApplet.noStroke();
        pApplet.stroke(255);
        pApplet.rect(x,y,w,h);
    }

    @Override
    public boolean li(int x, int y) {
        return false;
    }

    @Override
    public void onAction(int x, int y) {

    }
}

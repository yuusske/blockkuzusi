package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Padlle {
    int x = 10;
    int y = 10;

    public void draw(PApplet pApplet) {
        if(pApplet.keyPressed){
            System.out.println(pApplet.keyCode);
            if(pApplet.keyCode ==39) x = x + 1;
            if(pApplet.keyCode ==37) x = x + 1;
        }

        pApplet.rect(250, 450,30,10);
    }
}

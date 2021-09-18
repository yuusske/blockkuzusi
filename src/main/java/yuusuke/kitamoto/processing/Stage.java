package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Stage {
    Ball ball;
    Padlle padlle;

    public Stage(){
        ball = new Ball();
        padlle = new Padlle();
    }

    public void draw(PApplet pApplet){

        ball.draw(pApplet);
        padlle.draw(pApplet);
    }
}

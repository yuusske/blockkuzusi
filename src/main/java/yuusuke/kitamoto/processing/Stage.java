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
        if(padlle.isHit(ball.x, ball.y)){
            ball.onAction(padlle.px, padlle.py);
        }

        pApplet.clear();
        pApplet.background(125);
        ball.draw(pApplet);
        padlle.draw(pApplet);
    }
}

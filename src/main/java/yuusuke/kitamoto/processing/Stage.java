package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Stage {
    Ball ball;
    Padlle padlle;
    Block[] block = new Block[3];

    public Stage(){
        ball = new Ball();
        padlle = new Padlle();


        block = new Block(100, 100);
    }

    public void draw(PApplet pApplet){
        if(padlle.isHit(ball.x, ball.y)){
            ball.onAction(padlle.px, padlle.py);
        }

        pApplet.clear();
        pApplet.background(125);

        block.draw(pApplet);
        ball.draw(pApplet);
        padlle.draw(pApplet);
    }
}

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

        int bx = ball.x;
        int by = ball.y;

        int px = padlle.x;
        int py = padlle.y;
        int pw = padlle.w;
        int ph = padlle.h;

        if( px < bx  && bx < (px+pw) ){
            if( py < by && by < (py+ph)){
                //あたり！
                ball.dy = ball.dy * -1;
            }
        }



        pApplet.clear();
        pApplet.background(125);
        ball.draw(pApplet);
        padlle.draw(pApplet);
    }
}

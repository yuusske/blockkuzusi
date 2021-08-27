package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Stage {
    Ball ball;
    Padlle padlle;

    public Stage(){
        ball = new Ball();
        padlle = new Padlle();
    }

    public void draw (Main main){

        ball.draw();
        padlle.draw(main);
    }

    public void draw() {
    }
}

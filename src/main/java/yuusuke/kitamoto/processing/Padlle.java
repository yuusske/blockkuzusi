package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Padlle implements ShouTotu {
    int px = 255;
    int py = 450;
    int pw = 30;
    int ph = 10;

    public void draw(PApplet pApplet) {
        if(pApplet.keyPressed){
            System.out.println(pApplet.keyCode);
            if(pApplet.keyCode ==39) px = px + 5;
            if(pApplet.keyCode ==37) px = px - 5;
        }

        pApplet.noStroke();
        pApplet.stroke(255);
        pApplet.rect(px,py,pw,ph);
    }

    @Override
    public boolean isHit(int bx, int by) {
        if( px < bx  && bx < (px+pw) ){
            if( py < by && by < (py+ph)){
                //あたり！
                return true;
            }
        }
        return false;
    }

    @Override
    public void onAction(int x, int y) {

    }
}

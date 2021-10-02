package yuusuke.kitamoto.processing;

import processing.core.PApplet;

public class Block implements ShouTotu {
    int bx;
    int by;
    int bw = 25;
    int bh = 5;

    public Block(int x, int y){
        bx = x;
        by = y;
    }

    public void draw(PApplet pApplet) {

        pApplet.noStroke();
        pApplet.stroke(255);
        pApplet.rect(bx,by,bw,bh);
    }

    @Override
    public boolean isHit(int x, int y) {
        if( bx < x  && x < (bx+bw) ){
            if( by < y && y < (by+bh)){
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

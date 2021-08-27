package yuusuke.kitamoto.processing;

import processing.core.PApplet;
public class Main extends PApplet {
    public int keycode;
    Stage stage;

    @Override
    public void settings(){
        size(500,500);
    }



    @Override
    public void setup() {
        super.setup();

        stage = new Stage();
    }

    @Override
    public void draw() {
        stage.draw();
        rect(10, 100, 150, 200);
    }
    public static void main(String[] args) {
        PApplet.main(Main.class);
    }
}
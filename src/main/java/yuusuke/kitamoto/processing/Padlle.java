package yuusuke.kitamoto.processing;

public class Padlle {
    int x = 10;
    int y = 10;

    public void draw(Main main) {
        if(main.keyPressed){
            System.out.println(main.keycode);
            if(main.keyCode ==39) x = x + 1;
            if(main.keyCode ==37) x = x + 1;
        }

        main.rect(10,10,10,5);
    }
}

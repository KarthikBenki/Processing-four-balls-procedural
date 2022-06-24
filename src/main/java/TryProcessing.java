import processing.core.PApplet;


public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    private int[] ball_x= new int[4];


    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }


    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);///refactorings ctrl+alt+c //extract constant
    }

    @Override
    public void setup() {//initializes
    }

    @Override
    public void draw() {//updation
//        paintWhite();
        drawCircle();

    }

    private void drawCircle() {
        ellipse(ball_x[0], HEIGHT/5, DIAMETER, DIAMETER);
        ellipse( ball_x[1], HEIGHT/5*2, DIAMETER, DIAMETER);
        ellipse(ball_x[2], HEIGHT/5*3, DIAMETER, DIAMETER);
        ellipse(ball_x[3], HEIGHT/5*4, DIAMETER, DIAMETER);
        getBallSpeed();

    }

    private void getBallSpeed() {
        ball_x[0]+=1;
        ball_x[1]+=2;
        ball_x[2]+=3;
        ball_x[3]+=4;
    }

    private void paintWhite() {
        background(255);
    }
}

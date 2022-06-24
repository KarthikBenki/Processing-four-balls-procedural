import processing.core.PApplet;


public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int VERTICAL_BALL_POS = HEIGHT / 5;
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
        drawCircle();

    }

    private void drawCircle() {
        for (int i = 1; i <= ball_x.length; i++) {
            getBalls(i);
        }
        getBallSpeed();
    }

    private void getBalls(int i) {
        ellipse(ball_x[i -1], VERTICAL_BALL_POS * i, DIAMETER, DIAMETER);
    }

    private void getBallSpeed() {
        ball_x[0]+=1;
        ball_x[1]+=2;
        ball_x[2]+=3;
        ball_x[3]+=4;
    }

}

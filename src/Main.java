public class Main {
    public static void main(String[] args) {
        PacMan biba = new PacMan();
        PacMan boba = new PacMan();
        biba.x = 6;
        biba.y = 12;
        biba.health = 45.6;
        boba.x = 25;
        boba.y = 32;
        boba.say("привет");
        biba.say("пока");
        boba.health = boba.kvad(biba.health);
        System.out.println(boba.health);
    }
}

class PacMan{
    int x, y;
    double health;

    void say(String s){
        System.out.println(s);
    }

    double kvad(double x){
        double y = x*x;
        return y;
    }
}
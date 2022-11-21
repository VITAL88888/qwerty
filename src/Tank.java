public class Tank {
    static final String MODEL = "T34";
    static int ntanks;

    int x,
            y;
    int fuel;
    int dir;


    public Tank(int x, int y, int fuel) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
    }

    public Tank() {
        x = 0;
        y = 0;
        fuel = 100;

    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }


    public void goForward(int i) {
        dir = 0;
        move(i);
    }

    public void goBackward(int i) {
        dir = 2;
        move(i);


    }

    private void move(int i) {
        i = checkFuel(i);
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }

    private int checkFuel(int i) {
        if (Math.abs(i) > fuel) {
            i = i >= 0 ? fuel : fuel * (-1);
        }
        fuel -= Math.abs(i);
        return i;
    }

    public void printPosition() {
        System.out.println(String.format("The Tank is at %d, %d now.", x, y));
    }
}

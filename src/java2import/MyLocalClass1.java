package java2import;

public class MyLocalClass1 {
    int x;
    String y;

    public MyLocalClass1() {
        this.x = 0;
        this.y = "recompile me";
    }

    public MyLocalClass1(int x, String y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public String getY() {
        return y;
    }
}

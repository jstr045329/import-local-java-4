// If this looks a lot like MyLocalClass1, you're right.
// The sole purpose of this file is to show that source/repl can import more than 1 file.
package java2import;

public class MyLocalClass2 {
    int x;
    String y;

    public MyLocalClass2() {
        this.x = 0;
        this.y = "recompile me";
    }

    public MyLocalClass2(int x, String y) {
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

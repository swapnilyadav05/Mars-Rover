package mars.rover.models;

public class Plateau {
    private int topX;
    private int topY;
    private int bottomX = 0;
    private int bottomY = 0;

    public Plateau(int topX, int topY) {
        this.topX = topX;
        this.topY = topY;
    }

    public int getTopX() {
        return topX;
    }

    public void setTopX(int topX) {
        this.topX = topX;
    }

    public int getTopY() {
        return topY;
    }

    public void setTopY(int topY) {
        this.topY = topY;
    }

    public int getBottomX() {
        return bottomX;
    }

    public void setBottomX(int bottomX) {
        this.bottomX = bottomX;
    }

    public int getBottomY() {
        return bottomY;
    }

    public void setBottomY(int bottomY) {
        this.bottomY = bottomY;
    }
}

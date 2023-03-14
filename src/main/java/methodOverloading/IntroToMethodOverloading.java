package methodOverloading;

public class IntroToMethodOverloading {
    /*
    method names must be unique. We cannot have two or more method to use the same name
     */
    public int getAreaOfRectangle(int length, int width) {
        return length * width;
    }
    public int getAreaOfRectangle(long length, long width) {
        return (int)(length * width);
    }
    public int getAreaOfRectangle(double length, double width) {
        return (int) (length * width);
    }

    public int getPerimeterOfSquare(int length, int width) {
        return 2 * (length + width);
    }
    public int getPerimeterOfSquare(long length, long width) {
        return (int)(2 * (length + width));
    }
    public int getPerimeterOfSquare(double length, double width) {
        return (int)(2 * (length + width));
    }
}

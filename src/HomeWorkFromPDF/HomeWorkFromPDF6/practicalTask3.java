/*
3
. Create three classes− Point, Line, and ColorLine:
• The "Point" class should have attributes "x" and "y".
• The "Line" class should contain two objects of the "Point" class.
• The "ColorLine" class should have an additional attribute "color", which extends the
"Line" class.
Override toString() method and define print() method in every classes.
In main() method create an array of Line objects and add some instances of both Line and
ColorLine to it. Call the print() method for all objects in the array.
*/

package HomeWorkFromPDF.HomeWorkFromPDF6;

class Point{
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}

class Line{
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}

class ColorLine extends Line{
    private String color;

    public ColorLine(Point start, Point end, String color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }

    public void print(){
        System.out.println(this);
    }
}

public class practicalTask3 {
    public static void main(String[] args) {

        Line[] arr = {
                new Line(new Point(1, 2), new Point(3, 4)),
                new ColorLine(new Point(5, 6), new Point(7, 8), "red"),
                new Line(new Point(2, 3), new Point(6, 7)),
                new ColorLine(new Point(0, 1), new Point(4, 5), "blue")
        };

        for (Line items : arr){
            items.print();
        }

    }
}

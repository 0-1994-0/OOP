import java.util.Scanner;

public class Rechteck {
    // Variablen private festlegen

    private double width;
    private double height;

    //Konstruktor erstellen
    Rechteck(double w, double h) {
        width = w;
        height = h;
    }

    // Liefert Variablenwerte Getmethode, nur Variable zurückgeben
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public double getArea() {
        double area = height * width;
        return area;
    }

    public double getPerimeter() {

        double perimeter = 2 * (width + height);
        return perimeter;
    }

}

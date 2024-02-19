package Task3;

class Point {
    private float x;
    private float y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void changeCoords(float newX, float newY) {
        this.x = newX;
        this.y = newY;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class Polygon {
    private Point[] points;

    public Polygon(int n) {
        points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(0.0f, 0.0f); // Inițializăm fiecare punct cu coordonatele (0, 0)
        }
    }

    public Polygon(float[] coordinates) {
        points = new Point[coordinates.length / 2];
        for (int i = 0; i < coordinates.length; i += 2) {
            points[i / 2] = new Point(coordinates[i], coordinates[i + 1]);
        }
    }

    public void displayPolygon() {
        for (Point point : points) {
            point.display();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crearea și afișarea unui poligon cu 4 colțuri
        Polygon polygon1 = new Polygon(4);
        System.out.println("Poligonul 1:");
        polygon1.displayPolygon();

        // Crearea și afișarea unui poligon cu 3 colțuri, coordonatele fiind specificate în vector
        float[] coordinates = {0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        Polygon polygon2 = new Polygon(coordinates);
        System.out.println("Poligonul 2:");
        polygon2.displayPolygon();
    }
}

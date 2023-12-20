import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Comparision Computation: ");
        
        Line a = new Line();
        Line b = new Line();

        if(Compare.equals(a, b)){
            System.out.println("EQUAL LINES");
        } else{
            System.out.println("NOT EQUAL LINES");
        }
    }
}

class Point{
    double x, y;

    Point(){}

    Point(double aX, double aY){
        this.x = aX;
        this.y = aY;
    }
}

class Line{
    Point start = new Point();
    Point end = new Point();

    Line(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER X-1: ");
        start.x = scanner.nextDouble();

        System.out.println("ENTER Y-1: ");
        start.y = scanner.nextDouble();

        System.out.println("ENTER X-2: ");
        end.x = scanner.nextDouble();

        System.out.println("ENTER Y-2: ");
        end.y = scanner.nextDouble();

        // scanner.close();
    }

    double getLength(){
        return Math.sqrt(Math.pow((start.x - end.x), 2) + Math.pow((start.y - end.y), 2));
    }
}

class Compare {
    static boolean equals(Line A, Line B) {
        return (A.start.x == B.start.x && A.start.y == B.start.y && A.end.x == B.end.x && A.end.y == B.end.y);
    }
}
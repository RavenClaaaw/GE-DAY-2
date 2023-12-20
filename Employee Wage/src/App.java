import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To Comparision Computation: ");
        
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

        scanner.close();
    }

    double getLength(){
        return Math.sqrt(Math.pow((start.x - end.x), 2) + Math.pow((start.y - end.y), 2));
    }
}

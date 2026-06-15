import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numberOfShapes = sc.nextInt();
        sc.nextLine();

        Shape[] shapes = new Shape[numberOfShapes];

        // Input
        for (int i = 0; i < numberOfShapes; i++) {

            String shapeType = sc.nextLine();

            String color = sc.next();
            boolean filled = sc.nextBoolean();

            // Rectangle
            if (shapeType.equalsIgnoreCase("RECTANGLE")) {

                double width = sc.nextDouble();
                double length = sc.nextDouble();
                sc.nextLine();

                shapes[i] = new Rectangle(
                        color,
                        filled,
                        width,
                        length
                );
            }

            // Circle
            else if (shapeType.equalsIgnoreCase("CIRCLE")) {

                double radius = sc.nextDouble();
                sc.nextLine();

                shapes[i] = new Circle(
                        color,
                        filled,
                        radius
                );
            }
        }

        // Output
        for (Shape s : shapes) {

            System.out.println(s);
            System.out.println();
        }

        // Downcasting
        System.out.println("--- Downcast Check ---");

        for (Shape s : shapes) {

            if (s instanceof Rectangle) {

                Rectangle r = (Rectangle) s;

                System.out.println(
                        "Rectangle width=" +
                        r.getWidth() +
                        " length=" +
                        r.getLength()
                );
            }

            else if (s instanceof Circle) {

                Circle c = (Circle) s;

                System.out.println(
                        "Circle radius=" +
                        c.getRadius()
                );
            }
        }

        sc.close();
    }
}

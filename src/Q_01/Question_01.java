package Q_01;

public class Question_01 {
    public static void main(String[] args) {
        double A=2.0;
        double B=3.0;
        double C=4.0;
        double X=5.0;
        double Y=6.0;
        double r=7.0;

        //a. The square root of B*B + 4AC
        double square_rt = Math.sqrt(B * B + 4 * A * C);
        System.out.println("a.The square root of B² + 4AC: " + square_rt);

        // b. The square root of X + 4Y*Y*Y
        double squart = Math.sqrt(X + 4 * Math.pow(Y, 3));
        System.out.println("b.The square root of X + 4Y³: " + squart);

        // c. The cube root of the product of X and Y
        double cube_root = Math.pow(X * Y, 1.0/3.0);
        System.out.println("c.The cube root of the product of X and Y: " + cube_root);

        // d. The area of a circle
        double area = Math.PI * r * r;
        System.out.println("d.The area of the circle is: " + area);



    }
}

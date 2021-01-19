public class Task_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 8;

        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не может существовать");
        }
    }
}
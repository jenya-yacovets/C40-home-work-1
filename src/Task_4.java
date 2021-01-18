public class Task_4 {
    public static void main(String[] args) {
        int a = 33;
        int b = -8;
        int c = 9;

        int result = 0;

        if (a > 0) {
            result++;
        }
        if (b > 0) {
            result++;
        }
        if (c > 0) {
            result++;
        }

        System.out.println("В данном наборе положительны чисел: " + result);
    }
}

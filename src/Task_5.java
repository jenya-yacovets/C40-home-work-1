public class Task_5 {
    public static void main(String[] args) {
        int a = 33;
        int b = -8;
        int c = -9;

        int positiveResult = 0;
        int negativeResult = 0;

        if (a > 0) {
            positiveResult++;
        } else {
            negativeResult++;
        }
        if (b > 0) {
            positiveResult++;
        } else {
            negativeResult++;
        }
        if (c > 0) {
            positiveResult++;
        } else {
            negativeResult++;
        }

        System.out.println("В данном наборе положительны чисел: " + positiveResult + " и отрицательных чисел: " + negativeResult);
    }
}

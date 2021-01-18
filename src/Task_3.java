public class Task_3 {
    public static void main(String[] args) {
        int number = 99;

        if (number > 0) {
            number++;
        } else if (number < 0) {
            number += -2;
        } else {
            number = 10;
        }

        System.out.println(number);
    }
}

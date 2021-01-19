public class Task_1 {
    public static void main(String[] args) {
        int number = 100;
        String message = number + " - это";

        if (number > -10 && number < 10) {
            message += " однозначное";
        } else if (number > -100 && number <= -10 || number >= 10 && number < 100) {
            message += " двухзначное";
        } else if (number > -1000 && number <= -100 || number >= 100 && number < 1000) {
            message += " трехзначное";
        } else if (number > -10000 && number <= -1000 || number >= 1000 && number < 10000) {
            message += " четырехзначное";
        } else {
            message += " многозначное";
        }

        if (number > 0) {
            message += " положительное";
        } else if (number < 0) {
            message += " отрицательное";
        } else {
            message += " не положительное и не отрицательное";
        }

        message += " число";

        System.out.println(message);
    }
}
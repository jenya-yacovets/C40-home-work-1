public class Task_7 {
    public static void main(String[] args) {

        int count = 121;
        String result;

        int remainder100 = count%100;

        if (count == 11 || count == 111 || count == 1111 || count == 11111) {
            result = " программистов";
        } else if (remainder100 == 11 || remainder100 == 12 ||  remainder100 == 13 || remainder100 == 14) {
            result = " программистов";
        } else {
            switch (count%10) {
                case 1:
                    result = " программист";
                    break;
                case 2:
                case 3:
                case 4:
                    result = " программиста";
                    break;
                default:
                    result = " программистов";
            }
        }

        System.out.println(count + result);
    }
}
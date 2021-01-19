public class Task_7_checking {
    public static void main(String[] args) {

        int count = 0;

        while (count < 500) {
            String result;

            int remainder100 = count%100;

            if (remainder100 == 11 || remainder100 == 12 ||  remainder100 == 13 || remainder100 == 14) {
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
            count++;
        }
    }
}

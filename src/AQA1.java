public class AQA1 {
    public static void main(String args[]) {
        //SWITCH CASE
        /*String color = "red";
        switch (color) {
            case "red":
                System.out.println("STOP");
                break;
            case "yellow":
                System.out.println("WARN");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("ТЫ ЧТО ВВЕЛ?");
                break;*/
        //МАССИВ

        /* N1
        double dist = 0;
        int startDay = 1;
        double perDay = 10;

    while (startDay < 7) {
            System.out.println("StartDay: " + startDay);
        System.out.println("Per day: " + perDay);
        dist += perDay;
        //dist = dist + perDay
        System.out.println("Result: " + dist);
        perDay= perDay + (perDay * 0.1);
            startDay++;


        }
        int result = 1;
        int hours = 24;
        for (int i = 0; i < hours / 3; i++) {
            result = result * 2;
        }
        System.out.printf("За %d часов получится %d амеб.", hours, result);
        int a = 1;
        int sum = 0;
        while (a <= 256) {
            sum = sum + a;
            a = a * 2;
        }
        System.out.println(a);*/


        int a = 1;
        int sum = 0;
        for (a = 1; a <= 256; a = a * 2) {
            sum = sum + a;
            System.out.println(sum);
        }
    }
}

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(timeConversion("12:00:00AM"));

    }

    public static String timeConversion(String s) {
        // Write your code here
//        String militaryTime = "";
//
//        if (!s.startsWith("12")) {
//            if (s.endsWith("AM")) {
//                militaryTime = s.replace("AM","");
//            } else {
//                militaryTime = (Integer.parseInt(s.substring(0, 2)) + 12) + s.substring(2).replace("PM","");
//            }
//        } else {
//            if (s.endsWith("AM")) {
//                militaryTime = "00:" + s.substring(3).replace("AM","");
//            } else {
//                militaryTime = s.replace("PM","");
//            }
//        }
//
//        return militaryTime;

        SimpleDateFormat date12format = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat date24format = new SimpleDateFormat("HH:mm");
        try {
            return date24format.format(date12format.parse(s));
        } catch (ParseException e) {
            System.out.println("Error.");
        }
        return s;
    }

}

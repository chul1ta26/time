public class Time {
    public static void main (String [] arg){

      // exercise 2.3
      //part 2
        double hour = 23.0;
        double minute = 18.0;
        double second = 35.0;


       // part 3
        double result = (hour * 3600.0) + (minute * 60.0) + second;
        System.out.println( "Seconds since midnight: \n" + result);

        // part 4
        System.out.println("Seconds remaining in the day: \n" + (86400.0 - result) );

       // part 5
       System.out.println("Percentage of the day: \n" + (result * 100.0)/86400.0);

       //part 6
        hour = 23;
        minute = 48;
        second =24;

        double endTime = (hour * 3600.0) + (minute * 60.0) + second;
        System.out.println( "time I finished in seconds:\n" + endTime);
        System.out.println("Seconds It took me to finished:\n" + (endTime - result));
    }

}

public class Time {
    public static void main (String [] arg){

      // exercise 2.3
      //part 2
        double hour = 23;
        double minute = 18;
       double second = 35;

       // part 3
        double result = (hour * 3600) + (minute * 60) + second;
        System.out.println( "Seconds since midnight: \n" + result);
    }
}

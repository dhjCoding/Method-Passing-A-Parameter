
package addingparameterstomethods;


public class DemoPay {

   
    public static void main(String[] args) 
    {
        double hours=25;
        double HoursWorked=37.5;
        cal(20);
        cal(35);
        
        
    }
    public static void cal(double hours)
    {
        final double RATE=13.37;
        double gross;
        gross=hours*RATE;
        System.out.println(hours+" hours  at $"+RATE+" per hour is $"+gross);
        
    }
    
}

/**
    ITCS-1212-105 - von Briesen

    @author Steven Andreas // list any team members)
    @version 1.0 // increment for updates
    @since 2/18/2022 // update with each incrememt

    Just a simple conversion program to conver seconds to some standard
    and non standard times.
*/

import java.util.Scanner;
public class TimeConversionDriver 
{
    public static void main(String[] args) 
    {
        // statements for output formatting
        System.out.println("*******************************");
        System.out.println("Start - Time Conversion Program");
        System.out.println("*******************************");
    
        // variable to store user input
        int numSeconds;
        /**
         * TO DO: ask the user to enter the number of seconds to be converted 
         * and assign the value to numSeconds
         */  
        // add your code here
        
        System.out.println("Enter a number of seconds to convert:");
        Scanner scnr = new Scanner(System.in);
        numSeconds = scnr.nextInt();
        
        
        // you do not need to add anything below this line
        // create TimeConversion object
        TimeConversion converter = new TimeConversion();
        // call method to calculate Decaseconds
        converter.showDecaseconds(numSeconds);
        // call method to calculate Jiffies
        converter.showJiffies(numSeconds);
        // call method to calculate New York minutes
        converter.showNewYorkMinutes(numSeconds);
        // call method to calculate Nano Centuries 
        converter.showNanoCenturies(numSeconds);
        // call method to calculate Scaramuccis
        converter.showScaramuccis(numSeconds);
        // statements are for output formatting
        System.out.println("*******************************");
        System.out.println("End - Time Conversion Program");
        System.out.println("*******************************");
    }//end main method
}//end class

class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){
    }
    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    public void showDecaseconds(int _seconds)
    {
        double decaseconds = _seconds / 10;
        System.out.println("Decaseconds: " + decaseconds);
    }
   
    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here

    public void showJiffies(int _seconds)
    {
        double jiffies = _seconds / .01;
        System.out.println("Jiffies: " + jiffies);
    }
    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    public void showNewYorkMinutes(int _seconds)
    {
        double newYorkMinute = _seconds / .2;
        System.out.println("New York Minutes" + newYorkMinute);
    }
    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here

    public void showNanoCenturies(int _seconds)
    {
        double nanoCenturies = _seconds / 3.156;
        System.out.println("Nano Centuries: " + nanoCenturies);
    }
     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here

    public void showScaramuccis(int _seconds)
    {
        double scaramuccis = _seconds / 950400; // 950400 is the number of seconds in 11 days.
        System.out.println("Scaramuccis" + scaramuccis);
    }
    
}//end class
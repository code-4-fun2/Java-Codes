
import java.util.Scanner;
 
public class Mar
{
    public static void main(String args[])
    {
        int markArray[] = new int[5];
        int i;
        float sum=0;
        float average, percentage;
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Enter marks for 5 Subjects : ");
        for(i=0; i<5; i++){
            markArray[i] = scan.nextInt();
            sum = sum + markArray[i];
        }
		
        average = sum/5;
        percentage = (sum/500) * 100;
		
        System.out.println("Average Marks = " +average);
		
        System.out.println("\nPercentage = " +percentage+ "%");
    }
}
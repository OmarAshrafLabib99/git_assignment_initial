package multiplicationseries;
import java.util.Scanner;

public class MultiplicationSeries {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in); 
        int n = s.nextInt();  
        System.out.println("the number you entered is: "+n);
        
        int r=1,i=1;
        while(i<=n){
        r+=i;
        i++;
    }
        System.out.println("the series summation = "+r);             
    }
}
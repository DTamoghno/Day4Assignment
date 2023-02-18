import java.util.*;
public class Day4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter the 5 Integers: ");
    for(int i = 1;i<=5;i++){
        int num = sc.nextInt();
        sum = num+sum;
    }
    System.out.println("The sum is: "+sum);
  }
}
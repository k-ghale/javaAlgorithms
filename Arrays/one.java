
import java.util.Scanner;

/**
 * one
 */
public class one {

  public static void main(String[] args) {
    int[] arrayName = {34,56,78,43,23};
    for(int i = 0; i<arrayName.length ; i++){
        System.out.println(arrayName[i]);
    }

    // int[] arrayTwo = { 23, 45, 67, 88};
 
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array!");
    int num = sc.nextInt();
    int[] arrayGiven = new int[num];
    
    System.err.println("Enter element values of the array");
    for (int i = 0 ; i < num; i++){
      arrayGiven[i] = sc.nextInt();
    }
    
    for(int i = 0 ; i < num ; i++){
      System.err.println("Element "+i+" is "+arrayGiven[i]);
    }
    sc.close();
  }

}



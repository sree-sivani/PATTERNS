import java.util.Scanner;
public class InvertedHalfPyramidRotated{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();

    for(int i = 1; i <= row; i++){
        // inner loop 1 to print spaces
      for(int j = 1; j <= row-i; j++){
          System.out.print("  ");
      }
      // inner loop 2 to print stars
      for(int j = 1; j <= i; j++){
        System.out.print(" *");
      }
      
      System.out.println();
    }

  }
}

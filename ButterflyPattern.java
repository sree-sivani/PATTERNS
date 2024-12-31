import java.util.Scanner;
public class ButterflyPattern{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();


    // upper part of butterfly pattern
    for(int i = 1; i <= row; i++){

      // printing the stars in first part
      for(int j = 1; j <= i; j++){
          System.out.print("* ");
      }

      // printing the spaces
      for(int j = 1; j <= 2*(row-i); j++){
          System.out.print("  ");
      }

      // printing the stars in second pattern
      for(int j = 1; j <= i; j++){
          System.out.print("* ");
      }
      System.out.println();
    }


    // lower part of buttern pattern

    for(int i = row; i >= 1; i--){
      for(int j = 1; j <= i; j++){
          System.out.print("* ");
      }
      for(int j = 1; j <= 2*(row-i); j++){
          System.out.print("  ");
      }
      for(int j = 1; j <= i; j++){
          System.out.print("* ");
      }
      System.out.println();
    }

    
  }
}

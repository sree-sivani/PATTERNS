import java.util.Scanner;
public class DiamondPattern{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();


    // upper half of the diamond pattern
    for(int i = 1; i <= row; i++){

      // printing the spaces
      for(int j = (row-i); j >= 1; j--){
          System.out.print("  ");
      }

      
      // printing the first half of the stars
      for(int j = i; j >= 1; j--){
          System.out.print("* ");
      }


      // printing the second half of the stars from 2
      for(int j = 2; j <= i; j++){
          System.out.print("* ");
      }
      
      System.out.println();
    }



    // lower half of the diamond pattern
    for(int i = row; i >= 1; i--){

      // printing the spaces
      for(int j = (row-i); j >= 1; j--){
          System.out.print("  ");
      }

      // printing the first half of the stars
      for(int j = i; j >= 1; j--){
          System.out.print("* ");
      }

      // printing the second half of the stars starting from 2
      for(int j = 2; j <= i; j++){
          System.out.print("* ");
      }
      System.out.println();
    }
    

  }
}

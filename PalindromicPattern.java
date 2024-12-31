import java.util.Scanner;
public class PalindromicPattern{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt();

    for(int i = 1; i <= row; i++){

      // printing the spaces
      for(int j = (row-i); j >= 1; j--){
          System.out.print("  ");
      }

      // printing the first half of palindromic pyramid
      for(int j = i; j >= 1; j--){
          System.out.print(j + " ");
      }

      // printing the second half of palindromic pyramid starting from 2
      for(int j = 2; j <= i; j++){
          System.out.print(j + " ");
      }
      
      
      System.out.println();
    }

  }
}

import java.util.Scanner;

public class Hello {

   public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      
      int num, a, b;
      
      System.out.print("2자리 정수 입력(10~99)>>");
      num = number.nextInt();
      
      a = num / 10;
      b = num % 10;

      if(a==b) 
         System.out.print("YES! 10의 자리와 1의 자리가 같습니다.");
      else
         System.out.print("NO! 10의 자리와 1의 자리가 다릅니다.");
      
      number.close();
   }
}
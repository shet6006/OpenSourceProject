import java.util.Scanner;

public class Hello {

   public static void main(String[] args) {
      Scanner number = new Scanner(System.in);
      
      int num, a, b;
      
      System.out.print("2�ڸ� ���� �Է�(10~99)>>");
      num = number.nextInt();
      
      a = num / 10;
      b = num % 10;

      if(a==b) 
         System.out.print("YES! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
      else
         System.out.print("NO! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
      
      number.close();
   }
}
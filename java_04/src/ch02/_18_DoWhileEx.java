package ch02;

import java.util.*;

public class _18_DoWhileEx {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // 콘솔에서 값을 입력 받는 클래스
      
      int month;
      do {
         System.out.print("월을 입력하세요 : ");
         month = sc.nextInt();
         sc.nextLine();
         if(month>12 || month<=0) {
            System.out.print("잘못된 월입니다.(1월~12월), ");
            continue;
         }else {
            System.out.println(month+"월은 정상입니다.");
            break;
         }
      }while(month>0 || month<=0);
      sc.close();
   }
}
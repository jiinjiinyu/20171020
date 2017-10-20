package myFirstProject;

public class OperatorEx {
  public static void main(String[] args) {
	  //산술연산자
	  
	 System.out.println(5.2+3.2);
	 System.out.println(5.3-3.3);
	 System.out.println(5.1*3.7);
	 System.out.println(5.6/3.2);
	 System.out.println(5.4%3.3);
	 
	 //단항연산자
     int i = 1;
     i++;
     System.out.println(i);
     i--;
     System.out.println(i);
     boolean b = true;
     System.out.println(b);
     System.out.println(!b);
     
     // 관계연산자
     System.out.println("관계연산자");
     System.out.println(3 ==3 );
     System.out.println(3 != 3);
     System.out.println(3 >=3);
     System.out.println(3 < 3);
     System.out.println(3 <= 3);
     
     //조건 연산자 (논리 연산자)
     System.out.println("조건연산자");
     System.out.println(true && true);
     System.out.println(false && false);
     System.out.println(false && true);
     System.out.println(true && false);
     
     System.out.println("조건연산자 ||");
     System.out.println("조건연산자");
     System.out.println(true ||true);
     System.out.println(false || false);
     System.out.println(false || true);
     System.out.println(true || false);
     
  }
}

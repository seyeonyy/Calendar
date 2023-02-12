package calendar;
import java.util.Scanner;
public class Calendar3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		System.out.print("두 수를 입력하세요.\n");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("두 수의 합은 "+(num1+num2)+"입니다.");
	
		sc.close();
		}
}

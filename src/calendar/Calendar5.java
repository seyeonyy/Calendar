import java.util.Scanner;
public class Calendar5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요.");
		int num, day;
		num = scanner.nextInt();
		System.out.println();
		System.out.println("월을 입력하세요.");
		for(int i = 1; i<= num; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		for(int i = 1; i<=num; i++) {	
			if(i == 2) {
				day = 28;
				System.out.println(i+"월은 "+day+"까지 있습니다.");
			}
			else if(i == 4 || i == 6 || i == 9 || i == 11) {
				day = 30;
				System.out.println(i+"월은 "+day+"까지 있습니다.");
			}
			else {
				day = 31;
				System.out.println(i+"월은 "+day+"까지 있습니다.");
			}
		}
		scanner.close();
	}

}

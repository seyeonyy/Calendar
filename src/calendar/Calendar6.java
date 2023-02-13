import java.util.Scanner;
public class Calendar6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month, day;
		for(int i = 1; i <= 12; i++) {
			System.out.println("월을 입력하세요.");
			month = scanner.nextInt();
			if (month == 2) {
				day = 28;
				System.out.println(month+"월은 "+day+"일까지 있습니다.");
			}
			else if(month == 4|| month == 6|| month == 9 || month == 11) {
				day = 30;
				System.out.println(month+"월은 "+day+"일까지 있습니다.");
			}
			else if(month == 1|| month == 3||month == 5 || month == 7|| month == 8||month == 10 ||month == 12) {
				day = 31;
				System.out.println(month+"월은 "+day+"일까지 있습니다.");
			}
			else {
				System.out.println("Have a nice day!");
				break;
			}
		}
		scanner.close();
	}

}

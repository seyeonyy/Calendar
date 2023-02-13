package calendar;
import java.util.Scanner;
public class Calendar4 {
	public static void main(String[] args) {
		int[] month = new int[12];
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요.");
		int day;
		for(int i = 0; i < month.length; i++) {
			month[i] = scanner.nextInt();
			if (month[i] == 1|| month[i] == 3 || month[i] == 5 || month[i] == 7 || month[i] == 8 || month[i] == 10 || month[i] == 12) {
				day = 31;
				System.out.println(month[i]+"월은 "+day+"일까지 있습니다.");
			}
			else if(month[i] == 2) {
				day = 28;
				System.out.println(month[i]+"월은 "+day+"일까지 있습니다.");
			}
			else {
				day = 30;
				System.out.println(month[i]+"월은 "+day+"일까지 있습니다.");
			}
			
		}
		scanner.close();
	
	}
	

}

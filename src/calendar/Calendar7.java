import java.util.Scanner;
public class Calendar7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = 1;
		int day;
		String PROMPT = "cal> ";
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if(month == 2) {
				day = 28;
				System.out.println("일  월  화  수  목  금  토");
				System.out.println("----------------------");
				for(int i = 1; i<= day; i++) {
					System.out.printf("%3d", i);
					if(i%7 == 0)
						System.out.println();
				}
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11) {
				day = 30;
				System.out.println("일  월  화  수  목  금  토");
				System.out.println("----------------------");
				for(int i = 1; i<= day; i++) {
					System.out.printf("%3d", i);
					if(i%7 == 0)
						System.out.println();
				}
			}
			else if(month == 1 || month == 3|| month == 5 || month == 7||month == 8||month == 10 ||month == 12) {
				day = 31;
				System.out.println("일  월  화  수  목  금  토");
				System.out.println("----------------------");
				for(int i = 1; i<= day; i++) {
					System.out.printf("%3d", i);
					if(i%7 == 0)
						System.out.println();
				}
			}
			if(month == -1) {
				System.out.println("Bye~");
				break;
			}
			if(month >= 13) {
				continue;
			}
			System.out.println();
		}
		scanner.close();
	}

}

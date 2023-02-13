import java.util.Scanner;
public class Calendar8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year, month, day;
		while(true) {
			System.out.println("연도와 달을 입력하세요.");
			year = scanner.nextInt();
			month = scanner.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if(month == 2) {
					day = 29;
					System.out.println("일  월  화  수  목  금  토");
					System.out.println("----------------------");
					for(int i = 1; i<= day; i++) {
						System.out.printf("%3d", i);
						if (i % 7 == 0) {
							System.out.println();
						}
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
			}
			else {
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
			}
			System.out.println();
		}
		scanner.close();
	}
}

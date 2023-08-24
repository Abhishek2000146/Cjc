package bank;

import java.util.Scanner;

public class TestRbi {

	private static int b;
	private static int w;
	private static int d;
	private static int c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rbi r = new Rbi();
		System.out.println("1:creatacc\n" + "2:depositacc\n" + "3: withdrawamt\n" + "4:balancecheck");

		while (true) {
			System.out.println("Enter your choice");
			int ch = sc.nextInt();

			System.out.println("Enter amt");
			c = sc.nextInt();

			System.out.println("Enter deposite");
			d = sc.nextInt();

			System.out.println("Enter withdraw");
			w = sc.nextInt();

			System.out.println("Enter bal");
			b = sc.nextInt();

			if (ch == 1) {

				r.createacc();
			}

			else if (ch == 2) {

				r.depositacc();
			}

			else if (ch == 3) {
				r.withdrawamt();
			}

			else if (ch == 4) {
				r.balcheck();
			}

			else {

				System.out.println("wrong choice");

			}
		}
	}

}

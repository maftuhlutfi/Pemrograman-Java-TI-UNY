public class soal_10_26 {
		public static void main(String[] args) {
		
		String a = args[0].replaceAll(" ",""); // "5 *    6" ==> "5*6"
		System.out.println(a);
		a = a.replaceAll("[+]","#+#");
		a = a.replaceAll("[-]","#-#");
		a = a.replaceAll("[*]","#*#"); // "5*6" ==> "5#*#6"
		a = a.replaceAll("[/]","#/#");
		args = a.split("#"); // "5*6" args[] = ["5", "*", "6"]

		// Check number of strings passed
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The result of the operation
		int result = 0;

		// Determine the operator
		switch (args[1].charAt(0)) {
			case '+' : result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
			case '-' : result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
			case '*' : result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
			case '/' : result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
		}

		// Display result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}
}

/*
======
OUTPUT
======
$ java soal_10_26 "4 *     3"
4 * 3 = 12
*/
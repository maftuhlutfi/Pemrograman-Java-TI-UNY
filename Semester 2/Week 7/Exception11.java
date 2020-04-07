class Exception11 extends Throwable {
	public Exception11(String s) {
		super(s);
	}

	public static void main(String[] args) {
		int position=1;
		try {
			if(position>0) {
				throw new Exception11("Position " +position);
			}
		}
		
		catch(Exception11 e) {
			System.out.println("Range error: " +e.getMessage());
		}

		System.out.println("This is the last program.");
	}
}
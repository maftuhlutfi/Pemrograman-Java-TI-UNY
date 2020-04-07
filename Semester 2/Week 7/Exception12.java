import java.lang.*;

class MyException extends java.lang.Exception {
	private String Teks;
	MyException(String s) {
		Teks="Exception generated by: "+s;
		System.out.println(Teks);
	}
}

public class Exception12 {
	static void tampil(String s)throws java.lang.Exception {
		System.out.println("Tampil");

		if(s.equals("amir")) {
			throw new MyException(s);
		}

		System.out.println("OK!");
	}

	public static void main(String[] args)throws java.lang.Exception {
		try {
		tampil("ali");
		tampil("amir");
		}
		
		catch(MyException ex) {
		System.out.println("Tangkap:"+ex);
		}
	}
}
import java.util.Date;

/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class soal_9_3 {
	public static void main(String[] args) {
		Date date = new Date();
		for (long i = 10000L;i <= 100000000000L;i *= 10) {
			date.setTime(i);
			System.out.println(date.toString());
		}
	}
}

/*

======
OUTPUT
======
Thu Jan 01 07:00:10 ICT 1970
Thu Jan 01 07:01:40 ICT 1970
Thu Jan 01 07:16:40 ICT 1970
Thu Jan 01 09:46:40 ICT 1970
Fri Jan 02 10:46:40 ICT 1970
Mon Jan 12 20:46:40 ICT 1970
Mon Apr 27 00:46:40 ICT 1970
Sat Mar 03 16:46:40 ICT 1973

*/
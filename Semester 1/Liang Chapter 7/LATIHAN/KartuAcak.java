public class KartuAcak {
	public static void main(String[] args) {
		// Membuat deck 52 kartu
		int deck[] = new int[52];

		// Memberi nilai awal kartu
		for (int i = 0;i < deck.length;i++) {
			deck[i] = i;
		}

		// Shuffle angka
		for (int i = 0;i < deck.length;i++) {
			// Ambil nilai acak ke j
			int j = (int) (Math.random() * deck.length);
			// Swap deck j dengan deck i
			int temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}

		// Tampilkan 4 anggota deck
		System.out.println("Kamu mendapatkan kartu:");
		for (int i = 0;i < 4;i++) {
			System.out.printf("%s %s %n",  isAKQJ(deck[i]), jenisKartu(deck[i]));;
		}
	}

	// Method Jenis Kartu
	public static String jenisKartu(int a) {
		int b = (a / 13);
		String s = "";
		switch (b) {
			case 0: s = ("WAJIK"); break;
			case 1: s = ("HATI"); break;
			case 2: s = ("KRIBO"); break;
			case 3: s = ("WARU"); break;
		}
		return s;
	}

	// Method Apakah Ace King Queen Jack
	public static String isAKQJ(int a) {
		int b = ((a) % 13);
		String s = "";
		switch (b) {
			case 0: s = "ACE"; break;
			case 10: s = "JACK"; break;
			case 11: s = "QUEEN"; break;
			case 12: s = "KING"; break;
			default: s = ("" + (b + 1)); break;
		}
		return s;
	}
}
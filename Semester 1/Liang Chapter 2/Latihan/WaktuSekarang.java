public class WaktuSekarang {
	public static void main(String[] args) {
		long totalmili = System.currentTimeMillis();
		long totaldetik = totalmili / 1000;
		long nowdetik = totaldetik % 60;
		long totalmenit = totaldetik / 60;
		long nowmenit = totalmenit % 60;
		long totaljam = totalmenit / 60;
		long nowjam = (totaljam + 7) % 24;
		System.out.printf("Waktu saat ini adalah Jam %d Lebih %d menit %d detik", nowjam, nowmenit, nowdetik);
	}
}
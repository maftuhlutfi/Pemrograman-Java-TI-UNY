import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class imdbSearchRevisi {
	public static void main(String[] args) throws IOException {
			File file = new File(args[0]);
			Scanner input = new Scanner(System.in);
			Scanner scan = new Scanner(file);

			// Masukkan hasil scan ke array
			ArrayList<Integer> no = new ArrayList<>();
			ArrayList<Double> rating = new ArrayList<>();
			ArrayList<Integer> voted = new ArrayList<>();
			ArrayList<String> title = new ArrayList<>();

			while (scan.hasNextLine()) {
				String movie = scan.nextLine();
				Scanner lineScan = new Scanner(movie);
				
				no.add(lineScan.nextInt());
				rating.add(lineScan.nextDouble());
				voted.add(lineScan.nextInt());
 
				title.add(lineScan.nextLine());
			}

			// User input yang akan disearch
			System.out.print("Masukkan keyword judul film: ");
			String search = input.nextLine();
			System.out.println("Rank\t Votes\t Rating\t Judul");
			int count = 0;
			for (int i = 0; i < title.size();i++) {
				if (title.get(i).toLowerCase().indexOf(search.toLowerCase()) >= 0) {
					count++;
					System.out.println(no.get(i) + "\t " + voted.get(i) + "\t " + rating.get(i) + "\t" + title.get(i));
				}
			}
			if (count == 0) 
				System.out.println("Not found.");
			else {
				System.out.println(count + " matches.");
			}

			// Masukkan ke file txt baru
			File outfile = new File("imdbSearchRevisi.txt");
			PrintWriter output = new PrintWriter(outfile);
			output.println("==============================");
			output.println("HASIL SEARCH KATA " + search.toUpperCase());
			output.println("==============================");
			output.println("Rank\t Votes\t Rating\t Judul");
			count = 0;
			for (int i = 0; i < title.size();i++) {
				if (title.get(i).toLowerCase().indexOf(search.toLowerCase()) >= 0) {
					count++;
					output.println(no.get(i) + "\t " + voted.get(i) + "\t " + rating.get(i) + "\t" + title.get(i));
				}
			}
			if (count == 0) 
				output.println("Not found.");
			else {
				output.println(count + " matches.");
			}
			output.close();
			System.out.println("Successfully saved by name " + outfile);
	}
}

/*
Berikut output di CMD nya 
======
OUTPUT
======
E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\STUART>java imdbSearchRevisi imdb.txt
Masukkan keyword judul film: man
Rank     Votes   Rating  Judul
48       32213   8.4     The Third Man (1949)
85       32498   8.3     The Elephant Man (1980)
86       23502   8.3     The Manchurian Candidate (1962)
97       138742  8.2     Batman Begins (2005)
228      17928   7.9     Roman Holiday (1953)
231      22558   7.9     Manhattan (1979)
237      38241   7.9     Cinderella Man (2005)
242      8089    7.9     A Man for All Seasons (1966)
248      13776   7.9     The Man Who Shot Liberty Valance (1962)
9 matches.
Successfully saved by name imdbSearchRevisi.txt
*/
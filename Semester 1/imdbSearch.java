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

public class imdbSearch {
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
			File outfile = new File("imdbSearch.txt");
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
E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\STUART>java imdbSearch imdb.txt
Masukkan keyword judul film: war
Rank     Votes   Rating  Judul
7        178050  8.8     Star Wars: Episode V - The Empire Strikes Back (1980)
12       217002  8.8     Star Wars (1977)
108      139996  8.2     Star Wars: Episode VI - Return of the Jedi (1983)
3 matches.

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\STUART>java imdbSearch imdb.txt
Masukkan keyword judul film: god
Rank     Votes   Rating  Judul
1        243153  9.1     The Godfather (1972)
3        139085  9.0     The Godfather: Part II (1974)
2 matches.

E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\STUART>java imdbSearch imdb.txt
Masukkan keyword judul film: four
Rank     Votes   Rating  Judul
Not found.
*/
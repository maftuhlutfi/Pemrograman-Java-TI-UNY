/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class GuinnessBook {

	private ArrayList<Animal> landAnimals;

	public GuinnessBook(String filename) throws FileNotFoundException{

		landAnimals = new ArrayList<Animal>();

		File animalFile = new File(filename);
		Scanner scan = new Scanner(animalFile);
		
		while(scan.hasNextLine()){
			String[] animalInfo = scan.nextLine().split(" ");
			String animalName = "";
			
			for(int i = 0; i < (animalInfo.length-1); i++){
				animalName += animalInfo[i] + " ";
			}
			animalName = animalName.trim();
			Integer topSpeed = Integer.parseInt(animalInfo[animalInfo.length-1]);

			//insert the animal into the arraylist here, don't change any of the above code
			landAnimals.add(new Animal(animalName, topSpeed));
			
		}
		scan.close();
	}


	public String toString(){
		// for (Object landAnimal : landAnimals) {
		// 	return landAnimal.toString();
		// }
		String s = "";
		for (int i = 0;i < landAnimals.size();i++) {
			s = s + landAnimals.get(i).toString() + "\n";
		}
		return s;
	}

	private void testGuinnessBook() throws FileNotFoundException {

        // uncomment the println statements to  find animals whose speed is within
        // 2mph of a given speed

        System.out.println("Is there an animal whose speed is around 70mph? " + landAnimals.contains(new Animal("fast animal", 70)));
        System.out.println("Is there an animal whose speed is around 35mph? " + landAnimals.contains(new Animal("slow animal", 35)));
        System.out.println();
            
        // The success of the above two statements depends on correct implementation of an equals method in the Animal class
        // TAs:  please explain this point at some point during the recitation.
            
        //If we would like to know which animal it is:
        System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("fast animal", 70))));
        System.out.println(landAnimals.get(landAnimals.indexOf(new Animal("slow animal", 35))));
        System.out.println();

        //Now print all the animals whose speed is around 50mph
        System.out.println("Animals whose speed is arround 50mph");
        
        for (int i = 0;i < landAnimals.size();i++) {
			if (landAnimals.get(i).equals(new Animal("50mph animal", 50))) {
				System.out.println(landAnimals.get(i).toString());
			}
		}
    }

    public static void main(String args[]) throws FileNotFoundException {

        // Once Animal.java is completed and GuinnessBook has a working toString,
        // uncomment the next two lines to test the constructor and toString
        GuinnessBook records = new GuinnessBook(args[0]);
        System.out.println(records);

        // Next, uncomment the following line and lines from testGuinnessBook to test your
        // Animal class equals method
        records.testGuinnessBook();
    }

}

/*
======
OUTPUT
======
E:\SEKOLAH\UNY\Semester 1\PEMROGRAMAN\JAVA\LIANG\Liang Chapter 10\R14>java Guinn
essBook animalList.txt
Nama: giraffe   Top Speed: 32
Nama: pronghorn Top Speed: 60
Nama: reindeer  Top Speed: 32
Nama: mongolian wild ass        Top Speed: 40
Nama: wildebeest        Top Speed: 56
Nama: jackal    Top Speed: 35
Nama: lion      Top Speed: 50
Nama: gray fox  Top Speed: 42
Nama: horse     Top Speed: 50
Nama: elk       Top Speed: 45
Nama: mule deer Top Speed: 36
Nama: human     Top Speed: 27
Nama: whippet   Top Speed: 35
Nama: cape hunting dog  Top Speed: 45
Nama: coyote    Top Speed: 43
Nama: hyena     Top Speed: 40
Nama: cheetah   Top Speed: 68
Nama: zebra     Top Speed: 50
Nama: greyhound Top Speed: 45
Nama: rabbit    Top Speed: 49
Nama: gazelle   Top Speed: 57

Is there an animal whose speed is around 70mph? true
Is there an animal whose speed is around 35mph? true

Nama: cheetah   Top Speed: 68
Nama: jackal    Top Speed: 35

Animals whose speed is arround 50mph
Nama: lion      Top Speed: 50
Nama: horse     Top Speed: 50
Nama: zebra     Top Speed: 50
Nama: rabbit    Top Speed: 49
*/
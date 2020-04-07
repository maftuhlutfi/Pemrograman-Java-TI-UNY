/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class CircleOfLife {

    public static void main(String args[]) {

        // Create a new Species object here, passing in the appropriate arguments
		Species a = new Species("Jaran", 30, 22);

        // Print out the species' growth rate
        System.out.println(a.growthrate);

        // Use the species' toString here
        System.out.println(a.toString());
		
        // Call populationInXYears here
        System.out.println(a.populationInXYears(5));
		
        // Create a new Species object here, passing in the appropriate arguments
        // using a very large number for the population (e.g. 100000000)
        Species b = new Species("Sapi", 123456, 8);

        // Print out the species' population to make sure it is set to 1500
        System.out.println(b.population);

        // Call populationInXYears here, feel free to hardcode in the int to be passed to the method
        System.out.println(b.populationInXYears(20));

        // Call mergeSpecies here. Test that mergeSpecies is doing what you expected it to
        b.mergeSpecies(a);
        System.out.println(b);
				
    }
}

/*
======
OUTPUT
======
20
Name of species: Jaran
Population: 30
Growth rate: 20%
36
1500
2520
Name of species: Sapi Jaran
Population: 1530
Growth rate: 20%
*/
/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class Species {	

    // Put the instance variable here.

    String name;
    int growthrate;
    int population;

    // Create a Species constructor that takes in a String for its name, an int for
    // its population, and an int for its growth rate per year as a percent.

    Species(String newName, int newPopulation, int newGrowthRate){
        name = newName;

        population = newPopulation;
        if (newPopulation <= 1)
            population = 1;
        else if (newPopulation >= 1500)
            population = 1500;

        growthrate = newGrowthRate;
        if (newGrowthRate <= 1)
            growthrate = 1;
        else if (newGrowthRate >= 20)
            growthrate = 20;
    }
    
    // mergeSpecies adds the populations of the two species, changes the name
    // of the species to the concatenation of the two names, and the growth
    // rate to the maximum of the two growth rates.

    public void mergeSpecies(Species other) {
        name += " " + other.name;
        population += other.population;
        int maxgrowth = this.growthrate;
        if (other.growthrate > maxgrowth)
            growthrate = other.growthrate;
        // System.out.println("mergeSpecies NOT IMPLEMENTED YET");
    }

    public String toString(){
        // ....
        // System.out.println("toString NOT IMPLEMENTED YET");
        String output = "";
        output += "Name of species: " + name;
        output += "\nPopulation: " + population;
        output += "\nGrowth rate: " + growthrate + "%";
        return output;
    }

    // Increases the population according to the growth rate of the species, i.e.
    // updates the population instance variable by adding to it the growth rate/100 times the current population.

    public void grow() {
        // ....
        // System.out.println("grow NOT IMPLEMENTED YET");
        this.population += population * growthrate / 100; 
    }

    // Returns the population of the species in x years according to its growth rate.

    public int populationInXYears(int x){
        // ....
        // System.out.println("getPoplulationInXYears NOT IMPLEMENTED YET");
        int popinxyears = 0;
        for (int i = 0;i <= x;i++)
            popinxyears += population * growthrate / 100;
        return popinxyears;
    }

    public static void main(String[] args) {

        // Put simple code here to test the Species class.  It is always a good idea to include
        // a main method in any class you define.

        Species a = new Species("Frog", 100, 10);
        System.out.println(a);

        a.grow();
        System.out.println(a);

        System.out.println("a.populationInXYears(10) returns " + a.populationInXYears(10));

        Species b = new Species("Rabbit", 10, 23);
        a.mergeSpecies(b);
        System.out.println("a.mergeSpecies(b) is " + a);
        
    }
}

/*
======
OUTPUT
======
Name of species: Frog
Population: 100
Growth rate: 10%
Name of species: Frog
Population: 110
Growth rate: 10%
a.populationInXYears(10) returns 121
a.mergeSpecies(b) is Name of species: Frog Rabbit
Population: 120
Growth rate: 20%
*/
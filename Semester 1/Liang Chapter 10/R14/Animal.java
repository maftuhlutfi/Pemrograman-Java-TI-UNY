/*
================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
*/

public class Animal {
	
	private String name;
	private int topSpeed;		
	//create the getters and setters for the instance variables
        //there is a shortcut by hovering over the variable names
		
		public String getName() {
			return name;
		}

		public int getTopSpeed() {
			return topSpeed;
		}

		public void setName(String newName) {
			name = newName;
		}


	// For the setter associated with topSpeed make sure the values are between 0 and 70
        // Print "Invalid Speed" if it is not within these values and leave
        // the speed unchanged.
		
		public void setTopSpeed(int newTopSpeed) {
			if (0 <= newTopSpeed && newTopSpeed <= 70)
			topSpeed = newTopSpeed;
		}

	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables

		Animal(String name, int topSpeed) {
			this.setName(name);
			this.setTopSpeed(topSpeed);
		}

        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other

		public boolean equals(Object other) {
			Animal otherAnimal = (Animal) other;
			return (otherAnimal.topSpeed - 2 <= this.topSpeed && this.topSpeed <= otherAnimal.topSpeed + 2);
		}
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25

		public String toString() {
			String s = "Nama: " + this.name + "\tTop Speed: " + this.topSpeed;
			return s;
		}
	
}

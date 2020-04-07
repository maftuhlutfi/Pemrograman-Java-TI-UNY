public class MimicOct {
	
    public String name;
    public String disguisedAs;
    public String color;
	
    public MimicOct(){
        name = "An Octopus";
        disguisedAs = "Octopus";
        color = "grey";
    }
	
    public void morph(){
        int morphNum = (int)(Math.random()*6);
        switch(morphNum){
        case 0:
            this.disguisedAs = "Rock";
            this.color = "Black";
            break;
        case 1:
            this.disguisedAs = "LionFish";
            this.color = "Red and Black";
            break;
        case 2:
            this.disguisedAs = "Flatfish";
            this.color = "Grey";
            break;
        case 3:
            this.disguisedAs = "Furry Turkey";
            this.color = "Light Brown";
            break;
        case 4:
            this.disguisedAs = "Sea Snake";
            this.color = "Black and White";
            break;
        case 5:
            this.disguisedAs = "Eel";
            this.color = "Yellow and Black";
            break;
        default:
            this.disguisedAs = "Octopus";
            this.color = "Grey";
        }
    }
	
    public void writeOutput(){
        System.out.println("Name: " + this.name);
        System.out.println("Looks like: " + this.disguisedAs);
        System.out.println("Color: " + this.color);
        System.out.println();
    }
    
    // public String toString(){
    //		String output = "";
    //		output += "Name: " + this.name + "\n";
    //		output += "Disguise: " + this.disguisedAs + "\n";
    //		output += "Color: " + this.color + "\n";
    //		
    //		return output;
    //	}
	
    public static void main(String args[]){

        MimicOct arnie = new MimicOct();

        arnie.name = "Arnie";
        arnie.disguisedAs = "Octopus";
        arnie.color = "Brown";
        arnie.writeOutput();	
        arnie.morph();
        arnie.writeOutput();
		
        System.out.println(arnie);
    }
}


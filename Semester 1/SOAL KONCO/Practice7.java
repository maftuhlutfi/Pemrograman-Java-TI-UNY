public class Practice7 {
    public static void main (String [] args) {
        char grade = 'a' ;
        boolean passing = true ;
        switch (grade){
            case 'a' : passing = true;
     
            case 'b' : passing = true;
            case 'c' : passing = true;
            case 'd' : passing = true;
            case 'f' : passing = false;
        }
        System.out.println("Passing status: " + passing);
    }
}
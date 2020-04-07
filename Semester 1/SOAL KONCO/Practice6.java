public class Practice6 {
    public static void main (String [] args ) {
        char c = 'g' ;
        boolean b = false;
        if (c > 'b' && c < == 'z' || c == 'g')
            b = true;
        if (c == 'a' && c == 'g')
            b = false;
        if (b == true && c == 'g')
            b = true;
        System.out.println("Value of b : " + b);
    }
}
public class Practice2 {
    public static void main (String [] args) {
        int i = 3;
        if (i++ == 3)
            System.out.println("i : " + i);
        if (++i == 5)
            System.out.println("i : " + i);
        System.out.println(i % 3);    
    }
}
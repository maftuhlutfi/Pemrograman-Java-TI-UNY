import java.util.Scanner;
/*

================================
Nama    : Muchamad Lutfi Maftuh
NIM     : 19537141023
Kelas   : I.1
================================
Name the 8 primitive types
char,int,double,float,long,short,byte,boolean

declaring    => char c
assigning    => c = 'a'
initializing => int i = 3

 */
public class Practice {
    public static void main(String[] args){

        System.out.println("=========");
        System.out.println("LATIHAN 1");
        System.out.println("=========");
        int i = 9;
        double pi = 3.14;
        i = (int) pi;
        pi = (double) i;
        System.out.println("i: " + i);
        System.out.println("pi: " + pi);
        System.out.println(" ");

        System.out.println("=========");
        System.out.println("LATIHAN 2");
        System.out.println("=========");
        int i0 = 1;
        int i1 = 3;
        System.out.println("i0/i1: " + i0/i1);
        double result0 = i0/i1;
        System.out.println("double io/i1: " + result0);

        double d0 = 1.0;
        double d1 = 3.0;
        System.out.println("d0/d1: " + d0/d1);
        int result1 = (int) (d0/d1);
        System.out.println("int d0/d1: " + result1); 
        System.out.println(" ");

        System.out.println("=========");
        System.out.println("LATIHAN 3");
        System.out.println("=========");
        int i3 = 3;
        if (i3++ == 3)
            System.out.println("i : " + i3);
        if (++i3 == 5)
            System.out.println("i : " + i3);
        System.out.println(i3 % 3); 
        System.out.println(" ");

        System.out.println("=========");
        System.out.println("LATIHAN 4");
        System.out.println("=========");
        double d = 3.2;
        if (d < 3.5)
            System.out.println("less than 3.5");
        else if (d < 3.3)
            System.out.println("less than 3.3");
        else if (d <= 3)
            System.out.println("less than or greater than 3");
        else 
            System.out.println("greater than or equal to 3.5");
        System.out.println(" ");

        System.out.println("=========");
        System.out.println("LATIHAN 5");
        System.out.println("=========");
        char c = 'g' ;
        boolean b = false;
        if (c > 'b' && c <= 'z' || c == 'g')
            b = true;
        if (c == 'a' && c == 'g')
            b = (b == true && c == 'g');
            b = true;
        System.out.println("Value of b : " + b);
        System.out.println(" ");

        System.out.println("=========");
        System.out.println("LATIHAN 6");
        System.out.println("=========");
        char grade = 'a' ;
        boolean passing = true ;
        switch (grade){
            case 'a' : passing = true;
            break;
            case 'b' : passing = true;
            case 'c' : passing = true;
            case 'd' : passing = true;
            case 'f' : passing = false;
        }
        System.out.println("Passing status: " + passing);
        System.out.println(" ");


        System.out.println("=========");
        System.out.println("LATIHAN 7");
        System.out.println("=========");
        float f = 9f;
        char c7;
        c7 = 'a';
        int i7 = (int) c7;
        String name = "Maftuh";
        String assignment = "Java 1";
        String date = "19 November 2019";
        String Age = "18 Years old";
        String Name = "Lutfi";
        String GPA = "C";
        Scanner reader = new Scanner (System.in);
        double d7;
        int I;
        int i17 = 12345;
        int i2 = 12345;
        boolean b7;
        int j;


        //CETAK
        System.out.println(i7);
        //print
        System.out.print(name+"\n");
        System.out.print(assignment+"\n");
        System.out.print(date+"\n");
        System.out.print(name+"\n"+assignment+"\n"+date+"\n");
        //println
        System.out.println(name);
        System.out.println(assignment);
        System.out.println(date);

        System.out.println("Age "+Age+" Name "+Name+" GPA "+GPA);
        System.out.println("insert double d value: ");
        d = reader.nextDouble();
        System.out.println("insert integer I value: ");
        I = reader.nextInt();
        b7 = (i17==i2);
        System.out.println(b7);
        System.out.println("Input integer J value: ");
        j = reader.nextInt();
        if (j>=0 && j<=100)
            System.out.println("between 0 and 100");
        if(c=='a'||c=='c')
            System.out.println("char is a or c");
        System.out.println("insert int Switch: ");
        int Switch = reader.nextInt();
        switch (Switch){
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("one"); break;
            case 2: System.out.println("two"); break;
            default: System.out.println("less than zero or greater than two");

        }
        reader.close();
    }
}


/*
======
OUTPUT
======

=========
LATIHAN 1
=========
i: 3
pi: 3.0

=========
LATIHAN 2
=========
i0/i1: 0
double io/i1: 0.0
d0/d1: 0.3333333333333333
int d0/d1: 0

=========
LATIHAN 3
=========
i : 4
i : 5
2

=========
LATIHAN 4
=========
less than 3.5

=========
LATIHAN 5
=========
Value of b : true

=========
LATIHAN 6
=========
Passing status: true

=========
LATIHAN 7
=========
97
Maftuh
Java 1
19 November 2019
Maftuh
Java 1
19 November 2019
Maftuh
Java 1
19 November 2019
Age 18 Years old Name Lutfi GPA C
insert double d value:
3
insert integer I value:
4
true
Input integer J value:
5
between 0 and 100
insert int Switch:
1
one
 */
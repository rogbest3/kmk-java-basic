import java.util.Scanner;

class PlusCalc{

    public static void main( String[] args ){

        int a = 0;
        int b = 0;
        int c = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        c = a + b;
    //    System.out.print("a + b = ");
     //   System.out.println( a + b );
     //   System.out.print(a + "+" + b + "=" + c );
        System.out.print( String.format("%d + %d = %d", a, b, c ) );
    }
}
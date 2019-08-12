import java.util.Scanner;

class MinusCalc{

    public static void main( String[] args ){

        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("a - b = ");
        System.out.print( a - b );
    }
}
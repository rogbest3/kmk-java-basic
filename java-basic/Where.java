import java.util.Scanner;

class Where{

    public static void main( String[] args ){

        System.out.println("어디 사니?");
        Scanner scanner = new Scanner(System.in);
        String where = "";
        where = scanner.next();
        System.out.println("나는 " + where + "에 삽니다.");
    }

}
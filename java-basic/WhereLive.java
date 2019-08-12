import java.util.Scanner;

class WhereLive{
    public static void main( String[] args ){
        System.out.println("어디에 사니?");
        String whereLive = "";
        Scanner scanner = new Scanner(System.in);
        whereLive = scanner.next();
        System.out.println(String.format("내가 사는 곳은 %s입니다.", whereLive));
    }
}
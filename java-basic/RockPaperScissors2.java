import java.util.Scanner;
import java.util.Random;

class RockPaperScissors2{
    public static void main(String[] args){
    
        int num = 0;
        String answer = "";

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        num = random.nextInt(3) + 1;

        System.out.println( num );
        System.out.println("가위 바위 보 값을 넣으세요 [ ]");
        answer = scan.next();

        if( num == 1 ){         // 컴퓨터 가위
            System.out.println("컴퓨터 가위");
            if( answer.equals("가위")){
                System.out.println("비겼습니다.");
            }else if( answer.equals("바위")){
                System.out.println("이겼습니다.");
            }else{
                System.out.println("졌습니다.");
            }
        }else if( num == 2){    // 컴퓨터 바위
            System.out.println("컴퓨터 바위");
            if( answer.equals("가위")){
                System.out.println("졌습니다.");
            }else if( answer.equals("바위")){
                System.out.println("비겼습니다.");
            }else{
                System.out.println("이겼습니다.");
            }
        }else{                  // 컴퓨터 보
            System.out.println("컴퓨터 보");
            if( answer.equals("가위")){
                System.out.println("이겼습니다.");
            }else if( answer.equals("바위")){
                System.out.println("졌습니다.");
            }else{
                System.out.println("비겼습니다.");
            }
        }
    }
}
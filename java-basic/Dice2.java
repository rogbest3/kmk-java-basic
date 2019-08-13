import java.util.Scanner;
import java.util.Random;

class Dice2{
    public static void main( String[] args ){

        int dice = 0;
        String answer, dap = "";

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        dice = random.nextInt(6) + 1;

        System.out.println(String.format("랜덤 주사위 값 %d", dice));

        if( dice % 2 == 0 ){
            dap = "짝";
        }else{
            dap = "홀";
        }

        System.out.println("주사위의 홀, 짝을 선택하시오");
        answer = scan.next();

        if( answer.equals(dap)){
            System.out.println("맞췄입니다");
        }else if( !answer.equals(dap)){
            System.out.println("틀렸습니다");
        }else{
            System.out.println("잘못눌렀습니다");
        }

    }
}
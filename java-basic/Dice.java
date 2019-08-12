import java.util.Scanner;
import java.util.Random;

class Dice{
    public static void main(String[] args){
        /**
         * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임
         * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
         * 사용자는 입력을 홀수 인거 같으면 '홀'을 선택, '짝'을 선택
         * 한다고 할 때 , 결과를 출력하세요
         */
        System.out.println("선택해주세요.");
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int dice = 0;
        dice = random.nextInt(6) + 1;   // nextInt(6)에서 6은 0~5까지 나오게 경계
        System.out.println(String.format("랜덤으로 나온 수 %d", dice));
        String dap = "";
       /**
        if(dice == 1 ){
            dap = "홀";
        }else if( dice == 2 ){
            dap = "짝";
        }else if( dice == 3 ){
            dap = "홀";
        }else if( dice == 4 ){
            dap = "짝";
        }else if( dice == 5 ){
            dap = "홀";
        }else{
            dap = "짝";
        }
        */
        if(dice % 2 == 0 ){
            dap = "짝";
        }else{
            dap = "홀";
        }
        System.out.println("주사위 값을 예측한 홀, 짝 입력 [ ] ");
        String answer = "";
        answer = scan.next();

        if( answer.equals(dap)){                        //  같으면
            System.out.println("정답입니다.");
        }else if( !answer.equals(dap)){                 // 같지 않으면
            System.out.println("틀렸습니다.");
        }else{
            System.out.println("잘못 선택하셨습니다.");
        }
    }
}
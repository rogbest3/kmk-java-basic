import java.util.Scanner;

class RRNumber{
    public static void main(String[] args){

        String ssn, num = "";

        System.out.println("주민등록번호 등록하시오");

        Scanner scan = new Scanner(System.in);
        ssn = scan.next();
        num = ssn.substring(7,8);

        if( num.equals("9")){
            System.out.println("9 : 1800 ~ 1899년에 태어난 남성");     
        }else if( num.equals("0")){
            System.out.println("0 : 1800 ~ 1899년에 태어난 여성");
        }else if( num.equals("1")){
            System.out.println("1 : 1900 ~ 1999년에 태어난 남성");
        }else if( num.equals("2")){
            System.out.println("2 : 1900 ~ 1999년에 태어난 여성");
        }else if( num.equals("5")){
            System.out.println("5 : 1900 ~ 1999년에 태어난 외국인 남성");
        }else if( num.equals("6")){
            System.out.println("6 : 1900 ~ 1999년에 태어난 외국인 여성");
        }else if( num.equals("3")){
            System.out.println("3 : 2000 ~ 2099년에 태어난 남성");
        }else if( num.equals("4")){
            System.out.println("4 : 2000 ~ 2099년에 태어난 여성");
        }else if( num.equals("7")){
            System.out.println("7 : 2000 ~ 2099년에 태어난 외국인 남성");
        }else if( num.equals("8")){
            System.out.println("8 : 2000 ~ 2099년에 태어난 외국인 여성");
        }else{

        }
    }
}
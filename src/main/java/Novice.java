import java.util.Scanner;

public class Novice {

    public static void main(String[] args) {
callMyName5Times("Dodo");
greetings();
    }


    public static void callMyName5Times(String name){
        for (int i = 0; i<5; i++){
            System.out.println(name);
        }
    }

    public static boolean isGreaterThan0 (int a){
        if (a>0){
            return true;
        }else return false;
    }

    public static double calcSquare(double a){
        return a*a;
    }

    public static void greetings (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, my name is Novice, how is your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name +". I hope you have a pleasant day");
    }



}

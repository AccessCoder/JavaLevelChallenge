import java.util.ArrayList;
import java.util.Scanner;

public class Intermediate {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<String> speicher = new ArrayList<String>();

    public static void main(String[] args) {
    giveMeTheNumString(0);

    }

    public static void giveMeTheNumString (int x){
        String [] numbr = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};
        if (x < 1 || x > 9){
            System.out.println("Bitte gebe eine einstellige Zahl zwischen 1 und 9 an!");
        }else {
            System.out.println(numbr[x-1]);
        }
    }

    public static void modulo3And5(){
        int count = 0;
        while (count<100){
            count++;
            if (count%3==0 && count%5==0){
                System.out.println("#$"+count);
            }else if (count%3==0){
                System.out.println("#"+count);
            }else if (count%5==0){
                System.out.println("$"+count);
            }else System.out.println(count);
        }
    }



    public static void saveMyWords(){
            System.out.println("Zum verlassen ENTER drücken! \nBitte gebe mir ein Wort, das ich speichern soll:");
            String helpMe = scanner.nextLine();
            if (helpMe.isEmpty()){
                System.out.println("EXIT!");
            }else {
                speicher.add(helpMe);
                System.out.println("Ich habe bis jetzt gespeichert: ");
                System.out.print(speicher +"\n");
                saveMyWords();
            }

    }



}

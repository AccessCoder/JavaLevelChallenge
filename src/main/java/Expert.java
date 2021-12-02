
import java.util.ArrayList;
import java.util.Arrays;

public class Expert {

    public static ArrayList<String> solution= new ArrayList<String>();

    public static void main(String[] args) {
       int[] num = {6,2,8,3,9,6,1,5,4,7,10,22,50,108};
        sortMyArray(num);

     querSumme(125);
     buildAnArray("Hallo, mein, Bester, Mann");
     convertToRoman(97);
    }

    public static void reverseMyString(String a){
        char[] zeichen = a.toCharArray();
        char[] reverse = new char[a.length()];
        for (int i = zeichen.length-1;i>=0;i--){
            reverse[(zeichen.length-1)-i] = zeichen[i];
        }
        System.out.println(reverse);
    }

    public static void sortMyArray(int[] x){
        int [] sort = x;
        int littleHelper;
        for (int i = x.length-1; i>0; i--){
            int count = 1;
            while (count<=i){
                if (sort[i]<sort[i-count]){
                    littleHelper = sort[i];
                    sort[i] = sort[i-count];
                    sort[i-count] = littleHelper;
                    count++;
                }else count++;
            }
            }
        System.out.println(Arrays.toString(sort));
        }

    public static void buildAnArray(String a){
        char[] zwischenlösung = a.toCharArray();
        int i =0;
        String solutionString="";
        while (i<zwischenlösung.length){
            if (zwischenlösung[i] ==','){
                solution.add(solutionString);
                solutionString="";
            i++;
            }else {
                solutionString += zwischenlösung[i];
                i++;
            }

        }
        System.out.println(solution);
    }


    public static void querSumme(int a){
        int b = 0;
        while (a !=0){
        b+=(a % 10);
        a/=10;
        }
            System.out.println(b);
        }

        //Kopiert!
        public static void convertToRoman(int a) {
        String[] romanChars = { "C", "XC", "L", "X", "IX", "V", "I" };
        int[] romanVals = { 100, 90, 50, 10, 9, 5, 1 };
        String romanNmbr = "";
        for (int i = 0; i < romanVals.length; i++) {
            int numberInPlace = a / romanVals[i];
            if (numberInPlace == 0){
                continue;
            }
            romanNmbr += numberInPlace == 4 && i > 0? romanChars[i] + romanChars[i - 1]:
                    new String(new char[numberInPlace]).replace("\0",romanChars[i]);
            a = a % romanVals[i];
        }
        System.out.println(romanNmbr);
    }
    }



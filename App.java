import java.time.LocalDate;

import static java.lang.Character.toUpperCase;

public class App {

    public static int[] zamiana(int[] arr, int a, int b){
        int k = arr[a];
        arr[a] = arr[b];
        arr[b] = k;
        return arr;
    }

    public static String encrypt(String str) {
        // BEGIN (write your solution here)
        var result = "";
        for (var i = 0; i < str.length(); i += 2){
            var nextSymbol = ( i + 2 > str.length()) ? "" : str.charAt(i + 1);
            result = result + nextSymbol + str.charAt(i);
        }
        return result;

    }

    public static String makeItFunny(String str, int n) {

        var i = 0;
        var result = "";
        while (i < str.length()){

            if ((i + 1) % n == 0 ){
                result = result + toUpperCase(str.charAt(i));
            }
            else {
                result = result + str.charAt(i);
            }
            i++;
        }
        return result;
        // END
    }

    public static String deleteSymbol(String str, char symbol){
        var i = str.length() - 1;
        var result = "";
        while (i >= 0){
            if (str.charAt(i) != symbol) {
                result = toUpperCase(str.charAt(i)) + result;
            }

            i = i - 1;
        }

        return result;
    }
    public static String reverse(String str) {
        var i = str.length() - 1;
        var result = "";
        while (i >= 0){
            result = result + str.charAt(i);
            i = i - 1;
        }

        return result;
    }
    public static String getSentenceTone(String sentence){

        if (sentence.equals(sentence.toUpperCase())){
            return "scream";
        }

        return "normal";
    }
    public static boolean notToday(String date){
        String todayDate = LocalDate.now().toString();
        return date.equals(todayDate);
    }
    public static boolean isInternationalPhone(String number){
        String firstSymbol = number.substring(0, 1);
        String plus = "+";
        return firstSymbol.equals(plus) == true;
    }
    public static void showCurrentDate(){
        var currentDate = LocalDate.now();
        var text = "Today is: " + currentDate;
        System.out.println(text);
    }

    public static void printMotto(){
        var text = "Winter is coming";
        System.out.println(text);
    }
}

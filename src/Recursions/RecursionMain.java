package Recursions;

public class RecursionMain {
    public static void main(String[] args) {
        //substitute a letter in a word
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));

        //permutation
        permuteString("", "ABC");

    }

    public static String substituteAI(String str) {
        //Base Case:
        if(str.length() == 0) { // if empty
            return str;
        }
        //Recursive Case:
        else if(str.charAt(0) == ('a')) {
            return 'i' + substituteAI(str.substring(1));
        }
        else {
            return str.charAt(0) + substituteAI(str.substring(1));
        }
    }

    public static void permuteString(String begin, String end) {
        // base case
        if (end.length() <= 1) {
            System.out.println(begin + end);
        }
        // recursion case
        else {
            for (int i = 0; i < end.length(); i++) {
                // fix position
                String newString = end.substring(0, i) + end.substring(i + 1); // "" + "BC" = "BC"
                // "" + "C" = "C"
                // left over
                permuteString(begin + end.charAt(i), newString);
            }
        }
    }

}
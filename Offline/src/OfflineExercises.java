//package code;

public class OfflineExercises {

    // Given a string, return a string where
    // for every char in the original,
    // there are two chars.

    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String input) {
        String res = "";
        char c;
        for(int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            res = res + c + c;
        }

        return res;
    }
    //
    // A sandwich is two pieces of bread with something in between. Return the
    // string that is between the first and last appearance of "bread" in the
    // given string, or return the empty string "" if there are not two pieces
    // of bread.

    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""

    public String getSandwich(String input) {
        String res = "";
//        res.contains();
//        res.endsWith();
//        res.startsWith();
        //if(input.)


        return "";
    }

    // Given three ints, a b c, one of them is small, one is medium and one is
    // large. Return true if the three values are evenly spaced, so the
    // difference between small and medium is the same as the difference between
    // medium and large.

    // evenlySpaced(2, 4, 6) → true
    // evenlySpaced(4, 6, 2) → true
    // evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {
        int res = 0;
        int res2 = 0;
        int[] arr = {a,b,c};
        int n = arr.length;
        int temp = 0;
        boolean result;

        //bubble sort
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < (n - i); j++) {
                if(arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        res = arr[1] - arr[0];
        res2 = arr[2] - arr[1];

        if(res == res2) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    // Given a string and an int n, return a string made of the first and last n
    // chars from the string. The string length will be at least n.

    // nTwice("Hello", 2) → "Helo"
    // nTwice("Chocolate", 3) → "Choate"
    // nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String input, int a) {
        int sLength = input.length();
        int b = sLength - a;
        String res = "";
        for(int i = 0; i < a; i++) {
            res = res + input.charAt(i);
        }
        for(int i = b; i < sLength; i++) {
            res = res + input.charAt(i);
        }
        return res;
    }

    // Given a string, return true if it ends in "ly".

    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false

    public boolean endsly(String input) {
        boolean res;
        int l = input.length();
        if(l < 2) {
            res = false;
        } else {
            if (input.charAt(l - 1) == 'y' && input.charAt(l - 2) == 'l') {
                res = true;
            } else {
                res = false;
            }
        }

        return res;
    }

    // Given a string, return recursively a "cleaned" string where adjacent
    // chars that are the same have been reduced to a single char. So "yyzzza"
    // yields "yza".

    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"
    public String stringClean(String input) {
        String res = "";

        for(int i = 0; i < input.length(); i++) {
            if(i + 1 > input.length() - 1) {
                if(input.charAt(i) != input.charAt(input.length() - 1)) {
                    res = res + input.charAt(input.length() - 1);
                }
                break;
            } else {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    continue;
                } else {
                    res = res + input.charAt(i);
                }
            }
        }

        return res;
    }

    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are 0
    // and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
    // 21 and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    // fibonacci(0) → 0
    // fibonacci(1) → 1
    // fibonacci(2) → 1

    public int fibonacci(int input) {
        int res = 0;
        OfflineExercises oe;

        for(int i = 0; i < input; i++) {
           // oe.fibonacci(input - 1) + oe.fibonacci(input - 2);
        }

        return res;
    }

    // We have a number of bunnies and each bunny has two big floppy ears. We
    // want to compute the total number of ears across all the bunnies
    // recursively (without loops or multiplication).
    //
    // bunnyEars(0) → 0
    // bunnyEars(1) → 2
    // bunnyEars(2) → 4

    public int bunnyEars(int input) {
        return -1;
    }

}

//Input: Malayalam
//Input: Tamil

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static boolean palindrome (String s) {
       int len = s.length();
       char[] charArr = s.toCharArray();
       int f = 0, r = len-1;
       for (int i=0; i<len/2; i++) {
if(!(Character.toLowerCase(charArr[f]) == (Character.toLowerCase(charArr[r])))) {
               
               return false;
           }
           f++;
         r--;
       }
       return true;
    }
    public static void main(String[] args) {
        System.out.print(palindrome("Malayalam"));
    }
}

//Output: True
//Output: false

//It would be a pleasure to discuss this exciting opportunity with you
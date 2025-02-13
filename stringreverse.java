//Input: b!!!c.d.e,f'g,hij
//Output: Answer is : j!!!i.h.g,f'e,dcb

class Main {
    public static void main(String[] args) {
        String s = "k,f'.e..':,hijb!!!c.d.e";
        
        char[] charArr = s.toCharArray();
        int r = charArr.length - 1, l = 0;
        
        while (l < r) {
            if (!Character.isAlphabetic(charArr[l])) {
                l++;
            } else if (!Character.isAlphabetic(charArr[r])) {
                r--;
            }
            
            else {
                char c = charArr[l];
                charArr[l] = charArr[r];
                charArr[r] = c;
                l++;
                r--;
            }
        }
        String rs = new String(charArr);
        System.out.println("Answer is : "+rs);
    }
}

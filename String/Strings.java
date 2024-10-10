
public class Strings {

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String str = "racecar";
        // System.out.println(isPalindrome(str));

        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a';ch<='z';ch++){
            sb.append(ch);
        }
        //o(26)
        System.out.println(sb.length());
        System.out.println(sb);


        

        
    }
}
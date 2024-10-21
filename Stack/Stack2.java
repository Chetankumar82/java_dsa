import java.util.*;

public class Stack2 {
    //valid parenthesis
    public static boolean isValid(String str){
        Stack<Character>s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch=='('|| ch=='{'|| ch=='[') {
                s.push(ch);
            }else{
                //closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek()=='(' && ch==')')||(s.peek() == '{'&&ch=='}') || (s.peek()=='[' && ch==']')) {
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        } else{
            return false;
        }
    }
    //duplicate parenthesis
    public static boolean isDuplicate(String str){
        Stack<Character>s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //closing
            if (ch==')') {
                int count = 0;
                while (s.peek()!='(') {
                    s.pop();
                    count++;
                }
                if (count<1) {
                    return true;
                }else{
                    s.pop();
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    //Max area in histogram
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        //next smaller right = O(n)
        Stack<Integer>s = new Stack<>();

        for (int i = arr.length-1; i >=0; i--) {
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        //next smaller left = O(n)
        s= new Stack<>();
        for(int i=0;i<arr.length;i++){
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //current area : width = j-i-1 = nsr[i]-nsl[j]-1
        for (int i = 0; i < nsl.length; i++) {
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram = "+maxArea);
    }
    public static void main(String[] args) {
        // String str = "[()]";
        // System.out.println(isValid(str));

        // String str = "((a+b))";
        // String str1 = "(a-b)";
        // System.out.println(isDuplicate(str));
        // System.out.println(isDuplicate(str1));


        int arr[] = {2,1,5,6,2,3};
        maxArea(arr);
    }
}

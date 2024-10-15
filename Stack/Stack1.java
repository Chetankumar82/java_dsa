import java.util.Stack;
public class Stack1 {

    //push at the bottom of the stack-O(n)
    public static void pushAtBottom(Stack<Integer>s,int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    //reverse a string using a stack
    public static String reverseString(String str){
        Stack<Character>s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }


    //reverse a stack

    public static void reverseStack(Stack<Integer>s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer>s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    //stock span problem
    public static void stockSpan(int Stocks[],int span[]){
        Stack<Integer>s = new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i = 1;i<Stocks.length;i++){
            int currPrice = Stocks[i];
            while (!s.isEmpty()&&currPrice>Stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        //push at bottom in stack
        // Stack<Integer>s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s,4);
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }



        // reverse an string in stack

        // String str = "abc";
        // String result = reverseString(str);
        // System.out.println(result);

        //reverse a stack
        // Stack <Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // reverseStack(s);
        // printStack(s);

        //stock span problem
        // int Stocks[] = {100,80,60,70,60,85,100};
        // int span[] = new int[Stocks.length];
        // stockSpan(Stocks, span);
        // for (int i = 0; i < span.length; i++) {
        //     System.out.println(span[i]+" ");
        // }

        //next greater element

        int arr[] = {6,8,0,1,3};
        Stack<Integer>s = new Stack<>();
        int nextGreater[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //1.while
            while (!s.isEmpty()&&arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            //2. if-else
            if (s.isEmpty()) {
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            //3 push in s
            s.push(i);
        }
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }

    
}
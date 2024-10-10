public class RecursionBasics{
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        // fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }

    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int snm1 = calcSum(n-1);
        int sn = n+snm1;
        return sn;
    }
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int f1 = fib(n-1);
        int f2 = fib(n-2);
        return f1+f2;
    }
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static int optimizedPower(int a , int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower*halfPower;
        if(n%2!=0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        //vertical choice
        // int fnm1 = tilingProblem(n-1);
        //horizontal choice
        // int fnm2 = tilingProblem(n-2);

        // int totways = fnm1+fnm2;
        // return totways;
        return tilingProblem(n-1)+tilingProblem(n-2);
    }
    public static void removeDuplicates(String str,int idx , StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newstr, map);
        }
        else {
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newstr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        //choice
        //single
        // int fnm1 = friendsPairing(n-1);
        //pair
        // int fnm2 = friendsPairing(n-2);
        // int pairWays = (n-1)*fnm2;
        //totways
        // int totways = fnm1+pairWays;
        // return totways;
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);

    }
    public static void printBinString(int n,int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1, 0, str+"0");
        if(lastplace==0){
            printBinString(n-1, 1, str+"1");
        }
    }
    
    public static void main(String[] args) {
        // int n=5;
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        // System.out.println(fib(n));
        // int arr[] = {1,2,3,5,4,6,5,7,8};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, 0));
        // System.out.println(power(2, 5));
        // System.out.println(optimizedPower(2, 5));
        // System.out.println(tilingProblem(2));
        // String str = "apnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));
       printBinString(3, 0, "");
    }
}
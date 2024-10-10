//swap of two number
//Call by value :- java always calls by value


public class Demo {

    public static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static int binCoeff(int n,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }

    //function overloading using parameters

    // public static int sum(int a, int b){
    //     return a+b;

    // }
    // public static int sum(int a, int b,int c){
    //     return a+b+c;
        
    // }


    //function overloading using data type
    public static int sum(int a , int b){
        return a+b;
    }

    public static float sum (float a, float b){
        return a+b;
    }

    // public static boolean isPrime(int n){
    //     boolean isPrime = true;
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i = 2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;

    //         }
    //     }
    //     return true;
    // }

    public static boolean isPrime(int n){
        boolean isPrime = true;
        if(n==2){
            return true;
        }
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;

            }
        }
        return true;
    }

    public static void PrimesInRange(int n){
        for(int i=2; i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    public static void binToDec(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        while (binNum>0) {
            int lastDigit = binNum%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;


            
        }
        System.out.println("decimal of "+ myNum + " = " + decNum);

    }
    

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while(n>0){
            int rem = n%2;
            binNum = binNum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of " + myNum + " is " + binNum);
    }


    public static void main(String[] args) {
        // int a = 5;
        // int b = 10;
        // swap(a,b);


        // int a = 3;
        // int b = 5;
        // int prod = multiply(a,b);
        // System.out.println("a*b: " + prod);


        // System.out.println(factorial(7));

        // System.out.println(binCoeff(5, 2));



        // System.out.println(sum(2,6));
        // System.out.println(sum(3.2f,4.8f));

        // System.out.println(isPrime(3));



        // PrimesInRange(100);
        // binToDec(101);
        

        decToBin(16);


        
    }
}




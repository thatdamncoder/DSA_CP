package LinkedLists;

public class P03_LL_HappyNumberGoogle {
    public static void main(String[] args) {
        System.out.println(isHappy(23));
    }
    static boolean isHappy(int n){
        int slow=n;
        int fast=n;

        do{
            slow=square(slow);
            fast=square(square(fast));    //double times like fast pointer in linkedlist
        }while(slow!=fast);  //check for cycle

        return slow==1;
    }
   static int square(int n){
        int sum=0;
        while(n!=0){
            sum = sum + (int)Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }
}


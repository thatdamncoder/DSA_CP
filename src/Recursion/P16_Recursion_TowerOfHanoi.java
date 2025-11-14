package Recursion;

public class P16_Recursion_TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println(towerOfHanoi(3,'A','B','C'));
    }
    static int towerOfHanoi(int n, char source, char helper, char destination){
        int count=0;
        if(n==1){
            System.out.println(source + " -> " + destination);
            return 1;
        }
        count=count+towerOfHanoi(n-1,source, destination, helper);
        count=count+towerOfHanoi(1,source,helper,destination);
        count=count+towerOfHanoi(n-1,helper,source,destination);

        return count;
    }
}

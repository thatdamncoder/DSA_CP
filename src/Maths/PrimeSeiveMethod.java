package Maths;

//finding all prime numbers in a range
//dont check for all numbers
//if 2 is prime, all that divides 2 must be non-prime, mark them as not prime and continue for
//numbers that have not been marked
//this is called sieve of Erastosthenes
public class PrimeSeiveMethod {
    public static void main(String[] args) {
        int n=100;
        sieveprime(n,new boolean[n+1]);
    }
    static void sieveprime(int n, boolean[] visited){
        //visited=true => number is not prime
        for(int i=2;i*i<=n;i++) {
            if (!visited[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    visited[j] = true;
                }
            }
        }
        System.out.println(visited[79]?"not prime":"prime");
//        for (int i = 2; i <=n ; i++) {
//            if(!visited[i]) System.out.print(i+" ");
//        }
    }
}

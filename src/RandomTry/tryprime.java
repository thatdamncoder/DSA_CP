package RandomTry;

public class tryprime {
    public static void main(String[] args) {
        long n=100000;
        sieveprime(n,new boolean[(int)(n+1)]);
    }
    static void sieveprime(long n, boolean[] visited){
        //visited=true => number is not prime
        for(long i=2;i<=n;i++) {
            if (!visited[(int)i]) {
                for (long j = i * i; j <= n; j = j + i) {
                    visited[(int)j] = true;
                }
            }
        }
        System.out.println(visited[79]?"not prime":"prime");
//        for (int i = 2; i <=n ; i++) {
//            if(!visited[i]) System.out.print(i+" ");
//        }
    }

}

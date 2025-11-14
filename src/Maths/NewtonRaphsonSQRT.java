package Maths;

public class NewtonRaphsonSQRT {
    public static void main(String[] args) {
        int n=6;
        System.out.println(newtonsqrt(n));
    }

    //time complexity -  logn f(n)
    //where f(n) = f(x)/f'(x) that is the complexity taken for calculating f(x)/f'(x)
    //with some n-digit precision
    static double newtonsqrt(double n){
        double x=n;
        double root;
        while(true){
            root= 0.5 * (x + (n/x));
            if(Math.abs(root-x)<0.5){
                //0.5 more precision
                //can also use 1
                break;
            }
            x=root;
        }
        return root;
    }
}

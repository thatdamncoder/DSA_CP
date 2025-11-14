package RandomTry;

public class pattern {
    public static void main(String[] args) {
        p(5,0);
    }
    static boolean reverserows=false;
    static void p(int n,int row){
        if(row==(2*n)-1){
            return;
        }
        if(reverserows && row<0){
            return;
        }

        for (int space = 0; space < n - row; space++) {
            System.out.print(" ");
        }
        int t = 0;
        boolean reverse = false;
        System.out.print(t++);
        for (int col = 0; col < (2 * row) + 1; col++) {
            if (col == row) {
                reverse = true;
            }
            System.out.print(t);
            if (reverse) t = t - 1;
            else t = t + 1;
        }
        System.out.println();
        if(reverserows || row>=n){
            reverserows=true;
            p(n,row-1);
        }
        else{
            p(n,row+1);
        }

    }
}

package CodeForces;

import java.util.*;

public class GameOfMarblesEasy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            long[] alice=new long[n];
            long[] bob=new long[n];
            for(int i=0;i<n;i++) alice[i]=sc.nextLong();
            for(int i=0;i<n;i++) bob[i]=sc.nextLong();
            List<long[]> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(new long[]{alice[i]+bob[i],(long)i});
            }
            list.sort(Comparator.comparingLong(array -> array[0]));
            long ans=0L;
            for(int i=n-1;i>=0;i--){
                int index=(int)list.get(i)[1];
                if((n-i-1)%2==0) ans+=alice[index]-1;
                else ans-=bob[index]-1;
            }
            System.out.println(ans);
        }

    }
    static void notworking(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        while(num--!=0){
            int n=sc.nextInt();
            int[] alice=new int[n];
            int[] sortedalice=new int[n];
            Map<Integer, List<Integer>> mapA=new HashMap<>();
            for (int i = 0; i < n; i++) {
                alice[i]=sc.nextInt();
                sortedalice[i]=sc.nextInt();
                if(!mapA.containsKey(alice[i])){
                    mapA.put(alice[i],new ArrayList<>());
                }
                mapA.get(alice[i]).add(i);
            }
            Arrays.sort(sortedalice);
            int[] bob=new int[n];
            Map<Integer, List<Integer>> mapB = new HashMap<>();

            int[] sortedbob=new int[n];
            for (int i = 0; i < n; i++) {
                bob[i]=sc.nextInt();
                sortedbob[i]=sc.nextInt();
                if(!mapB.containsKey(bob[i])){
                    mapB.put(bob[i],new ArrayList<>());
                }
                mapB.get(bob[i]).add(i);
            }
            Arrays.sort(sortedbob);

            int count=0;
            int i=0;
            int j=0;
            for(int l=0;l<n && i<n && j<n;l++){
                if(l%2==0){
                    //alice will play
                    int index=0;
                    if(mapB.get(sortedbob[i])!=null){
                        index=mapB.get(sortedbob[i]).get(0);
                        mapB.get(sortedbob[i]).remove(0);
                    }

                    if(bob[index]!=0){
                        count=count+(alice[index]-1);
                    }else{
                        l--;
                    }
                    bob[index]=0;
                    alice[index]=0;
                    i++;
                }
                else{
                    int index=0;
                    if(mapA.get(sortedalice[j])!=null){
                        index=mapA.get(sortedalice[j]).get(0);
                        mapA.get(sortedbob[j]).remove(0);
                    }

                    if(alice[index]!=0){
                        count=count-(bob[index]-1);
                    }else{
                        l--;
                    }
                    bob[index]=0;
                    alice[index]=0;
                    j++;
                }

            }
            System.out.println(count);
        }
    }
}

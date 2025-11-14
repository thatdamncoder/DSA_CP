package RandomTry;

public class JPMorganColorGame {
    public static void main(String[] args) {
        System.out.println(colorgame("AAAAABBBBBBAAAAA",true));
    }
    static boolean colorgame(String colors,boolean alice){
        if(colors.isEmpty()){
            return !alice;
        }
        boolean found=false;

            while(colors.contains("AAA") || colors.contains("BBB") ){
                if(alice){ //&& colors.charAt(i-1)=='A'){
                    found=true;
                    colors=colors.replace("AAA","AA");
                    break;
                }
                if(!alice){ //&& colors.charAt(i-1)=='B'){
                    found=true;
                    colors=colors.replace("BBB","BB");
                    break;
                }
            }

        if(!found || colors.isEmpty()){
            return !alice;
        }
        return colorgame(colors,!alice);
    }
}

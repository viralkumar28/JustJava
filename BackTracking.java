public class BackTracking {
    public static void main(String[] args) {
        String str = "ABC";
        printPermutation(str,"",0);
    }
    public static void printPermutation(String str, String perm, int index){
        if(str.isEmpty()){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutation(newStr, perm+currChar,index+1);
        }
    }
}

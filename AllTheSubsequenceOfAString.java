public class AllTheSubsequenceOfAString {
    public static void main(String[] args) {
        //String str="abc";
        //subSeq(str, 0,"");
        subSeq1("", "abc");
    }
    // public static void subSeq(String  str, int idx, String newStr){
    //     if(idx==str.length()){
    //         System.out.println(newStr);
    //         return;
    //     }
    //     char currChar=str.charAt(idx);
    //     subSeq(str, idx+1, newStr+currChar);
    //     subSeq(str, idx+1, newStr);
    // }
    public static void subSeq1(String  str1, String newStr){
        if(newStr.isEmpty()){
            System.out.println(str1);
            return;
        }
        char currChar=newStr.charAt(0);
        subSeq1(str1+currChar, newStr.substring(1));
        subSeq1(str1,newStr.substring(1));
    }
}

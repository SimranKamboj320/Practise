public class SubSets {
    public static void Subset(String str, int i, String ans){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        Subset(str, i+1, ans+str.charAt(i));
        Subset(str, i+1, ans);
    }
    public static void main(String args[]){
        String str = "abc";
        Subset(str, 0, "");
    }
}
//2^n

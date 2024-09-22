public class clear {
    public static int clearith(int i, int n){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearith(1, 10));
    }
}

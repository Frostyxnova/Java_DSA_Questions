package recursion_questions;

public class powerOfTwo {
    public static void main(String[] args) {
     int ans=   powerOf2(5);
        System.out.println(ans);

    }
    static int powerOf2(int n){
        if (n==0){
            return 1;
        } else{
            var power = 2*powerOf2(n-1);
            return power;
        }
    }
}

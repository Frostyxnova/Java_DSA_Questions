public class numberOfSteps {
    public static void main(String[] args) {
        int num = 14;

    }
    class Solution {
        public int numberOfSteps(int num) {
            if(num != 0){
                if(num%2 == 0)
                    return 1+numberOfSteps(num/2);
                else
                    return 1+numberOfSteps(num-1);
            }
            return 0;
        }
    }
}


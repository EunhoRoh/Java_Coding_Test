public class NumberChangeRule {
    public static void main(String[] args){
        int[] num = {4, 2, 5,4};
        int result = ruleGame(num, num.length);
        System.out.println("Result: "+result);
    }

    static int ruleGame(int[] num, int numLength){
        int startIndex = 0;
        int endIndex = numLength;

        while (endIndex - startIndex >1){
            int temp = num[startIndex+1];
            for(int i= startIndex+1; i<endIndex-1; i++){
                num[i] = num[i+1];
            }
            num[endIndex-1] =temp;
            startIndex++;

        }
        return num[startIndex];
    }
}

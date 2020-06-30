
public class Main {

    public static void main(String[] args) {
        int[] sums= sumOfSimilaritiesOfSuffixes(args);
        printValues(sums);
    }

    private static void printValues(int[] values){
        for (int value : values) {
            System.out.println(value);
        }
    }

    private static int[] sumOfSimilaritiesOfSuffixes(String[] strs){
        int[] sums = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            sums[i] = sumOfSimilaritiesOfSuffixes(strs[i]);
        }
        return sums;
    }

    private static int sumOfSimilaritiesOfSuffixes(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            String subStr = str.substring(i);
            int similarty = getSmilarityValue(str, subStr);
            sum+=similarty;
        }
        return sum;
    }

    private static int getSmilarityValue(String str1, String str2){
        int i=0;
        for(;i<str1.length() && i<str2.length();i++){
            if(str1.charAt(i) != str2.charAt(i)){
                break;
            }
        }
        return i;
    }
}
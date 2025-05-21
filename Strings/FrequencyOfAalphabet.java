//count the no of variables in that string.
public class FrequencyOfAalphabet {
    public static void main(String[] args) {
        String str = "aaabbbccc";       //a3b3c3
        StringBuilder newStr = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                count++;
            }
            else{
                newStr.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        newStr.append(str.charAt(str.length()-1)).append(count);
        System.out.println(newStr.toString());
    }
}

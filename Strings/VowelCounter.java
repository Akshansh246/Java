public class VowelCounter {
    public static void main(String[] args) {
        String str = "hellooadarrhbcv";
        int count = 0;
        int countcon = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'||str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='e'||str.charAt(i)=='u') {
                count++;
            }
            else countcon++;
        }
        System.out.println(count);
        System.out.println(countcon);
    }   
}
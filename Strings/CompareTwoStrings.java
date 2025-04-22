public class CompareTwoStrings {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        if (a.length()!=b.length()) {
            System.out.println(a+" and "+b+ " are not equal");
        }
        else{
            boolean flag = true;
            int len = (a.length()>b.length())?a.length():b.length();
            for (int i = 0; i < len; i++) {
                if (a.charAt(i)!=b.charAt(i)) {
                    flag = false;
                    break;
                }
                else flag = true;
            }
            if (flag) {
                System.out.println(a+" and "+b+ " are equal");
            }
            else System.out.println(a+" and "+b+ " are not equal");
        }
    }
}

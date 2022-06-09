public class StringProg {
    public static void main(String[] args) {
        String test = "xyzXY123XYabcXY";
        String word = "XY";
        String result = "";
        String pattern[] = test.split(word);

        for (int i = 0; i < pattern.length; i++) {
            int length = pattern[i].length();
            if (i == 0) {
                // strend
                if (!(pattern[i].equals(""))) {
                    // if not empty
                    String strend = pattern[i].substring(length - 1, length);
                    result = strend;
                }
            }
            // strbegin
            else if (i == pattern.length - 1 && !(test.endsWith(word))) {
                String strbegin = pattern[i].substring(0, 1);
                result = result.concat(strbegin);
                break;
            }
            // strend + strbegin
            else {
                String strend = pattern[i].substring(length - 1, length);
                String strbegin = pattern[i].substring(0, 1);
                result = result.concat(strbegin).concat(strend);
            }
        }
        System.out.println("Final output : " + result);
    }
}
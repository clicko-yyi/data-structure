package offer;

public class O5 {

    public static void main(String[] args) {
        String x = "We are happy.";


        O5 test = new O5();
        System.out.println(test.replaceSpace(x));
    }

    public String replaceSpace(String s) {
        final String replace = "%20";

        StringBuffer sb = new StringBuffer();

        for (char c : s.toCharArray()) {
            if(c == ' '){
                sb.append(replace);
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

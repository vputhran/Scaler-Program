package day63_Intermediate_DSA_Strings.homework_batch2;

public class Q2_CountOccurrences {
    public static void main(String[] args) {
//        String A = "bobob";
        String A = "rbobobbobljzjdbobbobpncbobobobadbobvlrrbobmypibobbqiycbobdcpbobybobgjqgbobuccboboybobmbob";
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        // subArr length is A.length-2 because we are storing a sub array of length 3
        // in each index of subArr, so the overall length is reduced by 2
        String[] subArr = new String[A.length()-2];
        StringBuilder st = new StringBuilder(); //st is used to create sub-array of length 3
        for (int i = 0; i < A.length()-2; i++) {
            int sIdx = i;
            int eIdx = i+2;
            while (sIdx <= eIdx) {
                st.append(A.charAt(sIdx));
                sIdx++;
            }
            subArr[i] = st.toString();
            st.setLength(0); // setting st length to 0
        }
        int count = 0;

        for (int i = 0; i < subArr.length; i++) {
            if (subArr[i].equals("bob")) {
                count++;
            }
        }
        return count;
    }
}

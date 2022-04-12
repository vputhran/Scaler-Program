package day63_Intermediate_DSA_Strings.assignments_batch2;

public class Q1_ReverseTheStringWordByWord {
    public static void main(String[] args) {
//        String A = "the sky is blue";
        String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(solve(A));
    }
//    public static String solve(String A) {
//        StringBuilder st = new StringBuilder();
//        for (int i = 0; i < A.length(); i++) {
//            if (i == A.length() - 1 && A.charAt(A.length() - 1) == ' ') {
//                break;
//            } else st.append(A.charAt(i));
//        }
//        //Reverse the entire String
//        reverse(st, 0, st.length() - 1);
//
//        //Reverse each word based on space
//        for (int i = 0; i < st.length(); i++) {
//            int sIdx = i;
//            int eIdx = i;
//            while (st.charAt(eIdx) != ' ' && eIdx < st.length()-1) {
//                eIdx++;
//            }
//
//            if (eIdx == st.length()-1) {
//                reverse(st, sIdx, eIdx);
//            } else reverse(st, sIdx, eIdx-1);
//            i = eIdx;
//        }
//        return st.toString();
//    }
//
//    public static StringBuilder reverse(StringBuilder A, int s, int e) {
//        while (s < e) {
//            char temp = A.charAt(s);
//            A.setCharAt(s, A.charAt(e));
//            A.setCharAt(e, temp);
//            s++;
//            e--;
//        }
//        return A;
//    }

    public static String solve(String s) {
        StringBuilder res = new StringBuilder();
        StringBuilder buf = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--)
        {
            char c = s.charAt(i);
            if(c!=' ') buf.append(c);
            else create(res, buf);
        }

        create(res, buf);
        return res.toString();
    }

    private static void create(StringBuilder res, StringBuilder buf)
    {
        int i = buf.length()-1;

        while(i>=0){
            if(i==buf.length()-1 && res.length()>0)
                res.append(' ');
            res.append(buf.charAt(i));
            i--;
        }
        buf.setLength(0);
    }
}

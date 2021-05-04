package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str = "ABC";
        computePermutation(str,"");
    }

    public static void computePermutation(String ques, String asf){
        if(ques.length() == 0){
            System.out.println(asf);
        }
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0,i);
            String qrpart = ques.substring(i+1);
            String roq = qlpart + qrpart;
            computePermutation(roq, asf+ch);
        }
    }
}

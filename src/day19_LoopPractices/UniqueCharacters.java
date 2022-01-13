package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabcccd";
        String result = "";

        for (int i = 0;  i < str.length(); i++) {
            char each = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(each == ch){
                  count++;
                }

            }
        if(count != 1){
            continue;

}
            result+=each;

        }


        System.out.println(result);

    }
}

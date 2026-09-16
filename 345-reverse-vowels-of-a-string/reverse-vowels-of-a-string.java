class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;

        char[] ch = s.toCharArray();

        while(i < j){
            if(!isvovel (ch[i])){
                i++;
            }else if(!isvovel (ch[j])){
                j--;
            }else{
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;

                i++;
                j--;
            }
        }
        return new String(ch);
    }
    private boolean isvovel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
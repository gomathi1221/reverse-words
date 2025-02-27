
class Solution {
    // Function to reverse words in a given string
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        String t="";
        for(int i=words.length-1;i>=0;i--){
            t+=words[i];
            if(i!=0){
                t+=" ";
            }
        }
        return t.toString();
    }
}
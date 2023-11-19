class IsAnagramS {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.length() == 0 && t.length() == 0)
            throw new IllegalArgumentException("Both input strings are empty");
        int[] char_counts = new int[26];
        String s1 = s.toLowerCase();
        String t1 = t.toLowerCase();

        for(int i = 0; i < s1.length(); i++)
        {
            char_counts[s1.charAt(i)-'a']++;
            char_counts[t1.charAt(i)-'a']--;
        } 
        for(int num:char_counts){
            if (num!=0) return false;
        }
        return true;
    }


public static void main(String[] args){
    IsAnagramS isana = new IsAnagramS();
    String s1="";
    String s2="";
    boolean res = isana.isAnagram(s1,s2);
    System.out.println(res);
}

}
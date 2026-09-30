class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        // compare hash map of both characters
        Map<Character, Integer> sLetters = new HashMap<>();
        Map<Character, Integer> tLetters = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character s_i = s.charAt(i);
            Character t_i = t.charAt(i);
            if(!sLetters.containsKey(s_i)){
                sLetters.put(s_i, 1);
            } else{
                sLetters.put(s_i, sLetters.get(s_i)+1);
            }
            if(!tLetters.containsKey(t_i)){
                tLetters.put(t_i, 1);
            } else{
                tLetters.put(t_i, tLetters.get(t_i)+1);
            }
        }

        // check the hashmaps
        if(sLetters.equals(tLetters))
            return true;

        return false;
    }
}

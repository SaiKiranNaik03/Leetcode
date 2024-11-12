class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char org=s.charAt(i);
            char repl=t.charAt(i);
            if(!hm.containsKey(org)){
                if(!hm.containsValue(repl)){
                    hm.put(org,repl);
                }
                else{
                    return false;
                }
            }
            else{
                if(repl!= hm.get(org)){
                    return false;
                }
            }
        }
        return true;
    }
}
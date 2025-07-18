class Solution {
    String check(String x){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<x.length();i++){
            int j=i+1;
            while(j<x.length()&&x.charAt(i)==x.charAt(j))
                j++;
            sb.append(j-i).append(x.charAt(i));
            i=j-1;
        }
        return sb.toString();
    }

    public String countAndSay(int n) {
        String x="1";
        for(int i=1;i<n;i++)
            x=check(x);
        return x;
    }
}
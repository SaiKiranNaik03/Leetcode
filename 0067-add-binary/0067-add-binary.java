class Solution {
    public String addBinary(String a, String b) {
     if(a.length() < b.length()) return addBinary(b,a);
        int i=a.length()-1, j=b.length()-1, k=a.length(), carry=0;
        char[] res=new char[a.length()+1];
        while(k>0 || carry==1){
            int char1= i>=0 ? a.charAt(i--) - '0' :0;
            int char2= j>=0 ? b.charAt(j--) - '0' :0;
            int sum=carry+char1+char2;
            res[k--]=(char)((sum & '1')+'0');
            carry=sum>>1;
        }
        return new String(res, k+1, res.length-k-1);
    }
}
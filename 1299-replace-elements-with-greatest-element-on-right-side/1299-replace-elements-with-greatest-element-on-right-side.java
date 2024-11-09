class Solution {
   
    public int[] replaceElements(int[] arr) {
        int l=arr.length-1;
        int mx=arr[l];
        arr[l]=-1;
        for(int i=l-1;i>=0;i--)
        {
            int c=arr[i];
            arr[i]=mx;
            if(mx<c)
            mx=c;
        }
        return arr;
    }
}
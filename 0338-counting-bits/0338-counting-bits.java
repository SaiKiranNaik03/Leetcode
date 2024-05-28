class Solution {
  public int countSet(int n){
    int count=0;
      while(n>1){
        if(n%2==1){
          count++;
        }
        n/=2;
      }
      if(n==1){
        count++;
      }
      return count;
  }
  public int[] countBits(int n) {
      int arr[] = new int[n+1];
      for(int i=0;i<=n;i++){
        arr[i]=countSet(i);
      }
    return arr;
    }
}
class Solution {
  public static int count1(int num){
    int count=0;
    while(num != 0){
      num = num & num-1;
      count++;
    }
    return count;
  }
    public int minBitFlips(int start, int goal) {
      int n = start ^ goal;
      return count1(n);
    }
}
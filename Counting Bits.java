

public class Solution {
    public int[] countBits(int num) {
        
        int[] f = new int[num + 1];
        for (int i = 0; i <= num; i++) f[i] = f[i >> 1] + (i & 1);  //right shift by 1 bit will divide i by 2 in bitwise 
        return f;													//so i = 0 f = 0; i = 1 f[0] = 0 plus (1&1) = 1 so f[1] = 1
    }
}
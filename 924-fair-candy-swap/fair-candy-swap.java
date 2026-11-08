class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        int sumB=0;
        for(int i=0; i<aliceSizes.length; i++) {
            sumA+=aliceSizes[i];
        }
        
        for(int i=0; i<bobSizes.length; i++) {
            sumB+=bobSizes[i];
        }
        int diff=(sumB-sumA)/2;

        for(int i=0; i<aliceSizes.length; i++) {
            int x=aliceSizes[i];
            int y = x+diff;
            for(int j=0; j<bobSizes.length; j++) {
                if(bobSizes[j]==y) {
                    return new int[]{x,y};
                }
            }
        }
         return new int[]{};
    }
}
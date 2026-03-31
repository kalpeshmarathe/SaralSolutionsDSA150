class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int [height.length];
        left[0] = height[0];
        right[height.length - 1] = height[height.length-1];
        for(int i = 0 ; i < height.length ; i++)
        {
            if(i > 0){
            left[i] = Math.max(height[i],left[i-1]);
            }
            
        }
        for(int i = height.length-1 ; i >= 0 ; i--)
        {
            
            if(i < height.length-1)
            {
                right[i] = Math.max(height[i],right[i+1]);
            }
        }
        int maxwater = 0;

        for(int i = 0 ; i < height.length ; i++)
        {
            maxwater += Math.min(left[i] , right[i]) - height[i];
        }
        return maxwater;
    }
}

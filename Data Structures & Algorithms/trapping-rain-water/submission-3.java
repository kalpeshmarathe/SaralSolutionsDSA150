class Solution {
    public int trap(int[] height) {
        int n = height.length - 1;
        int left = 0;
        int leftmax = height[left];
        int right = n;
        int rightmax = height[right];
        int water = 0;
        while(left < right)
        {
            if(leftmax < rightmax)
            {
                left++;
                water += Math.max(0, (leftmax - height[left]));
                leftmax = Math.max(leftmax , height[left]);
            }else{
                right--;
                water += Math.max(0, (rightmax - height[right]));
                rightmax = Math.max(rightmax , height[right]);
            }
        }
        return water;

    }
}

class Solution {
    public int maxArea(int[] heights) {
        int i = 0 ;
        int j = heights.length - 1;
        int water = 0;
        int maxwater = 0;
        while(i<j)
        {
            water = (j-i)*Math.min(heights[i],heights[j]);
            maxwater = Math.max(water , maxwater);

            if(heights[i] < heights [j])
            {
                i++;
            }
            else{
                j--;
            }
        }

        return maxwater;
    }
}

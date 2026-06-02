class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        int h=k-1;
        int avg=0;
        int maxavg=0;

        for(int i=0;i<k;i++){
            avg+=nums[i];
        }
        maxavg=avg;


        for(int i = k; i < nums.length; i++) {
            avg = avg + nums[i] - nums[i - k];
            maxavg = Math.max(maxavg, avg);
        }

        return (double) maxavg / k;
    }
}
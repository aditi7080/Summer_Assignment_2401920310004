class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque <Integer> dq=new ArrayDeque<>();
        int [] arr=new int[n-k+1];
        int s=0;
        int e=k-1;

        for(int i=0; i<n ;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k ){
                dq.pollFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()]< nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i>=k-1){
                arr[s++]=nums[dq.peekFirst()];
            }
        }
        return arr;

    }
}
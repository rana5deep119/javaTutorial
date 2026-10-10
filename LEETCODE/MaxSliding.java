
import java.util.ArrayDeque;
import java.util.Deque;

class Solution{
    public int[] maxSlidingWindow(int[] nums,int k){
        int n=nums.length;
        Deque<Integer> dq=new ArrayDeque<>();
        int[] result= new int[n-k+1];
        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.add(i);
        }
         result[0]=nums[dq.peek()];

         for(int i=k;i<n;i++){
            if(dq.peek()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty()&& nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.add(i);
            result[i-k+1]=nums[dq.peek()];
         }
         return result;
    }
}

class MaxSliding{
    public static void main(String[] args){
        Solution s=new Solution();
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] result=s.maxSlidingWindow(nums,k);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
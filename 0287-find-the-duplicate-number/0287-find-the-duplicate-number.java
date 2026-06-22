class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1: Find the intersection point of the two pointers
        int slow = nums[0];
        int fast = nums[0];
        
        do {
            slow = nums[slow];          // Moves 1 step
            fast = nums[nums[fast]];    // Moves 2 steps
        } while (slow != fast);
        
        // Phase 2: Find the entrance to the cycle (the duplicate number)
        fast = nums[0];                 // Reset fast pointer to start
        while (slow != fast) {
            slow = nums[slow];          // Moves 1 step
            fast = nums[fast];          // Moves 1 step
        }
        
        return slow;
    }
}

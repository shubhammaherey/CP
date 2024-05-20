class Solution {
    public:
        vector<int> singleNumber(vector<int>& nums) {
            int n = nums.size();
            int sum = 0;
            for(int i=0;i<n;i++){
                sum = sum ^ nums[i];
            }
            int x = 1;
            while(true){
                if(sum & x){
                    break;
                }
                x <<= 1;
            }
            int d1 = 0;
            int d2 = 0;
            for(int i=0;i<n;i++){
                if(nums[i] & x)
                    d1 ^= nums[i];
                else d2 ^= nums[i];
            }
            return {d1, d2};
        }
    };
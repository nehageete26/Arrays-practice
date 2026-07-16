/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        // apply binary search 
        int start = 0, end = mountainArr.length()-1;
        while(start < end){
            int mid = (start+end)/2;
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) end = mid;
            else start = mid + 1;
        }
        int peak = start;
        int low = 0, high = peak;
        while(low <= high){
           int middle = (low+high)/2;
            if(mountainArr.get(middle) == target) return middle;
            else if (mountainArr.get(middle) > target) high = middle - 1;
            else low = middle +1;
        }
        int l = peak+1, h = mountainArr.length()-1; 
        while(l <= h){
            int middle = (l+h)/2;
            if(mountainArr.get(middle) == target) return middle;
            else if (mountainArr.get(middle) > target)
            l = middle + 1;
            else h = middle - 1;
        }
        return -1;
    }
}
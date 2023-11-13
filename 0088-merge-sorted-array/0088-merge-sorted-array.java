class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j,i,k;
        for( i=0;i<n;i++)
        {
            for( j=0;j<m+i;j++)
            {
                if(nums2[i]>nums1[j])
                    continue;
                else
                    break;
            }
            for( k=nums1.length-1;k>=j;k--)
            {
                if(nums1[k]!=0)
                    break;
            }
            for(int l=k;l>=j;l--)
                nums1[l+1]=nums1[l];
            nums1[j]=nums2[i];
        }
        
    }
}
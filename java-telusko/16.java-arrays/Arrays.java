class Arrays{
    public static void main(String args[]){
        int nums[] = {1,3,4,6,8};

        nums[1] = 100;

        System.out.println(nums[1]);

        int nums1[] = new int[4];

        nums1[0] = 10;
        nums1[1] = 20;
        nums1[2] = 30;
        nums1[3] = 40;

        System.out.println(nums1[3]);

        for(int i=0; i<=nums1.length - 1; i++){
            System.out.println(nums1[i]);
        }

    }
}
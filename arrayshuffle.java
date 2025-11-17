        import java.util.*;
        public class arrayshuffle{
            public int []shuffle(int []nums,int n){
                int[] re=new int[2*n];
                for(int i=0;i<n;i++){
                    re[2*i]=nums[i];
                    re[2*i+1]=nums[i+n];

                }
                return re;
            }
            public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                int a=sc.nextInt();
                int []nums=new int[a];
                for(int i=0;i<nums.length;i++){
                    nums[i]=sc.nextInt();
                }
                int n=sc.nextInt();
                arrayshuffle vs=new arrayshuffle();
                int[] ans=vs.shuffle(nums,n);
                System.out.println(Arrays.toString(ans));
            }

        }

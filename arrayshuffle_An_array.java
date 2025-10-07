import java.util.*;
public class arrayshuffle_An_array{
    private int[]original;
    private int []nums;
    private Random rand;
    public  arrayshuffle_An_array (int [] nums){
   this.original=nums.clone();
   this.nums=nums;
   this.rand=new Random();

    }
    public int[]reset(){
        return original;
    }
    public int []shuffle() {
        for(int i=0;i<nums.length;i++){
            int j=rand.nextInt(i+1);
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        arrayshuffle_An_array vs=new arrayshuffle_An_array(arr);
            System.out.println("Original String "+Arrays.toString(vs.reset()));

            int [] shuffled=vs.shuffle();
          System.out.println("shuffle array "+Arrays.toString(shuffled));

  int [] restr=vs.reset();
              System.out.println("reset"+Arrays.toString(restr));
int [] suffleagain=vs.shuffle();
            System.out.println("shuffle agian "+Arrays.toString(suffleagain));

        
        }

    }

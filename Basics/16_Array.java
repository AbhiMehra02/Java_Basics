
class Dimensional_Array
{
    public void One_D()
    {
        // int nums[] = {3,7,2,4}; 
        // //nums[1]=6;
        // System.out.println(nums[1]);

        // dynamic
        int nums[]=new int[4];
        nums[0]=9;
        nums[1]=6;
        nums[2]=1;
        nums[3]=8;

        // System.out.println(nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);


        // access element -> Using loops
        for(int i=0;i<4;i++){
            System.out.println(nums[i]);
        }
    }


    public void Multi_D()
    {
        int nums[][] =new int[3][4];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j]=(int) (Math.random()*100);
            }
        }

        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int n[]:nums)
        {
            for( int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    public void Jagged_array()
    {
        int nums[][] =new int[3][];
        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                nums[i][j]=(int) (Math.random()*100);
            }
        }

        for(int n[]:nums)
        {
            for( int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    
    }


    public void Three_D()
    {
        int nums[][][] =new int[3][4][5];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                for(int k=0;k<nums[i][j].length;k++)
                {
                    nums[i][j][k]=(int) (Math.random()*100);
                }
            }
        }

        for(int n[][]:nums)
        {
            for( int m[]:n){
                for( int l:m){
                    System.out.print(l + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    
}


class Array {
    public static void main(String[] args) {

        Dimensional_Array Darr= new Dimensional_Array();

        // Darr.One_D();

        // Darr.Multi_D();

        // Darr.Jagged_array();

        Darr.Three_D();
    }

}

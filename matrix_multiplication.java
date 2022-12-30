import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]m1=new int[r1][c1];
        int [][]m2=new int[r2][c2];
        int [][]mat=new int[c2][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    mat[i][j]+=m1[i][k]*m2[k][j];
                    
                }System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

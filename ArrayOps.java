public class ArrayOps 
{
    public static void main(String[] args) 
    {
        System.out.println(isSorted(new int[] {1,2,3}));
    }
    
    public static int findMissingInt (int[] array) 
    {
        int[] fix=new int[array.length+1];
        for(int j=0;j<=fix.length;j++)
        {
            if(j<array.length)
            {
                fix[array[j]]=1;               
            }
        }
        for(int i=0;i<=fix.length;i++) // #feedback - note that you can still use j here since these are two different loops (no inner loops).
        {
            if(fix[i]==0)
            {
                return i;
            }
        }
        return array.length+1; // #feedback - array.length=n, so no need for the "+1".
    }

    public static int secondMaxValue(int[] array) 
    {
        int max=array[0];
        int secondMax=array[0];
        for (int i=0; i<array.length;i++) 
        {
            if(array[i]>=max)
            {
                secondMax=max;
                max=array[i];
                
            }
            if(array[i]<max && array[i]>secondMax)
            {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        int counter =0;
        // #feedback - you also need to check that the elements in array2 are in array1. In the current implementation it is possible that array2 contains elements that are not in array1.
        for(int i=0;i<array1.length;i++)
        {
            if (contain(array2, array1[i])==true) // #feedback - no need to check the equality to "true" for boolan values in an "if" statement.
            {
                counter++;
            }
        }   
        if (counter==array1.length)
        {
            return true;
        }
        return false;
    }

    public static boolean contain (int[] array, int x) 
    {
        for(int i =0; i<array.length;i++)
        {
            if (array[i]==x)
            {
                return true;
            }
        }
        return false;
    }


    public static boolean isSorted(int [] array) 
    {
        if (array[0]<array[1])
        {
            for(int i =0;i<array.length-1;i++)
            {
                if(array[i]>array[i+1])
                {
                    return false;
                }
            }
        }
        else
        {
            for(int i=0;i<array.length-1;i++)
            {
                if(array[i]<array[i+1])
                {
                    return false;
                }
            }
        }
        return true;
    }

}

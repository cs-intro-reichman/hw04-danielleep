public class ArrayOps 
{
    public static void main(String[] args) 
    {
    }
    
    public static int findMissingInt (int [] array) 
    {
        int[] fix=new int[array.length+1];
        for(int j=0;j<=fix.length;j++)
        {
            if(j<=array.length)
            {
                fix[array[j]]=1;               
            }
        }
        for(int i =0;i<=fix.length;i++)
        {
            if(fix[i]==0)
            {
                return i;
            }
        }
        return array.length+1;
    }

    public static int secondMaxValue(int [] array) 
    {
        int max;
        int secondMax;
        if(array[i]<array[i+1])
            {
                max=array[i+1];
                secondMax=array[i];
            }
        for (int i=0; i<=array.length;i++) 
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            else if(array[i]>secondMax)
            {
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) 
    {
        int counter =0;
        for(int i=o;i<=array1;i++)
        {
            if (contain(array2, array1[i])==true)
            {
                counter++;
            }
        }   
        if (counter==array1.length)
        {
            return true;
        }
        else return false;
    }

    public static boolean contain (int[] array, int x) 
    {
        for(int i =o; i<=array.length;i++)
        {
            if (array[i]==x)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isSorted(int [] array) {
        if (array[1]<array[2])
        {
            for(int i =0;i<array.length;i++)
            {
                if(array[i]>array[i+1])
                {
                    return false;
                }
            }
        }
        else
        {
            for(int i =0;i<array.length;i++)
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

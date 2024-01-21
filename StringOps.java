public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        
    }

    public static String capVowelsLowRest (String string) 
    {
        String order = "";
        char a=string.charAt(0); // #feedback - no need to assign a value to this variable here, it is done inside the loop.
        for (int i = 0; i < string.length(); i++)
        {
            a=string.charAt(i);
            if (a=='a' ||a=='e' ||a =='i' ||a=='o' ||a =='u')
            {
                order += (char)(a-32);
            }
            else if (a>= 'A' && a<= 'Z' && (a!= 'A' && a!= 'E' && a!= 'I' && a!= 'O' && a!= 'U')) 
            {
                order += (char)(a+32);
            }
            else order+=a;
        }
        return order;

    }

    public static String camelCase (String string) 
    {
        String fix = "";
        for (int i = 0; i < string.length() ; i++) 
        {
            while (string.charAt(i) == ' ') 
            {
                i++; // #feedback - it can be confusing to change "i" here and in the for loop, and it makes it harder to debug. 
                     // Consider having a single loop on the entire string and check for a space in the current character. You can have a boolean variable to indicate that you saw a space char.
                if (fix != "")
                {
                  if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') 
                  {
                    fix += (char)(string.charAt(i)-32);
                    i++;
                  }
                  else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') 
                  {
                    fix+= string.charAt(i);
                    i++;
                  }
                }
            }
            // #feedback - it is usually better to have code that repeats throughout the funciton in a helper function, to avoid code repetition.
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') 
            {
                fix += (char)(string.charAt(i)+32);
            }
            else 
            {
                fix += string.charAt(i);
            }
        }
                return fix;
    }

    public static int[] allIndexOf (String string, char chr) 
    {
        int counnter=0;
        for(int i=0;i<string.length();i++)
        {
            if(string.charAt(i)==chr)
            {
                counnter++;
            }
        }
        int[] a=new int[counnter]; // #feedback - it is usually better to use more indicative names, such as array or even better charIndexArray.
        int index=0;
        for(int j=0;j<string.length();j++)
        {
            if (string.charAt(j)==chr) 
            {
                a[index]= j;
                index++;   
            }
        }
        return a;
    }
}

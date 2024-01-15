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
        char a=string.charAt(0);
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
                i++;
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

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}

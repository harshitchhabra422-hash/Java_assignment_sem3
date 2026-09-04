public class StringFundamentals 
{
static boolean hasText(String value)
{
    if (value == null)
    {
        return false;
    }
    else if (value.trim().length() == 0)
    {
        return false;
    }
    else
    {
        return true;
    }
}

static String normalizeCourseCode (String code)
{
    if (code == null)
    {
        return null;
    }
    else
    {
        return code.trim().toUpperCase();
    }
}

static int CountOccurences (String text, char target)
{
    int count = 0;
    for(int i=0;i<=text.length();i++)
    {
        if(text.charAt(i) == target)
        {
            count++;
            
        }
        
    }
    return count;
}

}

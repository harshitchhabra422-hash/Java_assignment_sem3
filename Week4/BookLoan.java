public class BookLoan {
    private String Title;
    private String Author;
    private String BookCode;
    private boolean Loaned;
public void Book(String Tit,String Au, String BC)
{
this.Title= Tit;
this.Author= Au;
this.BookCode= BC;
this.Loaned= false;

}
public boolean borrowBook()
{
    if(Loaned==false)
    {
        Loaned=true;
        return true;
    }
    else
    {
        return false;
    }

}
public boolean returnBook()
{
    if(Loaned==true)
    {
        Loaned=false;
        return true;
    }
    else
    {
        return false;
    }

}
public String getTitle()
{
    return Title;
}
public String getAuthor()
{
    return Author;
}
public String getBookCode()
{
    return BookCode;
}
public boolean isAvailable()
{
    return Loaned==false;
}

public String toString()
{
    return "Title: "+Title+" Author: "+Author+" BookCode: "+BookCode+" Available: "+isAvailable();
}
}

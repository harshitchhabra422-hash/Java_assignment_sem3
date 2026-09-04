public class AccountModal 
{
    private String AccountNumber;
    private String OwnerName;
    private double balance = 0;

    public AccountModal (String Accno , String Owno)
    {
        this.AccountNumber = Accno;
        this.OwnerName = Owno;
    
    }

    public AccountModal (String Accno , String Owno , double bal)
    {
        this.AccountNumber = Accno;
        this.OwnerName = Owno;
        this.balance = bal;
    }

    public String GetOwnerName ()
    {
        return OwnerName;
    }

    public void SetOwnerName (String name)
    {
        if(OwnerName == null)
        {
            System.out.println ("INVALID NAME");
        }
        else
        {
            this.OwnerName = name;
        }
    }

    public String GetAccountNumber ()
    {
        return AccountNumber;
    }

    public void SetAccountNumber (String Accno)
    {
        if(AccountNumber == null || AccountNumber.length() != 10)
        {
            System.out.println("INVALID ACCOUNT NUMBER");
        }
        else
        {
            this.AccountNumber = Accno;
        }
    }

    public double Getbalance ()
    {
        return balance;
    }

    public boolean Deposit (double Ammount)
    {
        if (Ammount > 0)
        {
            balance = balance + Ammount;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean Withdraw (double Ammount)
    {
        if (Ammount > 0 || Ammount <= balance)
        {
            balance = balance - Ammount;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return OwnerName + AccountNumber + balance;
    }

}
    
    

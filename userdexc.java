// user defined exception and error

class CustomesiedException extends Exception
{
    CustomesiedException(String s)
    {
        System.out.print(s);
    }
}

class userexceptionexample
{
    public void add(int age) throws CustomesiedException
    {
        if(age < 18)
        {
            throw new CustomesiedException("Error occured");
        }
    }

    public static void main(String args[])
    {
        userexceptionexample obj = new userexceptionexample();

        try
        {
            obj.add(12);
        }
        catch (CustomesiedException i)
        {
            System.out.print(" Exception arrived");
        }
    }
}
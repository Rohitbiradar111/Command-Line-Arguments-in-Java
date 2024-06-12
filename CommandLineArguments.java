//This program prints the Command Line Arguments in Java

public class CommandLineArguments {
    public static void main(String args[])
    {   
        //Method 1 -
        if(args.length > 0)
        {
            System.out.println("Arguments are = ");
            for(String s : args)
            System.out.println(s+" ");
        }
        else
        {
            System.out.println("No Arguments");
        }

        //Method 2 -
        System.out.println(args[0]+" "+args[1]+" "+args[2]);
    }
}
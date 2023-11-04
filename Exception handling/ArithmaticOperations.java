
import java.util.*;

class IllegalArgument extends Exception{
    public IllegalArgument(String s){
        super(s);
    }
}

public class ArithmaticOperations{
    public static void Operations(){
        try{
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1  : ");
        int a = sc.nextInt();
        System.out.print("Number 2  : ");
        int b = sc.nextInt();
        System.out.print("(+,-,*,/) : ");
        String s = sc.next();
        
        if(!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")){
            throw new IllegalArgument("Invalid Argument...");
        }

        if(s.equals("+")) System.out.println("Result : "+a+" + "+b+" = "+(a+b));
        if(s.equals("-")) System.out.println("Result : "+a+" - "+b+" = "+(a-b));
        if(s.equals("*")) System.out.println("Result : "+a+" * "+b+" = "+(a*b));
        if(s.equals("/")) System.out.println("Result : "+a+" / "+b+" = "+(a/b));

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input....");
        }
        catch(IllegalArgument e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Can not divided by Zero.!");
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        Operations();
    }
}

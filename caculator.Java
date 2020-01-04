/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
public static void main(String[] args) {
    /*
    for(int i = 0;i<3;i++){
System.out.println("please enter your name");
String name  = System.console().readLine();
System.out.println("please enter your adress");
String adress = System.console().readLine();
    System.out.println(name+" "+adress);
    }
    */
    
    
    System.out.println("please enter first number");
    double first = Double.parseDouble(System.console().readLine());
    System.out.println("please enter second number");
    double second = Double.parseDouble(System.console().readLine());
    boolean check_input = true;
    while(check_input){
    check_input = false;
    System.out.println("what math operation would you like");
    String operation = System.console().readLine();
        if (operation.equals("addition")){
            System.out.println((first+second));
        }
        else if(operation.equals ("subtraction")){
            System.out.println((first-second));
        }
        else if(operation.equals ("division")){
            System.out.println((first/second));
        }
        else if(operation.equals ("multiplication")){
            System.out.println((first*second));
        }
        else if(operation.equals ("exponent")){
            double result = exponentCalculation(first, second);
            System.out.println(result);
        }
        else{
            System.out.println ("Invaled operation");
            System.out.println (operation+" "+first+" "+second);
        }
        System.out.println ("Do you wan to try again?");
        String again = System.console().readLine();
        if (again.equals("yes")){
            check_input = true;
        }
        else if (again.equals("no")){
            check_input = false;
        }
    }
     done();
    
}

public static double exponentCalculation(double first, double second){
    double result  =1;
    for (int i = 0; i < second; i++){
        result = result*first;
    }
    return result;
}
public static void done(){
    System.out.println("you have done a complete equation");
}
}

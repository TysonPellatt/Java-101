v]/******************************************************************************

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
    System.out.println("what math operation would you like");
    String operation = System.console().readLine();
    System.out.println("please enter first number");
    int first = Integer.parseInt(System.console().readLine());
    System.out.println("please enter second number");
    int second = Integer.parseInt(System.console().readLine());
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
        else{
            System.out.println ("Invaled operation");
            System.out.print (operation+" "+first+" "+second);
        }
    
}
}
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		double name [] = new double[1000];
		for(int i = 0;i < name.length;i++){
		    name[i]=getRandomDoubleBetweenRange(1,1000);
		}
		
		
		for(int i = 0;i < name.length;i++){
		System.out.println(name[i]);
		}	
	    boolean swapped = true;
	    int n = name.length;
	    while(swapped == true){
	    swapped =false;
	    for (int i = 1; i< n ;i++){ 
	    if (name[i - 1] > name[i]){
	    //swap(namelength[i - 1], namelength[i]);
	    double temp = name [i];
	    name[i] = name[i - 1];
	    name[i - 1] = temp;
	    swapped = true;
	   
	    }
	    }
    }
	    
	for(int i = 0;i < name.length;i++){
	System.out.println(name[i]);
	}
}
	
	
public static double getRandomDoubleBetweenRange(double min, double max){
    double x = (Math.random()*((max-min)+1))+min;
    return x;
}
}
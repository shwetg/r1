import java.util.Scanner;
 class CalcAverage{
public static void main(String args[])
{
    System.out.println("enter a natural number");
Scanner ob = new Scanner(System.in) ;
int N=ob.nextInt();

try{
System.out.println("average of N numbers is " + avgFristN(N));

}
catch(IllegalArgumentException e)
{
System.out.println("natural number not found");
}

}

public static double avgFristN(int N){
double avg=0;

if(N==0){
return avg;
}
else{

return (1+N)/2;
}
}

}


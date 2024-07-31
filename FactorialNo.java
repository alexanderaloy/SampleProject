class FactorialNoInstance{
int fact=1,a=1;
public int factorial(int n){
while(a<=n){
fact = fact * a;
a++;
}
return fact;
}
public static void main(String[]args){
FactorialNoInstance obj = new FactorialNoInstance();
int factor = obj.factorial(5);
System.out.println("The factorial is " + factor);
}
}
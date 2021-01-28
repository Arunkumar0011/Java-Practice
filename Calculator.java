class Calculator{

public static void main (String[] args){

//object creation

Calculator calcObj = new Calculator(); //Calculator --> is main class name, calcObj -->is object reference name

//using calcObj, I am asking JDK to add to numbers

calcObj.add(5,10);     // add--> method name, (5,10) --> parameters (input) 
calcObj.add(10,20,30);
calcObj.add(5.2f,3.2f);
}


public void add(float a, float b) //This method calling statement
{
	System.out.println(a+b);
}

public void add(int a, int b){
	
	System.out.println(a+b);
}

public void add(int a, int b, int c){
	System.out.println(a+b+c);
}

}
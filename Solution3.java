import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

interface Stack
{
   boolean isEmpty();
   int getSize();
   boolean isFull();
}
interface IStack extends Stack
{
  void push(int x) throws StackOverflow;
  void push(int[] x) throws StackOverflow;
  int pop() throws StackUnderflow;
  void printStack();
}
interface DStack extends Stack
{
 void push(double x) throws StackOverflow ;
 void push(double[] x) throws StackOverflow;
 double pop() throws StackUnderflow;
 void printStack();
}
abstract class StackInitialImplementation implements Stack
{
    int top;
    int capacity;
    int[] intarr;
    double[] doublearr;
   
    public boolean isEmpty()
    {
     if(top==-1)
       return true;
     else
       return false;
    }
    public boolean isFull()
    {
     if(top>capacity-1)
      return true;
     else
      return false;
     }
    public int getSize()
    {
     return top+1;
    }
}
class StackOverflow extends Exception
{
 public StackOverflow()
 {
  super("Stack is Full");
 }
    //throw new StackOverflow("Stack is full");
}
class StackUnderflow extends Exception
{
 public StackUnderflow()
 {
  super("Stack is Empty");
 }
  //throw new StackUnderflow("Stack is empty");
}
class IntStack extends StackInitialImplementation implements IStack
{
    IntStack(int size)
    {
     top=-1;
     intarr=new int[size];
     capacity=intarr.length;
    }
    IntStack(int[] arr)
    {
     capacity=arr.length;
     intarr=arr;
     top=-1;
    }
    public void push(int x) throws StackOverflow
    {
     if(isFull())
     {
      throw new StackOverflow();
     }
     else
     {
      intarr[++top]=x;
     }
   
    }
    public void push(int[] x) throws StackOverflow
    {
     if(isFull())
     {
      throw new StackOverflow();
     }
     else
     {
      for(int i=0;i<x.length;i++)
          intarr[++top]=x[i];
     }
     }
    public int pop() throws StackUnderflow
    {
     if(isEmpty())
     {
      throw new StackUnderflow();
     }
     else
     {
      return intarr[top--];
     }
     
    }
    public void printStack()
    {
     for(int i=0;i<capacity;i++)
     {
      System.out.printf("%d,",intarr[i]);
     }
    }
   
}
class DoubleStack extends StackInitialImplementation implements DStack
{
    DoubleStack(int size)
    {
     int top=-1;
     capacity=doublearr.length;
     doublearr=new double[size];
    }
    DoubleStack(double[] arr)
    {
     capacity=arr.length;
     doublearr=arr;
     top=arr.length-1;
    }
     public void push(double x) throws StackOverflow
    {
     if(isFull())
     {
      throw new StackOverflow();
     }
     else
     {
      doublearr[++top]=x;
     }
     
    }
     public void push(double[] x) throws StackOverflow
    {
     if(isFull())
     {
      throw new StackOverflow();
     }
     else
     {
      for(int i=0;i<x.length;i++)
        doublearr[++top]=x[i];
     }
     
    }
    public double pop() throws StackUnderflow
    {
     if(isEmpty())
     {
      throw new StackUnderflow();
     }
     else
     {
      return doublearr[top--];
     }
     
    }
    public void printStack()
    {
     for(int i=0;i<capacity;i++)
     {
      System.out.print(doublearr[i]+",");
     }
    }
}

public class Solution3 {
 
  /*static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }*/

    public static void main(String[] args) {
   
   
     Scanner sc = new Scanner(System.in);
     double[] b={1,2,3,4,5,6,7};
DoubleStack s4=new DoubleStack(b);
s4.printStack();
for(int k=0;k<s4.capacity+1;k++)
{

try
{
s4.pop();
}
catch(StackUnderflow su)
{
System.out.println(su);
}

}
               /* int i=0;
                int s=sc.nextInt();//size
                IntStack s1=new IntStack(s);
                while(i<s)
                {
                    int item=sc.nextInt();
                    try{
                    s1.push(item);
                    }
                    catch(StackOverflow sl)
                    {
                     System.out.println(sl);
                    }
                    i++;
                }
                try{
                  s1.push(300);
                  }
                  catch(StackOverflow sl)
                                 {
                              System.out.println(sl);
                                 }
                  s1.printStack();*/
   
     
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   /*Scanner sc = new Scanner(System.in);

while (sc.hasNext()) {
int input=sc.nextInt();
            //Complete the code
switch(input)
{
case 1:
//IntStack
int i=0;
int s=sc.nextInt();//size
IntStack s1=new IntStack(s);
while(i<s)
{
int item=sc.nextInt();
try{
s1.push(item);
}
catch(StackOverflow sl)
               {
            System.out.println(sl);
               }
i++;
}

try{
s1.push(300);
}
catch(StackOverflow sl)
               {
            System.out.println(sl);
               }
s1.printStack();

break;
case 2:
int[] a={1,2,3,4,5,6,7};
IntStack s2=new IntStack(a);
s2.printStack();
for(int j=0;j<s2.capacity+1;j++)
{

try
{
s2.pop();
}
catch(StackUnderflow su)
{
System.out.println(su);
}

}
break;

case 3:
//DoubleStack
int l=0;
int d=sc.nextInt();//size
DoubleStack s3=new DoubleStack(d);
while(l<d)
{
double item=sc.nextDouble();
try{
s3.push(item);
}
catch(StackOverflow sl)
               {
            System.out.println(sl);
               }
l++;
}

try{
s3.push(300.0);
}
catch(StackOverflow sl)
               {
            System.out.println(sl);
               }
s3.printStack();

break;
case 4:
double[] b={1,2,3,4,5,6,7};
DoubleStack s4=new DoubleStack(b);
s4.printStack();
for(int k=0;k<s4.capacity+1;k++)
{

try
{
s4.pop();
}
catch(StackUnderflow su)
{
System.out.println(su);
}

}
break;
case 5:
DoubleStack d1=new DoubleStack(5);
IntStack i1=new IntStack(5);
ImplementedInterfaceNames(d1);
ImplementedInterfaceNames(i1);
break;

case 6:
DoubleStack d2=new DoubleStack(5);
System.out.println("My superclass is: " + d2.getClass().getSuperclass().getName());
break;
case 7:
IntStack s5=new IntStack(6);
int[] arr1={10,20,30,40,50};
try{
s5.push(arr1);
}
catch(Exception ex)
{
System.out.println(ex);
}
s5.printStack();
break;
case 8:
DoubleStack d3=new DoubleStack(6);
double[] arr2={10.5,20,30,40,50};
try{
d3.push(arr2);
}
catch(Exception ex)
{
System.out.println(ex);
}
d3.printStack();
break;
case 9:
Stack s6=new IntStack(5);
System.out.println(s6.isEmpty());
System.out.println(s6.isFull());
System.out.println(s6.getSize());
break;
case 10:
Stack d4=new DoubleStack(5);
//I have created with super class reference
//assigned a sub class object.Here I would like to use push(arr3)
//function.So perform downcasting here.After that call printStack method
double[] arr3={1.2,2.2,3.2};


break;






}
}*/
}
   
}
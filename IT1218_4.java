import java.util.Scanner;
class IT1218_4
{
static int choice=1;
static String e_Name;
static int e_ID;
static int e_Age;
static int count=0; 
public static void main(String[] args)
{
noOfEmp();
System.out.println("No. of Employees: "+count);
}
public static int noOfEmp()
{
do
{
Scanner s=new Scanner(System.in);
System.out.println("Enter Employee name: ");
e_Name=s.nextLine();
System.out.println("Enter Employee ID: ");
e_ID=s.nextInt();
System.out.println("Enter Employee Age: ");
e_Age=s.nextInt();
count=count+1;
System.out.println("Do u want to continue:(Press 1 to continue) ");
choice=s.nextInt();
}while(choice==1);
return count;}
}
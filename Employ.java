class Employ
{
 static int count=0;
Employ()
{
 count=count+1;
}
static int counter()
{
 return count;
}
public static void main(String args[])
{
 Employ a=new Employ();
System.out.println(Employ.counter());

}

}
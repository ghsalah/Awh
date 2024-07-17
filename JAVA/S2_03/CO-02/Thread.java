class A extends Thread
{
public void run()
{
for(int i=1;i<5;i++)
{
System.out.println("\t from Thread A : i= " + i );
}
System.out.println("Exit from A");
}
}
class B extends Thread
{
public void run()
{
for(int j=1;j<=5;j++)
{
System.out.println("\t from Thread B : j=" + j);
}
System.out.println("Exit from B");
}
}
class C extends Thread
{
public void run()
{
for(int k=1; k<=5; k++)
{
System.out.println("\t from thread C : k=" + k);
}
System.out.println("Exit from C");
}
}
class Thread
{
public static void main(String args[])
{
new A().start();
new B().start();
new C().start();
}
}
~
~
~
~
Thread.java [unix] (18:01 17/07/2024)                                                                                                                               35,1 All
"Thread.java" [unix] 42L, 591B

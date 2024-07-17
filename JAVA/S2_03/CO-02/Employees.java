import java.util.Scanner;
class employees{
int eno;
String name;
int sallary;
employees(int eno,String name,int sallary){
this.eno=eno;
this.name=name;
this.sallary=sallary;
}
void display(){
System.out.println("employe number: "+eno);
System.out.println("name: "+name);
System.out.println("sallary: "+sallary);
}

}

class Employee{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of employee: ");
int n=sc.nextInt();
sc.nextLine();
employees[] arr=new employees[n];
for(int i=0;i<n;i++){
System.out.println("enter the eno: ");
int eno=sc.nextInt();
sc.nextLine();
System.out.println("enter the name: ");
String name=sc.nextLine();
System.out.println("enter the Sallary: ");
int sallary=sc.nextInt();
sc.nextLine();
arr[i]=new employees(eno,name,sallary);
}
for(int i=0;i<n;i++){
arr[i].display();
}

System.out.println("enter the  employee number to search: ");
int search=sc.nextInt();
int index=-1;
for(int i=0;i<n;i++){
if(arr[i].eno==search){
index=i;
}
}
if(index != -1){
System.out.println("empno"+search+" fonud at "+index);
System.out.println("eno: "+arr[index].eno);
System.out.println("name: "+arr[index].name);
System.out.println("sallary: "+arr[index].sallary);
}
else{
System.out.println("not found");

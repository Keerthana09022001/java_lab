import java.util.Scanner;
class Employeee
{ int e_id;
 String e_name,e_address;
 double e_sal;
 Employeee(int id, String name, double sal, String address)
 { e_id=id;
 e_name=name;
 e_address=address;
 e_sal=sal;
 }
 void display()
 { System.out.println("Employe Name = "+e_name);
 System.out.println("Employe Salary = "+e_sal);
 System.out.println("Employe Address = "+e_address);
 }
}
class Teacher extends Employeee

{ String t_dept, t_sub;
 Teacher(String dept, String sub, String name,int id, String address, double sal)
 { super(id, name, sal, address);
 t_dept=dept;
 t_sub=sub;
 }
 void display()
 { System.out.println("\nDepartment = "+t_dept);
 System.out.println("Subject = "+t_sub);
 System.out.println("Employee Id = "+e_id);
 System.out.println("Employee Name = "+e_name);
 System.out.println("Employee Salary = "+e_sal);
 System.out.println("Employee Address = "+e_address);
 }
}
public class Arrofobj 
{ public static void main(String[] args)
 { int count,id;
 String name,dept,sub,address;
 double sal;
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the number of Teachers :");
 count=s.nextInt();
 Teacher [] obj=new Teacher[count];
 for(int i=0;i<count;i++)
 { System.out.print("Enter the Emp name :");
 name=s.next();
 System.out.print("Enter the Id :");
 id=s.nextInt();

 System.out.print("Enter the Address :");
 address=s.next();
 System.out.print("Enter the Salary :");
 sal=s.nextInt();
 System.out.print("Enter the Department :");
 dept=s.next();
 System.out.print("Enter the Subject :");
 sub=s.next();
 obj[i]=new Teacher(dept, sub, name, id, address, sal);
 }
 for(int i=0;i<count;i++)
 { obj[i].display();
 }
 }
}
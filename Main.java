import java.util.Scanner;
import java.lang.*;
public class Main
{ public static void main(String [] args)
 { int a;
 String b,c;
 Scanner sc = new Scanner(System.in);
 System.out.print(" Enter the string : ");
 b = sc.nextLine();
while(true)
 { System.out.println("\nMENU:\n 1.String Length.\n 2.Uppercase.\n 3.Lowercase.\n 4.Concatenate.\n 5.Character index.\n6.Exit.");
 System.out.print("\n Enter your option : ");
 a = sc.nextInt();
 switch(a)
 { case 1:System.out.println(" String length = "+b.length());
 break;
 case 2:System.out.println(" String in uppercase = "+b.toUpperCase());
 break;
 case 3:System.out.println(" String in lowercase = "+b.toLowerCase());
 break;
 case 4:{ System.out.print(" Enter the string to be concatenate = ");
 c = sc.next();
 System.out.println(" Concatenated string = "+b.concat(c));
 break;
 }
 case 5:{ System.out.print(" Enter the Character to be searched in the given string = ");
 c = sc.next();
 System.out.println(" The character is found at"+(b.indexOf(c)+1)+".");
break;
 }
 case 6: System.exit(0);
 }
}
}
}
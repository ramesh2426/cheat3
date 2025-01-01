Constructor –
1. Write a java program to calculate area and circumference of a circle using a constructor.
File Name: Main.java
Code:
import java.util.Scanner;
class Circle {
 public double r;
 public Circle(double radius) {
 r = radius;
 }
 public double area() {
 return 3.14 * r * r;
 }
 public double circumference() {
 return 2 * 3.14 * r;
 }
}
class Main {
 public static void main(String args[]) {
String choice = "yes";
 Scanner sc = new Scanner(System.in);
 System.out.println("=======================================");
 System.out.println(" Circle Area & Circumference ");
 System.out.println("=======================================");
 System.out.println();
do {
try {
 System.out.print("Enter the radius of the circle: ");
 double radius = sc.nextDouble();
 Circle circle = new Circle(radius);
 System.out.println("Radius = " + circle.r + " Area = " + circle.area());
 System.out.println("Radius = " + circle.r + " Circumference = " + circle.circumference());
} catch(Exception e) {
System.out.println("Invalid input! Please enter a numeric value for the radius.");
sc.nextLine();
continue;
}
System.out.print("Would you like to calculate for another circle? Yes or No: ");
choice = sc.next().trim().toLowerCase();
System.out.println();
} while(choice.equals("yes"));
 sc.close();
System.out.println("Thank you for using the program!");
 }
}

2. Write a java program to calculate area and perimeter of a Rhombus using a constructor.
File Name: MyRhombus.java
Code:
import java.util.Scanner;
class Rhombus {
 public double d1, d2;
 public Rhombus(double diagonal1, double diagonal2) {
 d1 = diagonal1;
 d2 = diagonal2;
 }
 public double area() {
 return (d1 * d2) / 2;
 }
}
public class MyRhombus {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String choice = "yes";
 System.out.println("=======================================");
 System.out.println(" Rhombus Area Calculator ");
 System.out.println("=======================================");
 System.out.println();
 do {
 try {
 System.out.print("Enter the length of diagonal 1: ");
 double diagonal1 = sc.nextDouble();
 System.out.print("Enter the length of diagonal 2: ");
 double diagonal2 = sc.nextDouble();
 Rhombus aRhombus = new Rhombus(diagonal1, diagonal2);
 double area = aRhombus.area();
 System.out.println("Diagonal 1: " + aRhombus.d1 + ", Diagonal 2: " + aRhombus.d2 + ", Area: " +
area);
 } catch (Exception e) {
 System.out.println("Invalid input! Please enter numeric values for the diagonals.");
 sc.nextLine();
 continue;
 }
 System.out.print("Would you like to calculate the area for another rhombus? Yes or No: ");
 choice = sc.next().trim().toLowerCase();
 System.out.println();
 } while (choice.equals("yes"));
 sc.close();
 System.out.println("Thank you for using the program!");
 }
}

Destructor using Garbage Collector –
3. Write a java program to implement destructor Function(free memory).
File Name: GarbageCollection.java
Code:
class GarbageCollection {
 public static void main(String s[]) {
 try {
 Runtime rs = Runtime.getRuntime();
 System.out.println("Free memory in JVM (Java Virtual Machine) before Garbage Collection = " +
rs.freeMemory() + " bytes");
 rs.gc();
 System.out.println("Free memory in JVM (Java Virtual Machine) after Garbage Collection = " +
rs.freeMemory() + " bytes");
 } catch (Exception e) {a
 System.out.println("An error occurred during garbage collection: " + e.getMessage());
 }
 }
}

Array –
4. Write a java program using arrays to solve the problem. The problem is to read n numbers, get the
average of these numbers, and find the number of the items greater than the average.
File Name: AverageAndCount.java
Code:
import java.util.Scanner;
public class AverageAndCount {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain = false;
 do {
 System.out.println("==================================");
 System.out.println(" Average and Count Program ");
 System.out.println("==================================");
 try {
 System.out.print("Enter the number of elements: ");
 int n = sc.nextInt();
 if (n <= 0) {
 System.out.println("Please enter a positive integer for the number of elements.");
 continue;
 }
 double[] numbers = new double[n];
 System.out.println("Enter " + n + " numbers:");
 for (int i = 0; i < n; i++) {
 numbers[i] = sc.nextDouble();
 }
 double sum = 0;
 for (double number : numbers) {
 sum += number;
 }
 double average = sum / n;
 int countGreaterThanAverage = 0;
 for (double number : numbers) {
 if (number > average) {
 countGreaterThanAverage++;
 }
 }
 System.out.printf("Average: %.2f%n", average);
 System.out.println("Count of numbers greater than the average: " + countGreaterThanAverage);
 } catch (Exception e) {
 System.out.println("An error occurred: " + e.getMessage());
 sc.nextLine();
 }
 System.out.print("Do you want to run the program again? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the program!");
 }
}

Static member function –
5. Write a class with a static method that returns the maximum value of three given integers. Write another
class with main method and call the static method to print the maximum values for two sets of integer
values(for eg(10,15,100))
File Name: FindMaxFromSet.java
Code:
import java.util.Scanner;
class MaxFinder {
 public static int findMax(int[] numbers) {
 int max = Integer.MIN_VALUE;
 for (int num : numbers) {
 if (num > max) {
 max = num;
 }
 }
 return max;
 }
}
class FindMaxFromSet {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("How many sets: ");
 int setsCount = getValidInt(sc);
 int[][] allValues = new int[setsCount][];
 int[] maxValues = new int[setsCount];
 for (int i = 1; i <= setsCount; i++) {
 System.out.print("Enter the number of values in set " + i + ": ");
 int valuesCount = getValidInt(sc);
 int[] values = new int[valuesCount];
 System.out.print("Enter values for set " + i + ": ");
 for (int ii = 0; ii < valuesCount; ii++) {
 values[ii] = getValidInt(sc);
 }
 allValues[i - 1] = values;
 maxValues[i - 1] = MaxFinder.findMax(values);
 System.out.println();
 }
 for (int i = 1; i <= setsCount; i++) {
 System.out.print("Values in set " + i + ": {");
 int[] values = allValues[i - 1];
 for (int ii = 0; ii < values.length; ii++) {
 if (ii > 0) System.out.print(", ");
 System.out.print(values[ii]);
 }
 System.out.println("}");
 System.out.println("Maximum value in set " + i + ": " + maxValues[i - 1]);
 System.out.println();
 }
 sc.close();
 }
 private static int getValidInt(Scanner sc) {
 while (true) {
 try {
 return sc.nextInt();
 } catch (Exception e) {
 System.out.print("Invalid input! Please enter a valid integer: ");
 sc.nextLine();
 }
 }
 }
}

6. Write a predict method -
public static Boolean is Leapyear(int year)
That tests whether a year is a leap year, that is, a year with 366 days. Leap years are necessary to keep the
calendar synchronized with the sun, because the earth revolves around the sun once every 362.25days. That
figure is not entirely precise, and for all dates after 1582 the Gregorian correction applies. Usually years
that are divisible by 4 are leap years, for example 1996 However years that are divisible by 100 (for ex
1900) are not leap years, but years that are divisible by 400 are leap years(for example 2000) Now test the
method with a set of years from the user until a negative number is entered.
File Name: LeapYearChecker.java
Code:
import java.util.Scanner;
public class LeapYearChecker {
 public static Boolean isLeapYear(int year) {
 if (year >= 1582) {
 return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
 } else {
 return (year % 4 == 0);
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int[] years = new int[100];
 int count = 0;
 System.out.println("Enter a set of years to check for leap year (enter a negative number to stop): ");
 while (true) {
 int year = getValidInt(sc);
 if (year < 0) {
 break;
 }
 years[count++] = year;
 }
 sc.close();
 System.out.println("\nLeap Year Check Results:");
 for (int i = 0; i < count; i++) {
 if (isLeapYear(years[i])) {
 System.out.println(years[i] + " is a leap year.");
 } else {
 System.out.println(years[i] + " is not a leap year.");
 }
 }
 }
 private static int getValidInt(Scanner sc) {
 while (true) {
 try {
 return sc.nextInt();
 } catch (Exception e) {
 System.out.print("Invalid input! Please enter a valid year: ");
 sc.nextLine();
 }
 }
 }
}

Abstract Class -
7. Write a java program to create an abstract class called shape with the abstract method surface_area()
& volume(). Create a subclass Sphere, Cube, Rectangular prism(box) and cylinder and implement the
abstract method.
File Name: SurfaceAreaWithScanner.java
Code:
import java.util.Scanner;
abstract class Shape {
 abstract double surfaceArea();
 abstract double volume();
}
class Sphere extends Shape {
 private double radius;
 public Sphere(double radius) {
 this.radius = radius;
 }
 @Override
 public double surfaceArea() {
 return 4 * Math.PI * radius * radius;
 }
 @Override
 public double volume() {
 return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
 }
}
class Cube extends Shape {
 private double side;
 public Cube(double side) {
 this.side = side;
 }
 @Override
 public double surfaceArea() {
 return 6 * side * side;
 }
 @Override
 public double volume() {
 return Math.pow(side, 3);
 }
}
class RectangularPrism extends Shape {
 private double length, width, height;
 public RectangularPrism(double length, double width, double height) {
 this.length = length;
 this.width = width;
 this.height = height;
 }
 @Override
 public double surfaceArea() {
 return 2 * (length * width + width * height + height * length);
 }
 @Override
 public double volume() {
 return length * width * height;
 }
}
class RightCircularCylinder extends Shape {
 private double radius, height;
 public RightCircularCylinder(double radius, double height) {
 this.radius = radius;
 this.height = height;
 }
 @Override
 public double surfaceArea() {
 return 2 * Math.PI * radius * (radius + height);
 }
 @Override
 public double volume() {
 return Math.PI * radius * radius * height;
 }
}
public class SurfaceAreaWithScanner {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean continueProgram = true;
 while (continueProgram) {
 System.out.println("Choose a shape to calculate:");
 System.out.print("1. Sphere\n2. Cube\n3. Rectangular Prism (Box)\n4. Right Circular Cylinder\n\nEnter
your choice (1-4): ");
 int choice = getValidInt(sc);
 Shape shape = null;
 switch (choice) {
 case 1:
 System.out.print("Enter radius of the Sphere: ");
 double sphereRadius = getValidDouble(sc);
 shape = new Sphere(sphereRadius);
 break;
 case 2:
 System.out.print("Enter side of the Cube: ");
 double cubeSide = getValidDouble(sc);
 shape = new Cube(cubeSide);
 break;
 case 3:
 System.out.print("Enter length of the Rectangular Prism: ");
 double length = getValidDouble(sc);
 System.out.print("Enter width of the Rectangular Prism: ");
 double width = getValidDouble(sc);
 System.out.print("Enter height of the Rectangular Prism: ");
 double height = getValidDouble(sc);
 shape = new RectangularPrism(length, width, height);
 break;
 case 4:
 System.out.print("Enter radius of the Right Circular Cylinder: ");
 double cylinderRadius = getValidDouble(sc);
 System.out.print("Enter height of the Right Circular Cylinder: ");
 double cylinderHeight = getValidDouble(sc);
 shape = new RightCircularCylinder(cylinderRadius, cylinderHeight);
 break;
 default:
 System.out.println("Invalid choice, please try again.");
 continue;
 }
 if (shape != null) {
 System.out.println("Surface Area: " + shape.surfaceArea());
 System.out.println("Volume: " + shape.volume());
 }
 System.out.print("Do you want to calculate another shape? (yes/no): ");
 String userChoice = sc.next().trim().toLowerCase();
 if (!userChoice.equals("yes")) {
 continueProgram = false;
 }
 }
 System.out.println("Program terminated.");
 sc.close();
 }
 private static int getValidInt(Scanner sc) {
 while (true) {
 try {
 return sc.nextInt();
 } catch (Exception e) {
 System.out.print("Invalid input! Please enter a valid integer: ");
 sc.nextLine();
 }
 }
 }
 private static double getValidDouble(Scanner sc) {
 while (true) {
 try {
 return sc.nextDouble();
 } catch (Exception e) {
 System.out.print("Invalid input! Please enter a valid number: ");
 sc.nextLine();
 }
 }
 }
}

8. A bank gives simple interest of 9.25% per annum for deposits made in the bank. It also gives a compound
interest of 8.5% per annum for deposit. A customer would like to deposit Rs 25000 for 5 years. Write a
java program to implement this with abstract class.
File Name: SimpleCompound.java
Code:
import java.util.Scanner;
abstract class SCI {
 protected double p_amt, rate, time;
 public SCI(double p_amt, double rate, double time) {
 this.p_amt = p_amt;
 this.rate = rate;
 this.time = time;
 }
 public abstract double interest();
}
class SimpleInterest extends SCI {
 SimpleInterest(double p_amt, double rate, double time) {
 super(p_amt, rate, time);
 }
 @Override
 public double interest() {
 return (p_amt * rate * time) / 100;
 }
}
class CompoundInterest extends SCI {
 CompoundInterest(double p_amt, double rate, double time) {
 super(p_amt, rate, time);
 }
 @Override
 public double interest() {
 return p_amt * Math.pow((1 + rate / 100), time) - p_amt;
 }
}
public class SimpleCompound {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean continueProgram = true;
 System.out.println("================================");
 System.out.println(" Interest Calculator ");
 System.out.println("================================\n");
 do {
 double p_amt = 0, rate = 0, time = 0;
 while (true) {
 System.out.print("Enter principal Amount: ");
 if (sc.hasNextDouble()) {
 p_amt = sc.nextDouble();
 break;
 } else {
 System.out.println("Invalid input! Please enter a valid number.");
 sc.next();
 }
 }
 while (true) {
 System.out.print("Enter rate: ");
 if (sc.hasNextDouble()) {
 rate = sc.nextDouble();
 break;
 } else {
 System.out.println("Invalid input! Please enter a valid number.");
 sc.next();
 }
 }
 while (true) {
 System.out.print("Enter time period in years: ");
 if (sc.hasNextDouble()) {
 time = sc.nextDouble();
 break;
 } else {
 System.out.println("Invalid input! Please enter a valid number.");
 sc.next();
 }
 }
 int choice = 0;
 while (true) {
 System.out.print("\n1. Calculate Simple Interest\n2. Calculate Compound Interest\n\nEnter your choice
(1-2): ");
 if (sc.hasNextInt()) {
 choice = sc.nextInt();
 if (choice == 1 || choice == 2) {
 break;
 } else {
 System.out.println("Invalid choice, please enter 1 or 2.");
 }
 } else {
 System.out.println("Invalid input! Please enter a valid number.");
 sc.next();
 }
 }
 SCI sci = (choice == 1) ? new SimpleInterest(p_amt, rate, time) : new CompoundInterest(p_amt, rate,
time);
 System.out.println("\nThe Interest is: " + sci.interest());
 System.out.print("\nDo you want to calculate another interest? (yes/no): ");
 String userChoice = sc.next();
 if (!userChoice.equalsIgnoreCase("yes")) {
 continueProgram = false;
 }
 } while (continueProgram);
 System.out.println("\nPROGRAM TERMINATED.");
 sc.close();
 }
}

Interface Class -
9. Write a Java program that defines an interface Shape with methods for calculating surface area and
volume. Implement classes for Sphere, Cube, Rectangular Prism, and Right Circular Cylinder, each
providing specific formulas. Develop a main class to instantiate these shapes and display their surface areas
and volumes.
File Name: ShapeDemo.java
Code:
import java.util.Scanner;
interface Shape {
 double calculateSurfaceArea();
 double calculateVolume();
}
class Sphere implements Shape {
 private double radius;
 public Sphere(double radius) {
 this.radius = radius;
 }
 @Override
 public double calculateSurfaceArea() {
 return 4 * Math.PI * radius * radius;
 }
 @Override
 public double calculateVolume() {
 return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
 }
}
class Cube implements Shape {
 private double side;
 public Cube(double side) {
 this.side = side;
 }
 @Override
 public double calculateSurfaceArea() {
 return 6 * side * side;
 }
 @Override
 public double calculateVolume() {
 return Math.pow(side, 3);
 }
}
class RectangularPrism implements Shape {
 private double length, width, height;
 public RectangularPrism(double length, double width, double height) {
 this.length = length;
 this.width = width;
 this.height = height;
 }
 @Override
 public double calculateSurfaceArea() {
 return 2 * (length * width + width * height + height * length);
 }
 @Override
 public double calculateVolume() {
 return length * width * height;
 }
}
class RightCircularCylinder implements Shape {
 private double radius, height;
 public RightCircularCylinder(double radius, double height) {
 this.radius = radius;
 this.height = height;
 }
 @Override
 public double calculateSurfaceArea() {
 return 2 * Math.PI * radius * (radius + height);
 }
 @Override
 public double calculateVolume() {
 return Math.PI * radius * radius * height;
 }
}
public class ShapeDemo {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String choice = ""; // Initialize choice to prevent compilation error
 try {
 System.out.println("==============================================");
 System.out.println(" Dynamic Shape Surface Area and Volume ");
 System.out.println("==============================================");
 do {
 System.out.println("Choose a shape to calculate: ");
 System.out.println("1. Sphere");
 System.out.println("2. Cube");
 System.out.println("3. Rectangular Prism");
 System.out.println("4. Right Circular Cylinder");
 System.out.print("Enter your choice (1/2/3/4): ");
 int shapeChoice = sc.nextInt();
 sc.nextLine();
 Shape shape = null;
 switch (shapeChoice) {
 case 1:
 System.out.print("Enter the radius of the sphere: ");
 double radius = sc.nextDouble();
 sc.nextLine();
 shape = new Sphere(radius);
 break;
 case 2:
 System.out.print("Enter the side of the cube: ");
 double side = sc.nextDouble();
 sc.nextLine();
 shape = new Cube(side);
 break;
 case 3:
 System.out.print("Enter the length, width, and height of the rectangular prism: ");
 double length = sc.nextDouble();
 double width = sc.nextDouble();
 double height = sc.nextDouble();
 sc.nextLine();
 shape = new RectangularPrism(length, width, height);
 break;
 case 4:
 System.out.print("Enter the radius and height of the right circular cylinder: ");
 double cylinderRadius = sc.nextDouble();
 double cylinderHeight = sc.nextDouble();
 sc.nextLine();
 shape = new RightCircularCylinder(cylinderRadius, cylinderHeight);
 break;
 default:
 System.out.println("Invalid choice. Please select a valid option.");
 continue;
 }
 System.out.println("Surface Area: " + shape.calculateSurfaceArea());
 System.out.println("Volume: " + shape.calculateVolume());
 System.out.print("Do you want to calculate for another shape? (yes/no): ");
 choice = sc.nextLine();
 } while (choice.equalsIgnoreCase("yes"));
 } catch (Exception e) {
 System.out.println("Error occurred: " + e.getMessage());
 } finally {
 sc.close();
 }
 }
}

10. Develop a payroll system in Java to illustrate the concept of multiple inheritance.
• Design an interface called as "NetPayCalculation" with the following method declarations -
 a. void grossPayCalculation();
 b. void taxCalculation();
 c. float netPayCalculation();
• Design a simple class called as "Employee" with the following variables and methods:
 Variables are ~
 - int ID_No;
 - String name , Designation , PAN_No ,Department ;
 - float Basic_Pay
 Methods are ~
 - void get_Data() -- get all the variables defined/mentioned above.
• Design a main class which is called "Payroll" extends and implements the above mentioned
class & interface respectively with following variables and methods:
 Variables are ~
 - float gross_pay, taxable_amount, net_pay.
 Method are ~
 - void display_details() -- to display all the details about an employee.
• Specifications:
grossPayCalculation method -
 Define 2 float variables DA, HRA where:
 DA = 50% of basic pay
 HRA = 20% of basic pay
 Gross_Pay = sum of DA, HRA and basic_pay
Tax calculation method -
If total annual income for 12 months is between >= 100000 and < 200000, then taxable amount =
20% of gross_pay.
• If > 200000, taxable amount = 30% of gross pay.
• Net pay calculation method:
 From this method call the grossPay and taxCalculation methods and calculate the Net Pay as gross_pay -
taxable_amount;
 Return the net_pay.
• In main (method):
 Create an object and call the get_Data() and display_details() methods.
File Name: PayRollSystem.java
Code:
import java.util.Scanner;
interface NetPayCalculation {
 void grossPayCalculation();
 void taxCalculation();
 void netPayCalculation();
}
class Employee {
 int id_no;
 float basic_pay;
 String name, dateOfJoining, designation, pan_no, department;
 void getData(int id, String name, String dOJ, String desg, String pn, String dept, float bp) {
 this.id_no = id;
 this.name = name;
 this.dateOfJoining = dOJ;
 this.designation = desg;
 this.pan_no = pn;
 this.department = dept;
 this.basic_pay = bp;
 }
}
class PayRoll extends Employee implements NetPayCalculation {
 float grossPay, taxableAmount, netPay;
 PayRoll(int id, String name, String dOJ, String desg, String pn, String dept, float bp) {
 getData(id, name, dOJ, desg, pn, dept, bp);
 }
 public void netPayCalculation() {
 netPay = grossPay - taxableAmount;
 }
 public void grossPayCalculation() {
 float da, hra; // represents dearness allowance and home rent allowance
 da = 0.5f * basic_pay;
 hra = 0.2f * basic_pay;
 grossPay = basic_pay + da + hra;
 }
 public void taxCalculation() {
 if (grossPay >= 100000 && grossPay < 200000) {
 taxableAmount = 0.20f * grossPay;
 } else if (grossPay > 300000) {
 taxableAmount = 0.30f * grossPay;
 } else {
 taxableAmount = 0;
 }
 }
 public void displayDetails() {
 System.out.printf("| %-6d | %-15s | %-15s | %-15s | %-15s | %-15s | %-10.2f | %-10.2f | %-10.2f | %-10.2f
|\n",
 id_no, name, dateOfJoining, designation, pan_no, department, basic_pay, grossPay, taxableAmount,
netPay);
 }
}
public class PayRollSystem {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of employees: ");
 int numberOfEmployees = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 PayRoll[] employees = new PayRoll[numberOfEmployees];
 for (int i = 0; i < numberOfEmployees; i++) {
 System.out.println("Enter details for employee " + (i + 1) + ":");
 System.out.print("ID: ");
 int id = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 System.out.print("Name: ");
 String name = scanner.nextLine();
 System.out.print("Date of Joining (dd/mm/yyyy): ");
 String dOJ = scanner.nextLine();
 System.out.print("Designation: ");
 String desg = scanner.nextLine();
 System.out.print("PAN No: ");
 String pn = scanner.nextLine();
 System.out.print("Department: ");
 String dept = scanner.nextLine();
 System.out.print("Basic Pay: ");
 float bp = scanner.nextFloat();
 scanner.nextLine(); // Consume newline
 employees[i] = new PayRoll(id, name, dOJ, desg, pn, dept, bp);
 }
 System.out.println("+--------+-----------------+-----------------+-----------------+-----------------+-----------------
+------------+------------+------------+------------+");
 System.out.println("| ID | Name | Date of Joining | Designation | PAN No | Department |
Basic Pay | Gross Pay | Taxable Amt| Net Pay |");
 System.out.println("+--------+-----------------+-----------------+-----------------+-----------------+-----------------
+------------+------------+------------+------------+");
 // Calculate and display details for each employee
 for (PayRoll employee : employees) {
 employee.grossPayCalculation();
 employee.taxCalculation();
 employee.netPayCalculation();
 employee.displayDetails();

}
 System.out.println("+--------
+-----------------
+-----------------
+-----------------
+-----------------
+-----------------
+------------
+------------
+------------
+------------+");
 scanner.close();

}
}

Package -
11. Write a java program to create a user defined package and test whether the given package is
palindrome or not.
File Name: PlindromeChecker.java
Code:
package mypackage;
public class PalindromeChecker {
 public boolean isPalindrome(String str) {
 if (str == null) {
 return false; // Null strings are not palindromes.
 }
 str = str.replaceAll("\\s+", "").toLowerCase();
 int left = 0, right = str.length() - 1;
 while (left < right) {
 if (str.charAt(left) != str.charAt(right)) {
 return false;
 }
 left++;
 right--;
 }
 return true;
 }
}
File Name: TestPlindrome.java
Code:
import mypackage.PalindromeChecker;
import java.util.Scanner;
public class TestPalindrome {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 PalindromeChecker checker = new PalindromeChecker();
 System.out.println("===================================");
 System.out.println(" PALINDROME CHECKER ");
 System.out.println("===================================\n");
 while (true) {
 try {
 System.out.print("Your input: ");
 String input = scanner.nextLine();
 if (input.trim().isEmpty()) {
 throw new IllegalArgumentException("Input cannot be empty. Please enter a valid string.");
 }
 if (checker.isPalindrome(input)) {
 System.out.println("The string \"" + input + "\" is a palindrome.\n");
 } else {
 System.out.println("The string \"" + input + "\" is not a palindrome.\n");
 }
 System.out.print("Would you like to check another string? (yes/no): ");
 String choice = scanner.nextLine().trim().toLowerCase();
 if (!choice.equals("yes")) {
 System.out.println("\n===================================");
 System.out.println(" THANK YOU FOR USING THE TOOL! ");
 System.out.println("===================================");
 break;
 }
 } catch (IllegalArgumentException e) {
 System.out.println("Error: " + e.getMessage() + "\n");
 } catch (Exception e) {
 System.out.println("An unexpected error occurred: " + e.getMessage() + "\n");
 }
 }
 scanner.close();
 }
}

Exception Handling –
12. Create a class Student with attributes roll no, name, age and course. Initialize values through
parameterized constructors. If the age of the student is not between 14 and 21 then generate a user-defined
exception ”AgeNotWithinRangeException”. If the name contains a number or special symbol, raise the
exception “NameNotValidException”. Define the two exception classes
File Name: Student.java
Code:
import java.util.Scanner;
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
 super(message);
 }
}
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
 super(message);
 }
}
class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException,
NameNotValidException {
 if (age < 14 || age > 21)
 throw new AgeNotWithinRangeException("Age must be between 14 and 21.");
 if (!name.matches("[a-zA-Z]+"))
 throw new NameNotValidException("Name must only contain alphabets.");

 this.rollNo = rollNo;
 this.name = name;
 this.age = age;
 this.course = course;
 }
 public void display() {
 System.out.printf("Roll No: %d\nName: %s\nAge: %d\nCourse: %s\n", rollNo, name, age, course);
 }
}
public class Main {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("=== Student Registration System ===");
 while (true) {
 try {
 System.out.print("Enter Roll No: ");
 int rollNo = scanner.nextInt();
 scanner.nextLine();

 System.out.print("Enter Name: ");
 String name = scanner.nextLine();

 System.out.print("Enter Age: ");
 int age = scanner.nextInt();
 scanner.nextLine();

 System.out.print("Enter Course: ");
 String course = scanner.nextLine();
 Student student = new Student(rollNo, name, age, course);
 System.out.println("\nStudent Registered Successfully!");
 student.display();
 } catch (AgeNotWithinRangeException | NameNotValidException e) {
 System.out.println("Error: " + e.getMessage());
 } catch (Exception e) {
 System.out.println("Invalid input. Please try again.");
 scanner.nextLine();
 }
 System.out.print("\nDo you want to register another student? (yes/no): ");
 if (!scanner.nextLine().trim().equalsIgnoreCase("yes")) break;
 }
 System.out.println("\nThank you for using the Student Registration System!");
 scanner.close();
 }
}


13. Define class MyDate with member’s day, month, and year. Define default and parameterized
constructors. Accept values from the command line and create a date object. Throw user defined exceptions
- “InvalidDayException” or “InvalidMonthException” if the day and month are invalid. If the date is valid,
display the message “Valid date”.
File Name: MyDate.java
Code:
class InvalidDayException extends Exception {
 public InvalidDayException(String message) {
 super(message);
 }
}
class InvalidMonthException extends Exception {
 public InvalidMonthException(String message) {
 super(message);
 }
}
public class MyDate {
 private int day, month, year;
 public MyDate() {
 this.day = 1;
 this.month = 1;
 this.year = 2000; // Default date
 }
 public MyDate(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
 if (month < 1 || month > 12) throw new InvalidMonthException("Invalid Month: " + month);
 if (day < 1 || day > daysInMonth(month, year)) throw new InvalidDayException("Invalid Day: " + day);
 this.day = day;
 this.month = month;
 this.year = year;
 }
 private static int daysInMonth(int month, int year) {
 return switch (month) {
 case 4, 6, 9, 11 -> 30;
 case 2 -> (isLeapYear(year) ? 29 : 28);
 default -> 31;
 };
 }
 private static boolean isLeapYear(int year) {
 return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
 }
 public static void main(String[] args) {
 if (args.length < 3) {
 System.out.println("Please provide day, month, and year as command line arguments.");
 return;
 }
 try {
 int day = Integer.parseInt(args[0]);
 int month = Integer.parseInt(args[1]);
 int year = Integer.parseInt(args[2]);
 MyDate date = new MyDate(day, month, year);
 System.out.println("Valid date: " + day + "/" + month + "/" + year);
 } catch (InvalidDayException | InvalidMonthException e) {
 System.out.println(e.getMessage());
 } catch (NumberFormatException e) {
 System.out.println("Please enter valid integers for day, month, and year.");
 } catch (Exception e) {
 System.out.println("An unexpected error occurred: " + e.getMessage());
 }
 }
}

14. Define a class which contains the method “DisplayColor” which takes one character as argument. Raise
an error if the character is not an alphabet. If the alphabet is a color of the rainbow, display the color name.
If it is any other alphabet, report an error.
File Name: RainbowColor.java
Code:
import java.util.Scanner;
class RainbowColor {
 public void DisplayColor(char ch) {
 if (!Character.isAlphabetic(ch))
 throw new IllegalArgumentException("Input is not an alphabet.");
 switch (Character.toUpperCase(ch)) {
 case 'R' -> System.out.println("Red");
 case 'O' -> System.out.println("Orange");
 case 'Y' -> System.out.println("Yellow");
 case 'G' -> System.out.println("Green");
 case 'B' -> System.out.println("Blue");
 case 'I' -> System.out.println("Indigo");
 case 'V' -> System.out.println("Violet");
 default -> throw new IllegalArgumentException("Invalid color character.");
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 RainbowColor color = new RainbowColor();
 boolean runAgain;
 do {
 System.out.println("==================================");
 System.out.println(" Rainbow Color Finder ");
 System.out.println("==================================");
 System.out.println("Instructions:");
 System.out.println("Enter a single character representing a color of the rainbow:");
 System.out.println("Valid characters: R, O, Y, G, B, I, V");
 System.out.println();
 try {
 System.out.print("Enter a character: ");
 char ch = sc.next().charAt(0);
 color.DisplayColor(ch);
 } catch (IllegalArgumentException e) {
 System.out.println(e.getMessage());
 } catch (Exception e) {
 System.out.println("An unexpected error occurred: " + e.getMessage());
 }
 System.out.print("Do you want to check another color? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Rainbow Color Finder!");
 }
}

15. Write a program which accepts two integers and an arithmetic operator from the command line and
performs the operation. Fire the following user-defined exceptions:
1. If the number of arguments is less than 3, then fire "Illegal Number of Arguments."
2. If the operator is not an arithmetic operator, throw "Invalid Operator Exception."
3. If the result is negative, then throw "Negative Result Exception."
File Name: ArithmeticOperation.java
Code:
class IllegalNumberOfArguments extends Exception {
 public IllegalNumberOfArguments(String msg) { super(msg); }
}
class InvalidOperatorException extends Exception {
 public InvalidOperatorException(String msg) { super(msg); }
}
class NegativeResultException extends Exception {
 public NegativeResultException(String msg) { super(msg); }
}
public class ArithmeticOperation {
 public static void main(String[] args) {
 try {
 if (args.length < 3)
 throw new IllegalNumberOfArguments("Illegal Number of Arguments: Provide 2 numbers and an
operator.");
 int num1 = Integer.parseInt(args[0]);
 int num2 = Integer.parseInt(args[1]);
 char op = args[2].charAt(0);
 int result = performOperation(num1, num2, op);
 if (result < 0)
 throw new NegativeResultException("Negative Result Exception: Result is negative.");
 System.out.println("Result: " + result);
 } catch (IllegalNumberOfArguments e) {
 System.err.println(e.getMessage());
 } catch (InvalidOperatorException e) {
 System.err.println(e.getMessage());
 } catch (NegativeResultException e) {
 System.err.println(e.getMessage());
 } catch (ArithmeticException e) {
 System.err.println(e.getMessage());
 } catch (NumberFormatException e) {
 System.err.println("Please enter valid integers for the numbers.");
 } catch (Exception e) {
 System.err.println("An unexpected error occurred: " + e.getMessage());
 }
 }
 public static int performOperation(int a, int b, char op) throws InvalidOperatorException {
 switch (op) {
 case '+': return a + b;
 case '-': return a - b;
 case '*': return a * b;
 case '/':
 if (b == 0) throw new ArithmeticException("Division by zero.");
 return a / b;
 default: throw new InvalidOperatorException("Invalid Operator Exception: Use +, -, *, or /.");
 }
 }
}

16. Define Exception VowelException, BlankException, and ExitException. Write another class Test which
reads a character from the command line. If it is a vowel, throw a VowelException. If it is blank, throw
BlankException. And for a character ('x'), throw an ExitException and terminate the program. For any
other character, display "Valid Character."
File Name: Test.java
Code:
class VowelException extends Exception {
 public VowelException(String msg) {
 super(msg);
 }
}
class BlankException extends Exception {
 public BlankException(String msg) {
 super(msg);
 }
}
class ExitException extends Exception {
 public ExitException(String msg) {
 super(msg);
 }
}
public class Test {
 public static void main(String[] args) {
 if (args.length < 1) {
 System.err.println("Please provide a character as a command line argument.");
 return;
 }
 String input = args[0];
 try {
 if (input.isEmpty()) {
 throw new BlankException("Input is blank.");
 }
 char ch = input.charAt(0);
 if ("AEIOUaeiou".indexOf(ch) != -1) {
 throw new VowelException("Input is a vowel.");
 }
 if (ch == 'X' || ch == 'x') {
 throw new ExitException("Exiting program.");
 }
 // If it's a valid character, print the message
 System.out.println("Valid character.");
 } catch (VowelException e) {
 System.err.println(e.getMessage());
 } catch (BlankException e) {
 System.err.println(e.getMessage());
 } catch (ExitException e) {
 System.err.println(e.getMessage());
 } catch (Exception e) {
 System.err.println("An unexpected error occurred: " + e.getMessage());
 }
 }
}

Strings Handling –
17. Write a program that asks the user for a sentence. Display the sentence backwards letter by letter
example
• Enter a sentence -
Mary had a little lamb.
• Your sentence backwards -
.bmal eittil a dah yraM
File Name: SentenceReverser.java
Code:
import java.util.Scanner;
public class SentenceReverser {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("================================");
 System.out.println(" Sentence Reverser ");
 System.out.println("================================\n");
 boolean continueProgram = true;
 while (continueProgram) {
 System.out.println("Enter a sentence: ");
 String sentence = sc.nextLine();
 if (sentence.trim().isEmpty()) {
 System.out.println("Invalid input! Please enter a non-empty sentence.\n");
 continue;
 }
 System.out.println("\nYour sentence backwards: ");
 printReverseSentence(sentence);
 String choice;
 while (true) {
 System.out.println("\n\nDo you want to try again with another sentence? (YES/NO): ");
 choice = sc.nextLine().trim();
 if (choice.equalsIgnoreCase("yes")) {
 break;
 } else if (choice.equalsIgnoreCase("no")) {
 continueProgram = false;
 break;
 } else {
 System.out.println("Invalid input! Please enter 'YES' or 'NO'.");
 }
 }
 System.out.println();
 }
 System.out.println("PROGRAM TERMINATED.");
 sc.close();
 }
 public static void printReverseSentence(String str) {
 for (int i = str.length() - 1; i >= 0; i--) {
 System.out.print(str.charAt(i));
 }
 }
}

18. Write a method called reverse() that accepts a sentence as a string, and then returns that string with
the words backwards. Write a main() method that gets the string from the user and then displays the string
backwards. For Ex:
• Enter a sentence -
Mary had a little lamb.
• Your sentence backwards -
lamb. little a had Mary
File Name: ReverseWords.java
Code:
import java.util.Scanner;
public class ReverseWords {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);

 System.out.println("========================================");
 System.out.println(" Reverse Words in Sentence ");
 System.out.println("========================================\n");
 String choice = "yes";
 while(choice.equalsIgnoreCase("yes")) {
 System.out.println("Enter a sentence:");
 String sentence = sc.nextLine().trim();
 if (!sentence.isEmpty()) {
 System.out.println("\nYour sentence with words in reverse order:");
 System.out.println(reverse(sentence));
 } else {
 System.out.println("Please enter a valid sentence.");
 }
 System.out.println("\nDo you want to try again with another sentence? (YES/NO): ");
 choice = sc.nextLine().trim();
 }
 sc.close();
 System.out.println("\nProgram terminated.");
 }
 public static String reverse(String sentence) {
 StringBuilder reversedSentence = new StringBuilder();
 StringBuilder word = new StringBuilder();
 // Traverse the sentence in reverse
 for (int i = sentence.length() - 1; i >= 0; i--) {
 char ch = sentence.charAt(i);
 // Build each word using char
 if (ch != ' ') {
 word.insert(0, ch);
 } else {
 reversedSentence.append(word).append(" ");
 word.setLength(0); // Reset the word
 }
 }
 reversedSentence.append(word);
 return reversedSentence.toString();
 }
}

19. Write a java program to read a paragraph of text from the console and print the number of vowels and
the position of vowel, number of characters, number of lines and number of sentences by using String
buffer and String tokenizer.
File Name: ParagraphAnalyzer.java
Code:
import java.util.Scanner;
import java.util.StringTokenizer;
public class ParagraphAnalyzer {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

 System.out.println("===============================================");
 System.out.println(" Paragraph Analyzer ");
 System.out.println("===============================================\n");
 String choice = "yes";
 while(choice.equalsIgnoreCase("yes")) {
 System.out.println("Enter the paragraph (Press Enter on an empty line to finish): ");

 StringBuffer paragraph = new StringBuffer();
 String line;
 while(!(line = sc.nextLine()).isEmpty()) {
 paragraph.append(line).append("\n");
 }
 String text = paragraph.toString();

 int characterCount = text.length();
 int vowelCount = countVowels(text);
 int wordCount = countWords(text);
 int lineCount = countLines(text);
 String vowelPositions = vowelPositions(text);
 int sentenceCount = countSentences(text);
 System.out.println("\n--- Paragraph Analysis ---");
 System.out.println("Number of characters: " + characterCount);
 System.out.println("Number of vowels: " + vowelCount);
 System.out.println("Positions of vowels: " + vowelPositions.trim());
 System.out.println("Number of words: " + wordCount);
 System.out.println("Number of lines: " + lineCount);
 System.out.println("Number of sentences: " + sentenceCount);
 System.out.print("\nDo you want to analyze another paragraph? (YES/NO): ");
 choice = sc.nextLine().trim();
 }
 sc.close();
 System.out.println("\nProgram terminated.");
 }
 private static int countVowels(String text) {
 int count = 0;
 String vowels = "AEIOUaeiou";
 for(int i = 0; i < text.length(); i++) {
 if(vowels.indexOf(text.charAt(i)) != -1) {
 count++;
 }
 }
 return count;
 }
 private static int countWords(String text) {
 StringTokenizer words = new StringTokenizer(text);
 return words.countTokens();
 }
 private static int countLines(String text) {
 StringTokenizer lines = new StringTokenizer(text, "\n");
 return lines.countTokens();
 }
 private static int countSentences(String text) {
 StringTokenizer sentences = new StringTokenizer(text, ".!?");
 return sentences.countTokens();
 }
 private static String vowelPositions(String text) {
 StringBuffer allVowelPosition = new StringBuffer();
 String vowels = "AEIOUaeiou";
 for(int i = 0; i < text.length(); i++) {
 char c = text.charAt(i);
 if(vowels.indexOf(c) != -1) {
 allVowelPosition.append(i + 1).append(" ");
 }
 }
 return allVowelPosition.toString();
 }
}

20. Write a program that lets the user input a string of maximum 20 characters. If the length of the string
is less the rest of the characters should be filled with * Print the string into the console.
File Name: StringCenterPad.java
Code:
import java.util.Scanner;
public class StringCenterPad {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);

 System.out.println("=====================================");
 System.out.println(" String Center Pad ");
 System.out.println("=====================================\n");
 String tryAgain = "yes";
 while (tryAgain.equalsIgnoreCase("yes")) {
 System.out.println("Enter a string of 20 characters or less (or type 'exit' to quit):");
 String str = sc.nextLine(); // Use nextLine() to capture the full string
 if (str.equalsIgnoreCase("exit")) {
 System.out.println("\nProgram terminated.");
 break;
 }
 if (str.length() <= 20) {
 System.out.println("Enter a character to pad with:");
 char paddingChar = sc.next().charAt(0);
 int padding = (20 - str.length()) / 2;
 int extraPadding = (20 - str.length()) % 2; // To handle odd-length padding
 StringBuilder filledString = new StringBuilder();
 for (int i = 0; i < padding; i++) {
 filledString.append(paddingChar);
 }
 filledString.append(str);

 for (int i = 0; i < padding + extraPadding; i++) {
 filledString.append(paddingChar);
 }
 System.out.println("\nHere is your centered and padded string:");
 System.out.println(filledString.toString());
 System.out.println("\nDo you want to try again with another string? (yes/no)");
 tryAgain = sc.next();
 sc.nextLine();
 } else {
 System.out.println("\nError: String is too long. Please try again.");
 }
 }
 System.out.println("\nProgram terminated.");
 sc.close();
 }
}

21. Write a java program that extracts from a given text all the sentences that contain a given word.
Example: The word is "in"
• The text is –
We are living in a yellow submarine. We don't have anything else. Inside the submarine is
very tight. So we are drinking all day. We will move out of it in 15 days.
• The expected result is -
We are living in a yellow submarine.
We will move out of it in 5 days.
• Consider that the sentences are separated by "." and the words - by non-letter symbols.
File Name: SentenceExtractor.java
Code:
import java.util.Scanner;
public class SentenceExtractor {
 public static String extractSentences(String text, String word) {
 StringBuilder sentence = new StringBuilder();
 StringBuilder currentWord = new StringBuilder();
 boolean foundWord = false;
 String sentences = "";
 for (int i = 0; i < text.length(); i++) {
 char currentChar = text.charAt(i);

 if (Character.isLetter(currentChar)) {
 currentWord.append(currentChar);
 } else {
 if (currentWord.toString().equals(word)) {
 foundWord = true;
 }
 currentWord.setLength(0);
 }
 sentence.append(currentChar);

 if (currentChar == '.') {
 if (foundWord) {
 sentences += sentence.toString().trim() + "\n";
 }
 sentence.setLength(0);
 foundWord = false;
 }
 }
 return sentences;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("=====================================");
 System.out.println(" Sentence Extractor ");
 System.out.println("=====================================");

 String choice;
 do {
 System.out.println("Enter the text:");
 String text = sc.nextLine();
 System.out.println("Enter the word to extract sentences containing it:");
 String word = sc.nextLine();
 String sentences = extractSentences(text, word);
 System.out.println("The sentences containing the word \"" + word + "\" are:");
 System.out.println(sentences);
 System.out.println("Do you want to try again with another text? (yes/no): ");
 choice = sc.nextLine();
 } while (choice.equalsIgnoreCase("yes"));

 System.out.println("Program terminated.");
 sc.close();
 }
}

22. Write a Java program that replaces the forbidden words with some symbols like **,$,#)
Example -
Microsoft announced its next generation Java compiler today. It uses an advanced parser and special
optimizer for the Microsoft JVM.
• Words: "Java, JVM, Microsoft"
• ********* announced its next generation **** compiler today. It uses advanced parser and
special optimizer for the ********* ***.
File Name: ForbiddenWordReplacer.java
Code:
import java.util.Scanner;
public class ForbiddenWordReplacer {
 public static boolean matchWord(String str, String forbiddenWord) {
 if (str.length() != forbiddenWord.length()) {
 return false;
 }
 for (int i = 0; i < str.length(); i++) {
 if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(forbiddenWord.charAt(i))) {
 return false;
 }
 }
 return true;
 }
 public static String replaceWithSymbols(String word, char symbol) {
 StringBuilder result = new StringBuilder();
 for (int i = 0; i < word.length(); i++) {
 result.append(symbol);
 }
 return result.toString();
 }
 public static String replaceForbiddenWords(String sentence, String[] forbiddenWords, int
forbiddenWordCount, char symbol) {
 StringBuilder result = new StringBuilder();
 int i = 0;
 while (i < sentence.length()) {
 StringBuilder word = new StringBuilder();
 while (i < sentence.length() && sentence.charAt(i) != ' ') {
 word.append(sentence.charAt(i));
 i++;
 }
 boolean isForbidden = false;
 for (int j = 0; j < forbiddenWordCount; j++) {
 if (matchWord(word.toString(), forbiddenWords[j])) {
 result.append(replaceWithSymbols(word.toString(), symbol));
 isForbidden = true;
 break;
 }
 }
 if (!isForbidden) {
 result.append(word);
 }
 if (i < sentence.length() && sentence.charAt(i) == ' ') {
 result.append(' ');
 }
 i++;
 }
 return result.toString();
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 try {
 System.out.println("============================================");
 System.out.println(" Forbidden Word Replacer Program ");
 System.out.println("============================================");
 String userChoice;
 do {
 System.out.print("Enter the sentence: ");
 String sentence = sc.nextLine();
 System.out.println("Enter forbidden words one by one (press Enter on an empty line to finish): ");
 String[] forbiddenWords = new String[100];
 int forbiddenWordCount = 0;
 while (true) {
 String word = sc.nextLine();
 if (word.equals("")) {
 break;
 }
 forbiddenWords[forbiddenWordCount] = word;
 forbiddenWordCount++;
 }
 char symbol = ' ';
 while (symbol == ' ') {
 try {
 System.out.print("Enter the symbol to replace forbidden words with: ");
 String inputSymbol = sc.nextLine();
 if (inputSymbol.length() == 1) {
 symbol = inputSymbol.charAt(0);
 } else {
 System.out.println("Please enter only one character for the symbol.");
 }
 } catch (Exception e) {
 System.out.println("Error: Invalid input. Please enter a valid symbol.");
 sc.nextLine();
 }
 }
 String result = replaceForbiddenWords(sentence, forbiddenWords, forbiddenWordCount, symbol);
 System.out.println("\nFiltered sentence: ");
 System.out.println(result);
 System.out.print("\nDo you want to enter another sentence? (yes/no): ");
 userChoice = sc.nextLine();
 } while (userChoice.equalsIgnoreCase("yes"));
 } catch (Exception e) {
 System.out.println("Error occurred: " + e.getMessage());
 } finally {
 sc.close();
 }
 }
}

23. Write a java program that reads a string from the console and replaces all series of consecutive identical
letters with a single one.
File Name: UniqueCharacterCounter.java
Code:
import java.util.Scanner;
public class UniqueCharacterCounter {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String choice;
 try {
 System.out.println("==============================================");
 System.out.println(" Unique Character Counter Program ");
 System.out.println("==============================================");
 do {
 System.out.print("Enter a string: ");
 String input = sc.nextLine();
 String uniqueChars = getUniqueChars(input);
 String charCounts = countTotalOccurrences(input);
 System.out.println("Unique characters: " + uniqueChars);
 System.out.println("Characters count: " + charCounts);
 System.out.print("Do you want to try with other strings? (yes/no): ");
 choice = sc.nextLine();
 } while (choice.equalsIgnoreCase("yes"));

 } catch (Exception e) {
 System.out.println("Error occurred: " + e.getMessage());
 } finally {
 sc.close();
 }
 }
 public static String getUniqueChars(String input) {
 String result = "";
 for (char c : input.toCharArray()) {
 if (result.indexOf(c) == -1) {
 result += c;
 }
 }
 return result;
 }
 public static String countTotalOccurrences(String input) {
 String result = "";
 for (char c : input.toCharArray()) {
 if (result.indexOf(c) == -1) {
 int count = 0;
 for (char ch : input.toCharArray()) {
 if (ch == c) {
 count++;
 }
 }
 result += c + String.valueOf(count);
 }
 }
 return result;
 }
}

24. Write a java program to read a text from the console. It will count all occurrences of that word. Replaces
all occurrences of that word with another word( Find and replace function).
File Name: FindAndReplace.java
Code:
import java.util.Scanner;
public class FindAndReplace {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String choice;
 try {
 System.out.println("==============================================");
 System.out.println(" Find and Replace Program ");
 System.out.println("==============================================");
 do {
 System.out.println("Enter the text: ");
 String text = sc.nextLine();
 System.out.println("Enter the word to find: ");
 String findWord = sc.nextLine();
 System.out.println("Enter the word to replace with: ");
 String replaceWord = sc.nextLine();
 String[] words = splitText(text);
 StringBuilder result = new StringBuilder();
 int count = 0;
 for (String word : words) {
 String cleanedWord = word.replaceAll("[^a-zA-Z]", ""); // Remove punctuation for comparison
 if (cleanedWord.equals(findWord)) {
 count++;
 result.append(replaceWord);
 } else {
 result.append(word);
 }
 result.append(" ");
 }
 System.out.println("\nOriginal text: " + text);
 System.out.println("Modified text: " + result.toString().trim());
 System.out.println("Occurrences of '" + findWord + "': " + count);
 System.out.print("Do you want to try with another text? (yes/no): ");
 choice = sc.nextLine();
 } while (choice.equalsIgnoreCase("yes"));
 } catch (Exception e) {
 System.out.println("Error occurred: " + e.getMessage());
 } finally {
 sc.close();
 }
 }
 public static String[] splitText(String text) {
 int length = text.length();
 String[] words = new String[length];
 int wordCount = 0;
 StringBuilder currentWord = new StringBuilder();
 for (int i = 0; i < length; i++) {
 char ch = text.charAt(i);
 if (ch == ' ') {
 if (currentWord.length() > 0) {
 words[wordCount++] = currentWord.toString();
 currentWord = new StringBuilder();
 }
 } else {
 currentWord.append(ch);
 }
 }
 if (currentWord.length() > 0) {
 words[wordCount++] = currentWord.toString();
 }
 String[] result = new String[wordCount];
 System.arraycopy(words, 0, result, 0, wordCount);
 return result;
 }
}


25. Write a java program that figures out whether one string is an anagram of another string. An anagram
is a word or a phrase made by transporting the letters of another word or phrase; for example,
"parliament" is an anagram of "partial men," and "software" is an anagram of "swear oft." The program
should ignore white space and punctuation.
File Name: AnagramChecker.java
Code:
import java.util.Scanner;
public class AnagramChecker {
 public static boolean areAnagrams(String str1, String str2) {
 str1 = str1.toLowerCase();
 str2 = str2.toLowerCase();
 int[] charCount1 = new int[26];
 int[] charCount2 = new int[26];
 for(int i = 0; i < str1.length(); i++) {
 char ch = str1.charAt(i);
 if(ch >= 'a' && ch <= 'z') {
 charCount1[ch - 'a']++;
 }
 }
 for(int i = 0; i < str2.length(); i++) {
 char ch = str2.charAt(i);
 if(ch >= 'a' && ch <= 'z') {
 charCount2[ch - 'a']++;
 }
 }
 for(int i = 0; i < 26; i++) {
 if(charCount1[i] != charCount2[i]) {
 return false;
 }
 }
 return true;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 String choice;
 try {
 System.out.println("=============================================");
 System.out.println(" Anagram Checker Program ");
 System.out.println("=============================================");
 do {
 System.out.println("Enter the first string: ");
 String str1 = sc.nextLine();
 System.out.println("Enter the second string: ");
 String str2 = sc.nextLine();
 if(areAnagrams(str1, str2)) {
 System.out.println("The strings are anagrams.");
 } else {
 System.out.println("The strings are not anagrams.");
 }
 System.out.print("Do you want to try again with other strings? (yes/no): ");
 choice = sc.nextLine();
 } while (choice.equalsIgnoreCase("yes"));
 } catch (Exception e) {
 System.out.println("Error occurred: " + e.getMessage());
 } finally {
 sc.close();
 }
 }
}

Regular Expression –
26. Some websites impose certain rules for passwords. write a method that checks whether a string is valid
password. Suppose the password rule is as follows:
a. Rules:
i. A password must have at least eight characters
ii. A password consists of only letters and digits.
iii. A password must contains at least two digits.
b. Write a java program that prompts the user to enter a password and displays “Valid Password” if
the rule is followed or “Invalid Password” otherwise
File Name: PasswordValidator.java
Code:
import java.util.Scanner;
public class PasswordValidator {
 public static boolean isValidPassword(String password) {
 if (password.length() < 8) {
 return false;
 }
 int digitCount = 0;
 for (char c : password.toCharArray()) {
 if (!Character.isLetter(c) && !Character.isDigit(c)) {
 return false;
 }
 if (Character.isDigit(c)) {
 digitCount++;
 }
 }
 return digitCount >= 2;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain;
 do {
 System.out.println("==================================");
 System.out.println(" Password Validator ");
 System.out.println("==================================");
 System.out.println("Instructions for a valid password:");
 System.out.println("1. Must be at least 8 characters long.");
 System.out.println("2. Must contain at least 2 digits.");
 System.out.println("3. Can only contain letters and digits (no special characters).");
 System.out.println();
 try {
 System.out.print("Enter a password: ");
 String password = sc.nextLine();
 if (isValidPassword(password)) {
 System.out.println("Valid Password");
 } else {
 System.out.println("Invalid Password");
 }
 } catch (Exception e) {
 System.out.println("An error occurred: " + e.getMessage());
 sc.nextLine();
 }
 System.out.print("Do you want to run the program again? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Password Validator!");
 }
}


File Handling –
27. Write a java program to find the largest file in the given directory.
File Name: LargestFileFinder.java
Code:
import java.io.File;
import java.util.Scanner;
public class LargestFileFinder {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain = false;
 System.out.println("==================================");
 System.out.println(" Largest File Finder ");
 System.out.println("==================================");
 System.out.println("This program finds the largest file in a specified directory.");
 System.out.println();
 do {
 System.out.print("Enter directory path: ");
 String path = sc.nextLine();
 File directory = new File(path);
 if (!directory.isDirectory()) {
 System.out.println("Not a valid directory.");
 continue;
 }
 File largestFile = null;
 long largestSize = 0;
 try {
 File[] files = directory.listFiles();
 if (files != null) {
 for (File file : files) {
 if (file.isFile() && file.length() > largestSize) {
 largestSize = file.length();
 largestFile = file;
 }
 }
 } else {
 System.out.println("Error reading files in the directory.");
 continue;
 }
 } catch (SecurityException e) {
 System.out.println("Access denied to the directory: " + e.getMessage());
 continue;
 } catch (NullPointerException e) {
 System.out.println("An unexpected error occurred: " + e.getMessage());
 continue;
 }
 if (largestFile != null) {
 System.out.println("Largest file: " + largestFile.getName() + " (" + largestSize + " bytes)");
 } else {
 System.out.println("No files found.");
 }
 System.out.print("Do you want to find the largest file in another directory? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Largest File Finder!");
 }
}

28. Write a java program to check whether the file given through the command line exists, if it exists, copy
it to another file.
File Name: FileCopy.java
Code:
import java.io.*;
public class FileCopy {
 public static void main(String[] args) {
 if (args.length != 2) {
 System.out.println("Usage: java FileCopy <source> <destination>");
 return;
 }
 File source = new File(args[0]);
 File dest = new File(args[1]);
 if (!source.exists()) {
 System.out.println("Source file does not exist.");
 return;
 }
 try (InputStream in = new FileInputStream(source);
 OutputStream out = new FileOutputStream(dest)) {
 byte[] buffer = new byte[1024];
 int bytesRead;
 while ((bytesRead = in.read(buffer)) != -1) {
 out.write(buffer, 0, bytesRead);
 }
 System.out.println("File copied successfully.");
 } catch (IOException e) {
 System.err.println("Error during file copy: " + e.getMessage());
 }
 }
}

29. Write a java program to read item's information (name, id, price, quantity) in a file item.DAT file
Write a menu driven program to perform following operations using a random-access file.
Search for a specific item by a name.
Display all items and total cost.
Find the costliest item
File Name: RandomAccessFileExample.java
Code:
import java.io.*;
import java.util.*;
class Item {
 String name;
 double price;
 Item(String name, double price) {
 this.name = name;
 this.price = price;
 }
 public String toString() {
 return name + ": $" + price;
 }
}
public class RandomAccessFileExample {
 private static final String FILE_NAME = "items.dat";
 public static void main(String[] args) {
 try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "rw");
 Scanner scanner = new Scanner(System.in)) {
 int choice;
 System.out.println("==================================");
 System.out.println(" Item Management System ");
 System.out.println("==================================");
 System.out.println("1. Search by name");
 System.out.println("2. Display all items");
 System.out.println("3. Find costliest item");
 System.out.println("4. Add item");
 System.out.println("0. Exit");
 do {
System.out.println();
 System.out.print("Enter choice: ");
 choice = scanner.nextInt();
 scanner.nextLine(); // Consume newline
 switch (choice) {
 case 1:
 System.out.print("Enter item name: ");
 searchItem(file, scanner.nextLine());
 break;
 case 2:
 displayAllItems(file);
 break;
 case 3:
 findCostliestItem(file);
 break;
 case 4:
 System.out.print("Enter item name: ");
 String name = scanner.nextLine();
 System.out.print("Enter item price: ");
 double price = scanner.nextDouble();
 addItem(file, new Item(name, price));
 break;
 case 0:
 System.out.println("Exiting...");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } while (choice != 0);
 } catch (IOException e) {
 System.err.println("An error occurred: " + e.getMessage());
 }
 }
 private static void addItem(RandomAccessFile file, Item item) throws IOException {
 file.seek(file.length());
 file.writeUTF(item.name);
 file.writeDouble(item.price);
 System.out.println("Item added: " + item);
 }
 private static void searchItem(RandomAccessFile file, String name) throws IOException {
 file.seek(0);
 while (file.getFilePointer() < file.length()) {
 String itemName = file.readUTF();
 double itemPrice = file.readDouble();
 if (itemName.equalsIgnoreCase(name)) {
 System.out.println("Found: " + new Item(itemName, itemPrice));
 return;
 }
 }
 System.out.println("Item not found.");
 }
 private static void displayAllItems(RandomAccessFile file) throws IOException {
 file.seek(0);
 double totalCost = 0;
 boolean itemsFound = false;
 // Print table header
 System.out.printf("%-20s %-10s%n", "Item Name", "Price");
 System.out.println("-------------------------------");
 while (file.getFilePointer() < file.length()) {
 String itemName = file.readUTF();
 double itemPrice = file.readDouble();
 System.out.printf("%-20s $%-9.2f%n", itemName, itemPrice);
 totalCost += itemPrice;
 itemsFound = true;
 }
 if (itemsFound) {
 System.out.printf("Total cost: $%.2f%n", totalCost);
 } else {
 System.out.println("No items found.");
 }
 }
 private static void findCostliestItem(RandomAccessFile file) throws IOException {
 file.seek(0);
 double maxPrice = 0;
 String maxItem = null;
 while (file.getFilePointer() < file.length()) {
 String itemName = file.readUTF();
 double itemPrice = file.readDouble();
 if (itemPrice > maxPrice) {
 maxPrice = itemPrice;
 maxItem = itemName;
 }
 }
 if (maxItem != null) {
 System.out.println("Costliest item: " + maxItem + " at $" + maxPrice);
 } else {
 System.out.println("No items found.");
 }
 }
}

Collection Class –
30. Write a java program to convert a number into binary format.
File Name: DecToBin.java
Code:
import java.util.Scanner;
public class DecToBin {
 public static String decimalToBinary(int decimalNumber) {
 StringBuilder binaryNumber = new StringBuilder();
 if (decimalNumber == 0) {
 return "0"; // Handle the case for 0 explicitly
 }
 while (decimalNumber > 0) {
 int remainder = decimalNumber % 2;
 binaryNumber.insert(0, remainder); // Prepend the remainder to the binary string
 decimalNumber /= 2;
 }
 return binaryNumber.toString();
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 boolean runAgain = false;
 System.out.println("==================================");
 System.out.println(" Decimal to Binary Converter ");
 System.out.println("==================================");
 System.out.println("This program converts decimal numbers to binary.");
 System.out.println();
 do {
 try {
 System.out.print("Enter a decimal number to convert to binary: ");
 int decimalInput = scanner.nextInt();
 if (decimalInput < 0) {
 System.out.println("Please enter a non-negative integer.");
 continue;
 }
 String binaryOutput = decimalToBinary(decimalInput);
 System.out.println("The binary representation of " + decimalInput + " is: " + binaryOutput);
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer.");
 scanner.next();
 }
 System.out.print("Do you want to convert another number? (yes/no): ");
 String response = scanner.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 scanner.nextLine();
 System.out.println();
 } while (runAgain);
 System.out.println("Thank you for using the Decimal to Binary Converter!");
 scanner.close();
 }
}

31. Write a java program to implement stack and queue data structure using collection classes.
File Name: StackQueueDemo.java
Code:
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class StackQueueDemo {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.println("==================================");
 System.out.println(" Choose Data Structure ");
 System.out.println("==================================");
 System.out.println("1. Stack");
 System.out.println("2. Queue");
 System.out.print("Enter your choice (1 or 2): ");
 int choice = sc.nextInt();
 if (choice == 1) {
 stackOperations(sc);
 } else if (choice == 2) {
 queueOperations(sc);
 } else {
 System.out.println("Invalid choice. Exiting...");
 }
 sc.close();
 }
 // Stack Operations
 public static void stackOperations(Scanner sc) {
 Stack<Integer> stack = new Stack<>();
 int choice = -1;
 System.out.println("==================================");
 System.out.println(" Stack Operations ");
 System.out.println("==================================");
 System.out.println("1. Push elements onto the Stack.");
 System.out.println("2. Pop element from the stack.");
 System.out.println("3. Peek the top element of the stack.");
 System.out.println("4. Check if stack is empty.");
 System.out.println("5. Display the stack.");
 System.out.println("0. Exit stack operation.");
 do {
 System.out.println();
 System.out.print("Enter your choice for stack: ");
 choice = sc.nextInt();
 switch (choice) {
 case 1:
 System.out.print("Enter element to push: ");
 int element = sc.nextInt();
 stack.push(element);
 System.out.println("Element pushed: " + element);
 break;
 case 2:
 if (!stack.isEmpty()) {
 System.out.println("Popped element: " + stack.pop());
 } else {
 System.out.println("Stack is empty.");
 }
 break;
 case 3:
 if (!stack.isEmpty()) {
 System.out.println("Top element: " + stack.peek());
 } else {
 System.out.println("Stack is empty.");
 }
 break;
 case 4:
 System.out.println("Stack is " + (stack.isEmpty() ? "empty." : "not empty."));
 break;
 case 5:
 System.out.println("Stack contents: " + stack);
 break;
 case 0:
 System.out.println("Exiting stack operation.");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } while (choice != 0);
 }
 // Queue Operations
 public static void queueOperations(Scanner sc) {
 Queue<Integer> queue = new LinkedList<>();
 int choice = -1;
 System.out.println("==================================");
 System.out.println(" Queue Operations ");
 System.out.println("==================================");
 System.out.println("1. Enqueue elements into the queue.");
 System.out.println("2. Dequeue element from the queue.");
 System.out.println("3. Peek the front element of the queue.");
 System.out.println("4. Check if queue is empty.");
 System.out.println("5. Display the queue.");
 System.out.println("0. Exit queue operations.");
 do {
 System.out.println();
 System.out.print("Enter your choice for queue: ");
 choice = sc.nextInt();
 switch (choice) {
 case 1:
 System.out.print("Enter element to enqueue: ");
 int queueElement = sc.nextInt();
 queue.offer(queueElement);
 System.out.println("Element enqueued: " + queueElement);
 break;
 case 2:
 if (!queue.isEmpty()) {
 System.out.println("Dequeued element: " + queue.poll());
 } else {
 System.out.println("Queue is empty.");
 }
 break;
 case 3:
 if (!queue.isEmpty()) {
 System.out.println("Front element: " + queue.peek());
 } else {
 System.out.println("Queue is empty.");
 }
 break;
 case 4:
 System.out.println("Queue is " + (queue.isEmpty() ? "empty." : "not empty."));
 break;
 case 5:
 System.out.println("Queue contents: " + queue);
 break;
 case 0:
 System.out.println("Exiting queue operations.");
 break;
 default:
 System.out.println("Invalid choice. Please try again.");
 }
 } while (choice != 0);
 }
}

Multi – Threading –
32. Write a java program to implement multithreading for two threads – fibonacci and factorial..
File Name: MultiThreadDemo.java
Code:
import java.util.Scanner;
class FibonacciThread extends Thread {
 private int count;
 public FibonacciThread(int count) {
 this.count = count;
 }
 @Override
 public void run() {
 System.out.println("Fibonacci series up to " + count + " terms:");
 int a = 0, b = 1;
 for (int i = 1; i <= count; i++) {
 System.out.print(a + " ");
 int next = a + b;
 a = b;
 b = next;
 }
 System.out.println("\nFibonacci thread finished.");
 }
}
class FactorialThread extends Thread {
 private int number;
 public FactorialThread(int number) {
 this.number = number;
 }
 @Override
 public void run() {
 System.out.println("Calculating factorial of " + number);
 long factorial = 1;
 for (int i = 1; i <= number; i++) {
 factorial *= i;
 }
 System.out.println("Factorial of " + number + " is: " + factorial);
 System.out.println("Factorial thread finished.");
 }
}
public class MultiThreadDemo {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain;
 System.out.println("==================================");
 System.out.println(" Multi-Thread Demo ");
 System.out.println("==================================");
 System.out.println("This program calculates Fibonacci series and factorial using threads.");
 System.out.println();
 do {
 int fibonacciTerms = 0;
 int factorialNumber = 0;
 boolean validInput = false;
 while (!validInput) {
 try {
 System.out.print("Enter the number of terms for Fibonacci series: ");
 fibonacciTerms = sc.nextInt();
 if (fibonacciTerms < 0) {
 System.out.println("Please enter a non-negative integer.");
 } else {
 validInput = true;
 }
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer.");
 sc.next();
 }
 }
 validInput = false;
 while (!validInput) {
 try {
 System.out.print("Enter a number to calculate its factorial: ");
 factorialNumber = sc.nextInt();
 if (factorialNumber < 0) {
 System.out.println("Please enter a non-negative integer.");
 } else {
 validInput = true;
 }
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer.");
 sc.next();
 }
 }
 FibonacciThread fibThread = new FibonacciThread(fibonacciTerms);
 FactorialThread factThread = new FactorialThread(factorialNumber);
 fibThread.start();
 factThread.start();
 try {
 fibThread.join();
 factThread.join();
 } catch (InterruptedException e) {
 System.err.println("Thread interrupted: " + e.getMessage());
 }
 System.out.print("Do you want to run the program again? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 System.out.println();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Multi-Thread Demo program!");
 }
}

JDBC (MYSQL, Oracle) –
33. Write a program to connect with the database & insert records using sql.
File Name: DynInsert.java
Code:
Using MySQL
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class DynInsert {
 public static void main(String args[]) {
 String url = "jdbc:mysql://localhost:3306/mydatabase";
 String username = "root";
 String password = "";
 Scanner sc = new Scanner(System.in);
 System.out.println("==================================");
 System.out.println(" Dynamic Record Insertion ");
 System.out.println("==================================");
 System.out.println("This program inserts customer records into the database.");
 System.out.println("Please follow the prompts to enter the details.");
 System.out.println();
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection conn = DriverManager.getConnection(url, username, password);
 System.out.println("Connection established successfully!!!");
 // Create table if it doesn't exist
 String createTableQuery = "CREATE TABLE IF NOT EXISTS customer (" +
 "id INT AUTO_INCREMENT PRIMARY KEY, " +
 "name VARCHAR(100), " +
 "email VARCHAR(100), " +
 "phone BIGINT, " +
 "account_creation_date DATE)";
 Statement stmt = conn.createStatement();
 stmt.executeUpdate(createTableQuery);
 System.out.println("Table 'customer' is ready for use.");
 String query = "INSERT INTO customer(name, email, phone, account_creation_date) VALUES(?, ?, ?,
?)";
 PreparedStatement pstmt = conn.prepareStatement(query);
 System.out.print("How many records do you want to insert? ");
 int recordCount = 0;
 while (true) {
 try {
 recordCount = sc.nextInt();
 if (recordCount <= 0) {
 System.out.println("Please enter a positive integer.");
 } else {
 break;
 }
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer.");
 sc.next();
 }
 }
 sc.nextLine();
 for (int i = 1; i <= recordCount; i++) {
 System.out.println("Enter details for record " + i + ":");
 System.out.print("name: ");
 String name = sc.nextLine();
 System.out.print("email: ");
 String email = sc.nextLine();
 long phone = 0;
 while (true) {
 System.out.print("phone: ");
 try {
 phone = sc.nextLong();
 sc.nextLine();
 break;
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid phone number.");
 sc.next();
 }
 }
 System.out.print("Account creation date (YYYY-MM-DD): ");
 String accountCreationDate = sc.nextLine();
 pstmt.setString(1, name);
 pstmt.setString(2, email);
 pstmt.setLong(3, phone);
 pstmt.setString(4, accountCreationDate);
 pstmt.executeUpdate();
 System.out.println("Record " + i + " inserted successfully!");
 }
 conn.close();
 } catch (ClassNotFoundException e) {
 System.err.println("JDBC Driver not found.");
 e.printStackTrace();
 } catch (SQLException e) {
 System.err.println("SQL ERROR: " + e.getMessage());
 e.printStackTrace();
 } finally {
 sc.close();
 }
 }
}

Using Oracle
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
class DynInsert {
 public static void main(String args[]) {
 String url = "jdbc:oracle:thin:@//localhost:1521/xe";
 String username = "system";
 String password = "mydbms123";
 Scanner sc = new Scanner(System.in);
 System.out.println("==================================");
 System.out.println(" Dynamic Record Insertion ");
 System.out.println("==================================");
 System.out.println("This program inserts customer records into the database.");
 System.out.println("Please follow the prompts to enter the details.");
 System.out.println();
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn = DriverManager.getConnection(url, username, password);
 System.out.println("Connection established successfully!!!");
 String createTableQuery = "CREATE TABLE customer (" +
 "id NUMBER GENERATED BY DEFAULT ON NULL AS IDENTITY PRIMARY
KEY, " +
 "name VARCHAR2(100), " +
 "email VARCHAR2(100), " +
 "phone NUMBER, " +
 "account_creation_date DATE)";
 String checkTableQuery = "SELECT table_name FROM user_tables WHERE table_name =
'CUSTOMER'";
 Statement stmt = conn.createStatement();
 var rs = stmt.executeQuery(checkTableQuery);
 if (!rs.next()) {
 stmt.executeUpdate(createTableQuery);
 System.out.println("Customer table created successfully.");
 } else {
 System.out.println("Customer table already exists.");
 }
 String query = "INSERT INTO customer(name, email, phone, account_creation_date) VALUES(?, ?, ?,
?)";
 PreparedStatement pstmt = conn.prepareStatement(query);
 System.out.print("How many records do you want to insert? ");
 int recordCount = 0;
 while (true) {
 try {
 recordCount = sc.nextInt();
 if (recordCount <= 0) {
 System.out.println("Please enter a positive integer.");
 } else {
 break;
 }
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer.");
 sc.next();
 }
 }
 sc.nextLine();
 for (int i = 1; i <= recordCount; i++) {
 System.out.println("Enter details for record " + i + ":");
 System.out.print("name: ");
 String name = sc.nextLine();
 System.out.print("email: ");
 String email = sc.nextLine();
 long phone = 0;
 while (true) {
 System.out.print("phone: ");
 try {
 phone = sc.nextLong();
 sc.nextLine();
 break;
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid phone number.");
 sc.next();
 }
 }
 System.out.print("Account creation date (DD-MON-YY): ");
 String accountCreationDate = sc.nextLine();
 pstmt.setString(1, name);
 pstmt.setString(2, email);
 pstmt.setLong(3, phone);
 pstmt.setString(4, accountCreationDate);
 pstmt.executeUpdate();
 System.out.println("Record " + i + " inserted successfully!");
 }
 conn.close();
 } catch (ClassNotFoundException e) {
 System.err.println("JDBC Driver not found.");
 e.printStackTrace();
 } catch (SQLException e) {
 System.err.println("SQL ERROR: " + e.getMessage());
 e.printStackTrace();
 } finally {
 sc.close();
 }
 }
}

34. Write a program to connect with the database & fetch records using sql.
File Name: FetchData.java
Code:
Using MySQL
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class FetchData {
 public static void main(String args[]) {
 String url = "jdbc:mysql://localhost:3306/mydatabase";
 String username = "root";
 String password = "";
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection conn = DriverManager.getConnection(url, username, password);
 System.out.println("Connection established successfully!!!");

 String query = "SELECT * FROM customer";
 PreparedStatement pstmt = conn.prepareStatement(query);
 ResultSet rs = pstmt.executeQuery();

 System.out.println("------------------------------------------------------------------------------------");
 System.out.printf("%-5s %-15s %-25s %-15s %-15s%n", "ID", "Name", "Email", "Phone",
"Account_Created");
 System.out.println("------------------------------------------------------------------------------------");

 while (rs.next()) {
 int id = rs.getInt(1);
 String name = rs.getString(2);
 String email = rs.getString(3);
 String phone = rs.getString(4);
 Date acc_created = rs.getDate(5);

 System.out.printf("%-5s %-15s %-25s %-15s %-15s%n", id, name, email, phone, acc_created);
 }

 rs.close();
 pstmt.close();
 conn.close();
 } catch (Exception e) {
 e.printStackTrace();
 }
 }
}

Using Oracle
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class FetchData {
public static void main(String args[]) {
String url = "jdbc:oracle:thin:@//localhost:1521/xe";
String username = "system";
String password = "mydbms123";
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn = DriverManager.getConnection(url, username, password);
System.out.println("Connection established successfully!!!");
String query = "select * from customer";
PreparedStatement pstmt = conn.prepareStatement(query);
ResultSet rs = pstmt.executeQuery();
System.out.println("-----------------------------------------------------------------------------------
-");
System.out.printf("%-5s %-15s %-25s %-15s %-15s%n", "ID", "Name", "Email", "phone",
"Account_Created");
System.out.println("-----------------------------------------------------------------------------------
-");
while(rs.next()) {
int id = rs.getInt(1);
String name = rs.getString(2);
String email = rs.getString(3);
String phone = rs.getString(4);
Date acc_created = rs.getDate(5);
System.out.printf("%-5s %-15s %-25s %-15s %-15s%n", id, name, email, phone,
acc_created);
}
rs.close();
pstmt.close();
conn.close();
} catch(Exception e) {
e.printStackTrace();
}
}
}


35. Write a program to connect with the database & update records using sql.
File Name: UpdateCustomer.java
Code:
Using MySQL
import java.sql.*;
import java.util.Scanner;
public class UpdateCustomer {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain;
 System.out.println("==================================");
 System.out.println(" Update Customer Record ");
 System.out.println("==================================");
 System.out.println("This program updates customer details in the database.");
 System.out.println();
 String url = "jdbc:mysql://localhost:3306/mydatabase";
 String username = "root";
 String password = "";
 do {
 int customerId = 0;
 boolean validInput = false;
 while (!validInput) {
 try {
 System.out.print("Enter Customer ID to update: ");
 customerId = sc.nextInt();
 validInput = true;
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer for Customer ID.");
 sc.next();
 }
 }
 sc.nextLine();
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection conn = DriverManager.getConnection(url, username, password);
 String checkQuery = "SELECT COUNT(*) FROM customer WHERE id = ?";
 PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
 checkStmt.setInt(1, customerId);
 ResultSet rs = checkStmt.executeQuery();

 if (rs.next() && rs.getInt(1) > 0) {
 System.out.print("Enter new Name: ");
 String newName = sc.nextLine();
 System.out.print("Enter new Email: ");
 String newEmail = sc.nextLine();
 long newPhone = 0;
 validInput = false;
 while (!validInput) {
 System.out.print("Enter new Phone Number: ");
 try {
 newPhone = sc.nextLong();
 validInput = true;
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid phone number.");
 sc.next();
 }
 }
 String updateQuery = "UPDATE customer SET name = ?, email = ?, phone = ? WHERE id = ?";
 PreparedStatement stmt = conn.prepareStatement(updateQuery);
 stmt.setString(1, newName);
 stmt.setString(2, newEmail);
 stmt.setLong(3, newPhone);
 stmt.setInt(4, customerId);
 int rowsUpdated = stmt.executeUpdate();
 if (rowsUpdated > 0) {
 System.out.println("Customer record updated successfully!");
 } else {
 System.out.println("No customer found with the given ID.");
 }
 stmt.close();
 } else {
 System.out.println("No customer found with the given ID. Please check and try again.");
 }
 checkStmt.close();
 conn.close();
 } catch (ClassNotFoundException e) {
 System.err.println("JDBC Driver not found.");
 e.printStackTrace();
 } catch (SQLException e) {
 System.err.println("SQL ERROR: " + e.getMessage());
 e.printStackTrace();
 } catch (Exception e) {
 e.printStackTrace();
 }
 System.out.print("Do you want to update another customer record? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Update Customer Record program!");
 }
}

Using Oracle:
import java.sql.*;
import java.util.Scanner;
public class UpdateCustomer {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain;
 // Program heading
 System.out.println("==================================");
 System.out.println(" Update Customer Record ");
 System.out.println("==================================");
 System.out.println("This program updates customer details in the database.");
 System.out.println();
 String url = "jdbc:oracle:thin:@//localhost:1521/xe";
 String username = "system";
 String password = "mydbms123";
 do {
 int customerId = 0;
 boolean validInput = false;
 while (!validInput) {
 try {
 System.out.print("Enter Customer ID to update: ");
 customerId = sc.nextInt();
 validInput = true;
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer for Customer ID.");
 sc.next();
 }
 }
 sc.nextLine();
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn = DriverManager.getConnection(url, username, password);
 String checkQuery = "SELECT COUNT(*) FROM customer WHERE id = ?";
 PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
 checkStmt.setInt(1, customerId);
 ResultSet rs = checkStmt.executeQuery();

 if (rs.next() && rs.getInt(1) > 0) {
 System.out.print("Enter new Name: ");
 String newName = sc.nextLine();
 System.out.print("Enter new Email: ");
 String newEmail = sc.nextLine();
 long newPhone = 0;
 validInput = false;
 while (!validInput) {
 System.out.print("Enter new Phone Number: ");
 try {
 newPhone = sc.nextLong();
 validInput = true; // Exit loop if input is valid
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid phone number.");
 sc.next(); // Clear the invalid input
 }
 }
 String updateQuery = "UPDATE customer SET name = ?, email = ?, phone = ? WHERE id = ?";
 PreparedStatement stmt = conn.prepareStatement(updateQuery);
 stmt.setString(1, newName);
 stmt.setString(2, newEmail);
 stmt.setLong(3, newPhone);
 stmt.setInt(4, customerId);
 int rowsUpdated = stmt.executeUpdate();
 if (rowsUpdated > 0) {
 System.out.println("Customer record updated successfully!");
 } else {
 System.out.println("No customer found with the given ID.");
 }
 stmt.close();
 } else {
 System.out.println("No customer found with the given ID. Please check and try again.");
 }
 checkStmt.close();
 conn.close();
 } catch (ClassNotFoundException e) {
 System.err.println("JDBC Driver not found.");
 e.printStackTrace();
 } catch (SQLException e) {
 System.err.println("SQL ERROR: " + e.getMessage());
 e.printStackTrace();
 } catch (Exception e) {
 e.printStackTrace();
 }
 System.out.print("Do you want to update another customer record? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Update Customer Record program!");
 }
}

36. Write a program to connect with the database & delete records using sql.
File Name: DeleteCustomer.java
Code:
Using MySQL
import java.sql.*;
import java.util.Scanner;
public class DeleteCustomer {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain;
 System.out.println("==================================");
 System.out.println(" Delete Customer Record ");
 System.out.println("==================================");
 System.out.println("This program deletes a customer record from the database.");
 System.out.println();
 String url = "jdbc:mysql://localhost:3306/mydatabase";
 String username = "root";
 String password = "mypassword";
 do {
 int customerId = 0;
 boolean validInput = false;
 while (!validInput) {
 try {
 System.out.print("Enter Customer ID to delete: ");
 customerId = sc.nextInt();
 validInput = true;
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer for Customer ID.");
 sc.next();
 }
 }
 try {
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection conn = DriverManager.getConnection(url, username, password);
 String checkQuery = "SELECT COUNT(*) FROM customer WHERE id = ?";
 PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
 checkStmt.setInt(1, customerId);
 ResultSet rs = checkStmt.executeQuery();
 if (rs.next() && rs.getInt(1) > 0) {
 String deleteQuery = "DELETE FROM customer WHERE id = ?";
 PreparedStatement stmt = conn.prepareStatement(deleteQuery);
 stmt.setInt(1, customerId);
 int rowsDeleted = stmt.executeUpdate();
 if (rowsDeleted > 0) {
 System.out.println("Customer record deleted successfully!");
 } else {
 System.out.println("No customer found with the given ID.");
 }
 stmt.close();
 } else {
 System.out.println("No customer found with the given ID. Please check and try again.");
 }
 checkStmt.close();
 conn.close();
 } catch (ClassNotFoundException e) {
 System.err.println("JDBC Driver not found.");
 e.printStackTrace();
 } catch (SQLException e) {
 System.err.println("SQL ERROR: " + e.getMessage());
 e.printStackTrace();
 } catch (Exception e) {
 e.printStackTrace();
 }
 System.out.println();
 System.out.print("Do you want to delete another customer record? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 System.out.println();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Delete Customer Record program!");
 }
}

Using Oracle
import java.sql.*;
import java.util.Scanner;
public class DeleteCustomer {
 public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
 boolean runAgain;
 System.out.println("==================================");
 System.out.println(" Delete Customer Record ");
 System.out.println("==================================");
 System.out.println("This program deletes a customer record from the database.");
 System.out.println();
 String url = "jdbc:oracle:thin:@//localhost:1521/xe";
 String username = "system";
 String password = "mydbms123";
 do {
 int customerId = 0;
 boolean validInput = false;
 while (!validInput) {
 try {
 System.out.print("Enter Customer ID to delete: ");
 customerId = sc.nextInt();
 validInput = true;
 } catch (Exception e) {
 System.out.println("Invalid input. Please enter a valid integer for Customer ID.");
 sc.next();
 }
 }
 try {
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection conn = DriverManager.getConnection(url, username, password);
 String checkQuery = "SELECT COUNT(*) FROM customer WHERE id = ?";
 PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
 checkStmt.setInt(1, customerId);
 ResultSet rs = checkStmt.executeQuery();
 if (rs.next() && rs.getInt(1) > 0) {
 String deleteQuery = "DELETE FROM customer WHERE id = ?";
 PreparedStatement stmt = conn.prepareStatement(deleteQuery);
 stmt.setInt(1, customerId);
 int rowsDeleted = stmt.executeUpdate();
 if (rowsDeleted > 0) {
 System.out.println("Customer record deleted successfully!");
 } else {
 System.out.println("No customer found with the given ID.");
 }
 stmt.close();
 } else {
 System.out.println("No customer found with the given ID. Please check and try again.");
 }
 checkStmt.close();
 conn.close();
 } catch (ClassNotFoundException e) {
 System.err.println("JDBC Driver not found.");
 e.printStackTrace();
 } catch (SQLException e) {
 System.err.println("SQL ERROR: " + e.getMessage());
 e.printStackTrace();
 } catch (Exception e) {
 e.printStackTrace();
 }
 System.out.println();
 System.out.print("Do you want to delete another customer record? (yes/no): ");
 String response = sc.next().trim().toLowerCase();
 runAgain = response.equals("yes");
 sc.nextLine();
 System.out.println();
 } while (runAgain);
 sc.close();
 System.out.println("Thank you for using the Delete Customer Record program!");
 }
}

37. Write a program to connect to a database and fetch employee details using a stored procedure with an
IN parameter.
File Name: JDBCCallableExample.java
Code:
import java.sql.*;
import java.util.Scanner;
public class JDBCCallableExample {
 public static void main(String[] args) {
 String jdbcURL = "jdbc:mysql://localhost:3306/test";
 String dbUsername = "root";
 String dbPassword = "";
 Scanner scanner = new Scanner(System.in);
 try (Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword)) {
 System.out.println("Connected to the database successfully!");
 boolean continueFetching = true;
 while (continueFetching) {
 try {
 System.out.print("Enter the employee ID to fetch details: ");
 int employeeId = scanner.nextInt();
 String sql = "{CALL GetEmployeeDetails(?)}";
 CallableStatement callableStatement = connection.prepareCall(sql);
 callableStatement.setInt(1, employeeId);
 ResultSet resultSet = callableStatement.executeQuery();
 if (resultSet.next()) {
 int id = resultSet.getInt("id");
 String name = resultSet.getString("name");
 double salary = resultSet.getDouble("salary");
 System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
 } else {
 System.out.println("No employee found with ID: " + employeeId);
 }
 } catch (SQLException e) {
 System.out.println("Error while fetching employee details: " + e.getMessage());
 } catch (Exception e) {
 System.out.println("Invalid input: " + e.getMessage());
 scanner.nextLine();
 }
 System.out.print("Do you want to fetch another employee's details? (yes/no): ");
 String userResponse = scanner.next();
 continueFetching = userResponse.equalsIgnoreCase("yes");
 }
 } catch (SQLException e) {
 System.out.println("Database connection error: " + e.getMessage());
 } finally {
 scanner.close();
 System.out.println("Program terminated.");
 }
 }
}

38. Write a program to connect to a database and update the salary of an employee using a stored
procedure with an IN-OUT parameter.
File Name: JDBCCallableExample.java
Code:
import java.sql.*;
import java.util.Scanner;
public class JDBCCallableExample {
 public static void main(String[] args) {
 String jdbcURL = "jdbc:mysql://localhost:3306/test";
 String dbUsername = "root";
 String dbPassword = "";
 Scanner scanner = new Scanner(System.in);
 try (Connection connection = DriverManager.getConnection(jdbcURL, dbUsername, dbPassword)) {
 System.out.println("Connected to the database successfully!");
 boolean continueUpdating = true;
 while (continueUpdating) {
 try {
 System.out.print("Enter the employee ID: ");
 int employeeId = scanner.nextInt();
 System.out.print("Enter the new salary: ");
 double newSalary = scanner.nextDouble();
 String sql = "{CALL UpdateEmployeeSalary(?, ?)}";
 CallableStatement callableStatement = connection.prepareCall(sql);
 callableStatement.setInt(1, employeeId);
 callableStatement.setDouble(2, newSalary);
 callableStatement.registerOutParameter(2, Types.DOUBLE);
 callableStatement.execute();
 double updatedSalary = callableStatement.getDouble(2);
 if (callableStatement.wasNull()) {
 System.out.println("No employee found with ID: " + employeeId);
 } else {
 System.out.println("Updated salary for employee ID " + employeeId + ": " + updatedSalary);
 }
 } catch (SQLException e) {
 System.out.println("Error while updating employee details: " + e.getMessage());
 } catch (Exception e) {
 System.out.println("Invalid input: " + e.getMessage());
 scanner.nextLine();
 }
 System.out.print("Do you want to update another employee's salary? (yes/no): ");
 String userResponse = scanner.next();
 continueUpdating = userResponse.equalsIgnoreCase("yes");
 }
 } catch (SQLException e) {
 System.out.println("Database connection error: " + e.getMessage());
 } finally {
 scanner.close();
 System.out.println("Program terminated.");
 }
 }
}

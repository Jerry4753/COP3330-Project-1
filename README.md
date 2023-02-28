**COP3330-Project-1**

**Project 1 statement**
This project involves implementing a simple university personnel management program. The program stores relevant 
information such as university ID, name, etc. Different information is stored depending on the type of the person (Student 
Faculty or Staff). For example, a student has a GPA, a faculty has a title and department (professor, mathematics), and a 
staff has a department where the staff works.
For a student, we need a:
- full name 
- id
- gpa
- Number of credit hours currently taken
For a faculty, we need a:
- full name
- id
- department (mathematics, engineering or english)
- Rank (professor or adjunct)
For a staff, we need a:
- full name
- id
- department (mathematics, engineering or english)
- status (part time or full time)
Students in this university pay $236.45 per credit hour in addition to a $52 administrative fee. Your code should generate a 
tuition invoice ( a method within the main class). Note that students get a 15% off total payment if their gpa is greater or 
equal to 3.85.
Test your code with one faculty, two students and one staff member. The sample run below should give you a clear idea 
about how your code should run. The user’s entry in marked in bold so you can tell what your code should display to the 
screen and what the user enters.
Please note well that:
1) Your code should run exactly as shown on the sample run below (However, the TA will not deduct points because you 
skipped two lines instead of three or your tuition invoice has 56 hyphens instead of 63! ).
2) When asked to enter the enter the faulty department, matheMatics and MathematiCs are considered to be the same, 
and your program should display mathematics if faculty information is to be displayed to the screen. However, if the 
user enters Mathematics department, then this is an invalid entry. There are three departments: Mathematics, 
Engineering and Sciences.
3) The university ID has no required form so you may choose to enter anything to be the ID.
Your project should demonstrate the use of Methods. Consequently, we expect that your code looks like:
public class Project1 {
public static void main(String[] args){
//Test code goes here
}

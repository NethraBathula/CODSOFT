import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of Subjects:");
    int noofsubjects=sc.nextInt();
    int [] marks=new int[noofsubjects];
    int totalmarks=0;
    for(int i=0;i<noofsubjects;i++){
        System.out.print("Enter marks for subject"+(i+1)+":");
        marks[i]=sc.nextInt();
        totalmarks+=marks[i];
    }
    double AveragePercentage=(double)totalmarks/noofsubjects;
    char grade;
    if(AveragePercentage>=90){
        grade='A';
    }
    else if(AveragePercentage>=80){
        grade='B';
    }
    else if(AveragePercentage>=70){
        grade='C';
    }
    else if(AveragePercentage>=60){
        grade='D';
    }
    else{
        grade='F';
    }
System.out.println("TotalMarks:"+totalmarks);
System.out.println("Average percentage:"+AveragePercentage+"%");
System.out.println("Grade:"+grade);
sc.close();

}
}

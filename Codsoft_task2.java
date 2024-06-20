package StudentGradeCalculator;
import java.util.*;
public class Codsoft_task2 {
    public static String CalculateGrade(double averagepercentage){
        if(averagepercentage>=90){
            return "A+";
        } else if (averagepercentage>=80) {
            return "A";
        } else if (averagepercentage>=70) {
            return "B+";
        } else if (averagepercentage>=60) {
            return "B";
        } else if (averagepercentage>=50) {
            return "C+";
        } else if (averagepercentage>=40) {
            return "C";
        }else {
            return "F";
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects:");
        int totalsubjects=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=totalsubjects;i++){
            System.out.print("Enter Number of marks obtained in"+i+" :");
            int marks=sc.nextInt();
            totalmarks+=marks;
        }
        double averagepercentage=(double)totalmarks/totalsubjects;
        System.out.println("Total marks obtained by the student:"+totalmarks);
        System.out.println("Average percentage obtainfe by Student:"+averagepercentage);
        String grade =CalculateGrade(averagepercentage);
        System.out.println("Grade"+grade);


    }
}

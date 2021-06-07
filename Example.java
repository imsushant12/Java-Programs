package firstPackage;

import secondPackage.Student;

public class Example 
{
    public static void main(String[] args) 
    {
        Student s = new Student();

        s.setName("Sushant Gaurav");
        s.setRoll(125);    

        System.out.println("Imported Data:");
        System.out.println("NAME : " + s.getName());
        System.out.println("ROLL No :" + s.getRoll());
    }
}

package oops.ClassNObject;

public class Student {
    int rollno ;
    String Name;
    String Address;
    double Percentage;
    public void print() {
        System.out.print(rollno);
        System.out.println(Name);
        System.out.println(Address);
        System.out.println(Percentage);
    }
    public static void main() {
            for (int i = 1; i <= 10; i++) {
                Student s = new Student();
                s.rollno = i;
                s.Name = "  shruti  " + i;
                s.Address = "  Nagpur ";
                s.Percentage = 85 + i;
                s.print();

                GradeSystem gs = new GradeSystem();
                char grade = gs.findGrade(s);
            }
    }
    public static class GradeSystem{
        public char findGrade(Student std){
            if(std.Percentage > 90){
                return 'A';
            } else if (std.Percentage>80) {
                return 'B';
            }
            return 'C';
        }
    }


}

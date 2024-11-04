class Student{
    int rollno;
    String name;
    int marks;
}

class AObjects
{
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.rollno = 1;
            s1.name ="Jack";
            s1.marks = 87;

            Student s2 = new Student();
            s2.rollno = 2;
            s2.name ="Rookie";
            s2.marks = 79;

            Student s3 = new Student();
            s3.rollno = 3;
            s3.name ="Kavin";
            s3.marks = 97;

            Student students[] =new Student[3];
            students[0]= s1;
            students[1]= s2;
            students[2]= s3;

            for(Student stu:students)
            {
                System.out.println(stu.rollno + " " + stu.name + " " + stu.marks);
            }
        }
}

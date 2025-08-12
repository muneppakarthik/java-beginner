class ArrayObjects{
    public static void main(String args[]){
        Students studentObj = new Students();

        studentObj.rollno = 1;
        studentObj.name = "Karthik";
        studentObj.marks = 85;

        Students studentObj1 = new Students();

        studentObj1.rollno = 2;
        studentObj1.name = "Thanush";
        studentObj1.marks = 100;

        // Create new array in students
        Students students[] = new Students[2];

        students[0] = studentObj;
        students[1] = studentObj1;

        // System.out.println(students[1].name);

        // for(int i=0; i<students.length; i++){
        //     System.out.println(students[i].name + " " + students[i].marks);
        // }

        for(Students n : students){
            System.out.println(n.name + " : " + n.marks);
        }
    };
};

class Students{
    int rollno;
    String name;
    int marks;
}
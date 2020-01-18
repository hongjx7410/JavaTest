package my;

public class Hello {
    public static void main(String[] args)
    {
        Student stu = new Student();
        stu.id = 20180001;
        stu.name = "邵发";
        stu.cellphone = "13810012345";
        // 打印学生信息
        System.out.println(stu.id+" "+stu.name+" "+stu.cellphone);

    }
}

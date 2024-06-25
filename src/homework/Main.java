package homework;


public class Main{
    public static void main(String[] args){
        Teacher s1  = new Teacher(666, "Мария", "Петрова");
        Teacher teacher = s1;
        teacher.report();
        teacher.update();
    }
}

package homework;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(Integer teacherId, String name, String lastName){
        super(name, lastName);
        this.teacherId=teacherId;
            
    }
    public Integer getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
    
          
    public void update(){
        System.out.println("Update teacher: "  + "id " + getTeacherId() + ","  + " name" + " " + getName() + "," + " " +   "lastname" + " " + getLastname());
    }
    
}   

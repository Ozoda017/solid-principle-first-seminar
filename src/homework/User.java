package homework;

public class User{
    private String name;
    private String lastname;

    public User(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public void setname(String name) {
		this.name = name;
	}
    public void setlastname(String lastname) {
		this.lastname = lastname;
	}
    

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public void update(){
        Teacher teacher = new Teacher(null, name, lastname);
        teacher.update();
    }

    public void report(){
        System.out.println("Report for user: "  + name);
    }
} 

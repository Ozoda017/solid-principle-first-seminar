public class Main {
    public Main() {
    }
     public static void main(String[] args) {
       User user = new User("John");
       Saveable saveable = new Persister(user);
       saveable.save();
       Reportable reportable = new ReportUser(user);
       reportable.report();
    }
 }

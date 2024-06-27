
public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(SaveInterface saveInterface){
        saveInterface.save(this);
    }
    

    public void report(ReportInterface reportInterface){
        reportInterface.report(this);
    }
}

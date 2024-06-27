
public class Persister implements SaveInterface {

    
    public void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}

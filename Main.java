// import Persister;
public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        user.report(new Report());
        user.save(new Persister());//new Persister());
    }
}
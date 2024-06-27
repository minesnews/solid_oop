public class Report implements ReportInterface {
    public void report(User user){
        System.out.println("Report for user: " + user.getName());
    }
}

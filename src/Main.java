import Model.Bug;
import Model.BugReporter;
import Model.User;
import Model.computer.*;

public class Main {

    public static void main(String[] args){

    BugReporter bugReporter = new BugReporter("b@test.com", "Bartek", "Test");
    Bug bug = new Bug("Internet conecction is not working", bugReporter, 5);

        System.out.println(bug);
        bug.setBugStatus(true);






    }


}
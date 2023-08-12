package Model;

public class Bug implements ConsoleNotification {

    private String bugDescription;
    private int bugPriority;
    private boolean bugStatus;

    private BugReporter bugReporter;

    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority) {
        this.bugDescription = bugDescription;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
        this.bugReporter = bugReporter;
    }

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        this.bugDescription = bugDescription;
    }



    @Override
    public void notifyStatusChange() {
        System.out.println("Bug status has changed");
    }


    public int getBugPriority() {
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default: {
                System.out.println("Incorrect bug priorityity range");
            }
        }
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    public boolean isBugStatus() {
        return bugStatus;
    }

    public void setBugStatus(boolean bugStatus) {
    notifyStatusChange();
        this.bugStatus = bugStatus;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugPriority=" + bugPriority +
                ", bugStatus=" + bugStatus +
                ", bugReporter=" + bugReporter +
                '}';
    }
}




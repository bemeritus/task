public class Sync {
    public static void main(String[] args) {
        System.out.println("Starting tasks...");


        performTask("Loading data");
        performTask("Processing data");
        performTask("Saving data");

        System.out.println("All tasks completed!");
    }

    public static void performTask(String taskName) {
        System.out.println(taskName + " started...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " finished!");
    }
}

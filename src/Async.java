public class Async {
    public static void main(String[] args) {
        System.out.println("Starting tasks...");


        Thread task1 = new Thread(() -> performTask("Loading data"));
        Thread task2 = new Thread(() -> performTask("Processing data"));
        Thread task3 = new Thread(() -> performTask("Saving data"));

        task1.start();
        task2.start();
        task3.start();

        System.out.println("Tasks started, waiting for completion...");
    }

    public static void performTask(String taskName) {
        System.out.println(taskName + " started...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(taskName + " finished!");
    }
}

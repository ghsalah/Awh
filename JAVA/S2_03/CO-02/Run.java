class MessageThread extends Thread {
    private String message; // The message to display
    private int interval;   // The interval in milliseconds between displays

    // Constructor to initialize the message and interval
    public MessageThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    // The run method contains the code that the thread will execute
    public void run() {
        while (true) {
            System.out.println(message);
            // Sleep for the specified interval
            // We propagate the InterruptedException to the caller of the run method
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                // Exit the loop if the thread is interrupted
                return;
            }
        }
    }

    public static void main(String[] args) {
        // Create three threads with different messages and intervals
        MessageThread thread1 = new MessageThread("Good Morning", 1000);
        MessageThread thread2 = new MessageThread("Hello", 2000);
        MessageThread thread3 = new MessageThread("Welcome", 3000);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

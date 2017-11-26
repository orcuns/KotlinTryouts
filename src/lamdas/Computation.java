package lamdas;


import java.time.LocalDateTime;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by orcun on 11/19/2017.
 */
public class Computation {

    public void postponeComputation(int delay, Runnable computation) {
        System.out.println("delay started");
        new ScheduledThreadPoolExecutor(1).schedule(computation, delay, TimeUnit.MILLISECONDS);
    }


    public void startThreadSameTime(Runnable r1, Runnable r2, final LocalDateTime StartTime) {
        final CyclicBarrier gate = new CyclicBarrier(3);

        Thread t1 = new Thread(() -> {
            try {
                gate.await();
                r1.run();

                //do stuff

                LocalDateTime endTime = LocalDateTime.now();
                System.out.println(" JAVA:inline:CODE startTime " + StartTime);
                System.out.println(" JAVA:inline:CODE endTime " + endTime);
                int interval = endTime.getNano() - StartTime.getNano();
                System.out.println(" JAVA:inline:CODE interval " + interval);

            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                gate.await();
                r2.run();

                //do stuff

                LocalDateTime endTime = LocalDateTime.now();
                System.out.println(" JAVA::CODE startTime " + StartTime);
                System.out.println(" JAVA::CODE endTime " + endTime);
                int interval = endTime.getNano() - StartTime.getNano();
                System.out.println(" JAVA::CODE interval " + interval);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
    // At this point, t1 and t2 are blocking on the gate.
    // Since we gave "3" as the argument, gate is not opened yet.
    // Now if we block on the gate from the main thread, it will open
    // and all threads will start to do stuff!

        try {
            gate.await();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("all threads started");

    }

}

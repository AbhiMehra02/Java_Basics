
/*
    Threads States:

    NEW--start()--> RUNNABLE <--notify()-------  WAITING
                    |        |                      |
                    |    run()                      |          
                    |        |               sleep(),wait()      
                    |    RUNNING------>-------------|
                    |        |
                    |        |---stop()->---DEAD
                    |------------>-----------|
*/


class Counter
{
    int count ;
    // sychronized : one thread work on at a time
    public synchronized void increment()
    {
        count++;
    }
}


class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c =new Counter();

        Runnable obj1 = ()->
        {
            for(int i=1;i<=10000;i++){
                c.increment();
            }
        };

        Runnable obj2 = ()->
        {
            for(int i=1;i<=10000;i++){
                c.increment();
            }
        };

        Thread t1 =new Thread(obj1);
        Thread t2 =new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
    }

}

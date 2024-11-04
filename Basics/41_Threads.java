// every thread need to have run method

class A extends Thread
{
    public void run()   // rename show to run
    {
        for(int i=1;i<=50;i++){
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread
{
    public void run() // rename show to run
    {
        for(int i=1;i<=100;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}





class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // obj1.show();
        // obj2.show();

        // Time Schedular
        // obj1.start();
        // obj2.start();

        // Thread priority
        // range of priority [1,10]  1:least , 5:default , 10:highest
        // System.out.println(obj1.getPriority());

        //set priority
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        obj2.start();
    

    }   
}

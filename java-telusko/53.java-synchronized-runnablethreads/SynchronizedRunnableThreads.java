class SynchronizedRunnableThreads{
    public static void main(String args[]) throws Exception{
        Counter c = new Counter();
        Runnable obj1 = new A(c);
        Runnable obj2 = new B(c);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // join() method will wait for complete each threads, but it will not give 100% accuracy
        t1.join();
        t2.join();

        // main method asking to waitng to print c.count because it's dependency right once t1 and t2 completed
        // then only will get exact result so join method will here

        System.out.println("Final Count: " + c.count);
    };
};

class Counter{
    // synchronized this keyword will make waiting quee to execute one by one
    int count;
    public synchronized void increment(){
        count++;
    };
};

class A implements Runnable{
    Counter c;
    public A(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i = 0; i<1000; i++){
            c.increment();
        }
    };
};

class B implements Runnable{
    Counter c;
    public B(Counter c){
        this.c = c;
    }
    public void run(){
        for(int i = 0; i<1000; i++){
            c.increment();
        }
    };
};
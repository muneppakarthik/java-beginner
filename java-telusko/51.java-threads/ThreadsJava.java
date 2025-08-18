// class ThereadsJava{
//     public static void main(String args[]){
//         A obj1 = new A();
//         B obj2 = new B();

//         obj1.show();
//         obj2.show();
//     };
// };

// class A extends Thread{
//     public void show(){
//         for(int i = 0; i<6; i++){
//             System.out.println("In a show");
//         }
//     };
// };

// class B extends Thread{
//     public void show(){
//         for(int i = 0; i<6; i++){
//             System.out.println("In b show");
//         }
//     };
// };

//  to achieve to threads
// we have to create method called run and we have trigger it as start()
// then java stat creating multiple threads
// theads mean it will create code execution paralally all, without waiting for to complete something.

class ThereadsJava{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        // obj2.setPriority(Thread.MAX_PRIORITY); // GIVING PRIORITY TO COMPLETE FIRST -> 0 to 10
        
        obj1.start();
        obj2.start();
    };
};

class A extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("In a show");
            // waiting code execution stop for sometime
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    };
};

class B extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("In b show");
            // waiting code execution stop for sometime// making execution stop for sometime
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    };
};
class FunctionalInterface{
    public static void main(String args[]){
        A obj = new A(){
            public void show(){
                System.out.println("in A");
            }
        };

        obj.show();
    }
}

interface A{
    void show(); 
    // interface which is having only one method, Will call it as functionl interface.
    // same like aboue, Which interface is having two or more than that, will call it as normal interface
};
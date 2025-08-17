class ThrowsExceptions{
    public static void main(String args[]){
        A obj = new A();
        try{
            obj.show();
        }catch(Exception e){
            System.out.println(e);
        }
    }
};


class A{
    // public void show(){
    //     Boolean a = true;
    //     try{
    //         if(a==true) throw new Exception("Error triggered.");
    //     }catch(Exception e){
    //         System.out.println(e);
    //     };
    // };

    public void show() throws Exception{
        Boolean a = true;
        if(a==true) throw new Exception("Error triggered.");
        else
            System.out.println("In show.");
    };
}
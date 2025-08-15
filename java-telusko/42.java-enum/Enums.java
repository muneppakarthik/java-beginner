class Enums{
    public static void main(String args[]){
        Status s = Status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal());

        System.out.println();

        Status[] ss = Status.values();

        for(Status staus : ss){
            System.out.println(staus + " : " + staus.ordinal());
        };

        System.out.println();

        // if and switch with enum
        if(s == Status.Failed)
            System.out.println("Failed");
        else if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Pending)
            System.out.println("Please wait");
        else 
            System.out.println("Done");

        System.out.println();

        switch(s){
            case Failed-> System.out.println("Failed");
            case Running-> System.out.println("All Good");
            case Pending-> System.out.println("Please wait");
            default-> System.out.println("Done");
        }
    };

};

enum Status{ 
    // enum is class, is used for creating a constants values
    Running, Failed, Pending, Success;
};
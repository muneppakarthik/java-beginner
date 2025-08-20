// class GenericsJava{
//     public static void main(String args[]){
//         BoxString stringBox = new BoxString();

//         stringBox.set("Karthik");
//         System.out.println(stringBox.get());

//         BoxInt intBox = new BoxInt();

//         intBox.set(40);
//         System.out.println(intBox.get());
//     };
// };

// class BoxString{
//     String value;

//     void set(String value){
//         this.value = value;
//     };

//     String get(){
//         return value;
//     }
// }

// class BoxInt{
//     int value;

//     void set(int value){
//         this.value = value;
//     };

//     int get(){
//         return value;
//     }
// }

class GenericsJava{
    public static void main(String args[]){
        Box<String> stringBox = new Box<>();

        stringBox.set("Karthik");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();

        intBox.set(40);
        System.out.println(intBox.get());
    };
};

class Box<T>{
    T value;

    void set(T value){
        this.value = value;
    };

    T get(){
        return value;
    }
}
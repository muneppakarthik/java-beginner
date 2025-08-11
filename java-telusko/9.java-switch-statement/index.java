class SwitcheStatement{
    public static void main(String args[]){
        int x = 4;

        // if(x==1)
        //     System.out.println("Monday");
        // else if(x==2)
        //     System.out.println("Tuesday");
        // else if(x==3)
        //     System.out.println("WednesDay");
        // else if(x==4)
        //     System.out.println("Thursday");
        // else if(x==5)
        //     System.out.println("Friday");
        // else if(x==6)
        //     System.out.println("Saturday");
        // else
        //     System.out.println("Sunday");
        String result = "";

        // switch(x){
        //     case 1, 9:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("WednesDay");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Sunday");
        // };

        // remove break variant
        // switch(x){
        //     case 1, 9 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("WednesDay");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     default -> System.out.println("Sunday");
        // };

        // // return variant
        // result = switch(x){
        //     case 1, 9 -> "Monday";
        //     case 2 -> "Tuesday";
        //     case 3 -> "WednesDay";
        //     case 4 -> "Thursday";
        //     case 5 -> "Friday";
        //     case 6 -> "Saturday";
        //     default -> "Sunday";
        // };

        // yield variant
        result = switch(x){
            case 1, 9: yield "Monday";
            case 2: yield "Tuesday";
            case 3: yield "WednesDay";
            case 4: yield "Thursday";
            case 5: yield "Friday";
            case 6: yield "Saturday";
            default: yield "Sunday";
        };

        System.out.println(result);
    };
};
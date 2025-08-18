import java.util.Map;
import java.util.HashMap;

class MapCollection{
    public static void main(String args[]){
        Map<String, Integer> students = new HashMap<>(); 

        students.put("karthik", 10);
        students.put("suresh", 100);
        students.put("sankar", 1000);
        students.put("thanush", 10000);

        // System.out.println(students.get("sankar"));
        for(String key : students.keySet()){
            System.out.println(key + " : " + students.get(key));
        }
    };
};
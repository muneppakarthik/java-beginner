import java.util.HashMap;

class MapHashMap{
    public static void main(String args[]){
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Australia", "Weign");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // System.out.println(capitalCities);
        // System.out.println(capitalCities.get("India"));
        // capitalCities.remove("USA");
        // System.out.println(capitalCities);
        // System.out.println(capitalCities.get("dummy")); // null will get
        // System.out.println(capitalCities.size()); // 5
        // capitalCities.clear();
        // System.out.println(capitalCities); // empty object {}

        // for(String capitals : capitalCities.values()){
        //     System.out.println(capitals);
        // }

        for(String capitals : capitalCities.keySet()){
            System.out.println("Key: " + capitals + " Values: " + capitalCities.get(capitals));
        }
    }
}
import java.util.LinkedHashMap;

class MapLinkedHashMap{
    public static void main(String args[]){
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Australia", "Weign");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}
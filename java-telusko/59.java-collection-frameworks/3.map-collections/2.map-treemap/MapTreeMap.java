import java.util.TreeMap;

class MapTreeMap{
    public static void main(String args[]){
        TreeMap<String, String> capitalCities = new TreeMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Australia", "Weign");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
    }
}
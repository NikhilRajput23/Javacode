import java.util.*;
public class HashMap1 {
   public static void main(String[] args) {
HashMap<String, Integer> map=new HashMap<>();
//map add fuction
map.put("India",900);
map.put("indonisia",880);
map.put("china",133);
System.out.println(map);
// add update key then previous was update 
map.put("china",567);
System.out.println(map);

// use contains key to serch map elemnt
if(map.containsKey("Indiao")){
   System.out.println("map is available");
}else{
   System.out.println("does not exist");
}

System.out.println(map.get("India"));
System.out.println(map.get("indonisia"));

//entrty  of loop use hashmap
for(Map.Entry<String,Integer>e: map.entrySet()){
  System.out.println(e.getKey());
  System.out.println(e.getValue());

}
Set<String> keys=map.keySet();
for(String key:keys){
   System.out.println(key+" "+map.get(key));
}
map.remove("indonisia");
System.out.println(map);


   } 
}

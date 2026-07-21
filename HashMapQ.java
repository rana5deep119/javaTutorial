import java.util.HashMap;

public class HashMapQ{
    static void countFreq(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        // for(int ele:arr){
        //     map.put(ele,map.getOrDefault(ele,0)+1);
        // }
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 10, 5, 20,5,6,3,6,6,20};
        countFreq(arr);
    }
}
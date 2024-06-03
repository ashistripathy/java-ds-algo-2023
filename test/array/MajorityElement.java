package test.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String ... args){
        int [] a = {2,3,4,5,3,3,2,3,3,7};
        System.out.println(majorityElement(a,a.length));
    }
    static int majorityElement(int [] a, int size){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : a){
            Integer val = map.get(i);
            if(val == null){
                map.put(i,1);
            }else{
                map.put(i,val+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > size/2){
                return entry.getKey();
            }

        }
        return -1;
    }
}

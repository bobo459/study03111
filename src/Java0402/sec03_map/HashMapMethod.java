package Java0402.sec03_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapMethod {
    public static void main(String[] args) {
        Map<Integer, String> hMap1 =  new HashMap<Integer, String>();

        //#1. put (K key, V value)
        hMap1.put(2, "나다라");
        hMap1.put(1, "가나다");
        hMap1.put(3, "다라마");
        System.out.println(hMap1.toString()); //{1=가나다, 2=나다라, 3=다라마}  // 순서 상관없음.

        //#2. putAll(다른 맵객체)
        Map<Integer, String> hMap2 = new HashMap<Integer, String>();
        hMap2.putAll(hMap1);
        System.out.println(hMap2.toString()); //{1=가나다, 2=나다라, 3=다라마}

        //#3. replace(K key, V value) //replace는 2종류가 있다
        hMap2.replace(1, "가가가");
        hMap2.replace(4, "라라라"); //동작안함 - put이 아니라 replace여서 넣을 곳이 없어서 동작안함.
        System.out.println(hMap2.toString()); //{1=가가가, 2=나다라, 3=다라마}

        //#4. replace(K key, V oldValue, V newValue)
        hMap2.replace(1, "가가가", "나나나"); //1이면서 가가가 일 경우에만 나나나 로 변경한다. 2중 확인하는 행위
        hMap2.replace(2, "다다다", "라라라"); //동작안함 -2중 확인하는데 둘중 하나라도 달라서 동작안함.
        System.out.println(hMap2.toString()); //{1=나나나, 2=나다라, 3=다라마}

        //#5. V get(Object key)
        System.out.println(hMap2.get(1)); //나나나
        System.out.println(hMap2.get(2)); //나다라
        System.out.println(hMap2.get(3)); //다라마

        //#6. containsKey(Object key)
        System.out.println(hMap2.containsKey(1)); //true
        System.out.println(hMap2.containsKey(5)); //false

        //#7. containsValue(Object value)
        System.out.println(hMap2.containsValue("나나나")); //true
        System.out.println(hMap2.containsValue("다다다")); //false

        //#8. Set<K> keySet()
        Set<Integer> keySet = hMap2.keySet();
        System.out.println(keySet.toString()); //[1, 2, 3]

        //#9. Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<Integer,String>> entrySet = hMap2.entrySet();
        System.out.println(entrySet.toString()); //[1=나나나, 2=나다라, 3=다라마]

        //#10. size();
        System.out.println(hMap2.size()); //3

        //#11. remove(Object key)
        hMap2.remove(1);
        hMap2.remove(4); //동작안함
        System.out.println(hMap2.toString()); //{2=나다라, 3=다라마}

        //#12. remove(Object key, Object value)
        hMap2.remove(2, "나다라");
        hMap2.remove(3, "다다다"); //동작안함
        System.out.println(hMap2.toString()); //{3=다라마}

        //#13. clear()
        hMap2.clear();
        System.out.println(hMap2.toString()); //{}
    }
}

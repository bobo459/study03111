package Java0402.sec01_list.EX01_HashSetMethod;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetMethod {
    public static void main(String[] args) {  //특징, 존재 하느냐? 안하냐?, 보자기 안에 있어?없어? 가 중요한다.

        Set<String> hSet1 = new HashSet<>();

        //#1. add(E element)
        hSet1.add("가");
        hSet1.add("나");
        hSet1.add("가");
        System.out.println(hSet1.toString()); //[가 나] -중복을 허용안해서 가,나 만 나온것

        //#2. addAll(다른 set 객체)
        Set<String> hSet2 = new HashSet<>();
        hSet2.add("나");
        hSet2.add("다");
        hSet2.addAll(hSet1);
        System.out.println(hSet2.toString()); //[가, 다, 나]- 중복은 안되고 순서는 상관없어서 어떻게 나올진 모른다.

        //#3. remove(Object o)
        hSet2.remove("나");
        System.out.println(hSet2.toString()); //[가, 다]

        //#4. clear()
        hSet2.clear();
        System.out.println(hSet2.toString()); //[]

        //#5. isEmpty();
        System.out.println(hSet2.isEmpty()); //true

        //#6. contains (Object o)
        Set<String> hSet3 = new HashSet<>();
        hSet3.add("가");
        hSet3.add("나");
        hSet3.add("다");
        System.out.println(hSet3.contains("나")); //true   / contains 박스 안에 있는지? 있으면 true 로 나와준다.
        System.out.println(hSet3.contains("라")); //false

        //#7. size()
        System.out.println(hSet3.size()); //3

        //#8. iterator() - 이터레이터 : 인덱스가 없으니까 보자기 안에서 하나하나 꺼내 볼려면 for문을 사용못해서 interator를 사용하여 찾아본다.
        Iterator<String> iterator = hSet3.iterator();
        while(iterator.hasNext()) { //총 3바퀴    / hasNext :꺼낼게 있니? 라고 물어보는것. 들어있으면 next 꺼낸다. 하나하나씩 꺼내서 확인해준다.
            System.out.println(iterator.next());
        }
        //일반적인 for는 set가 인덱스가 없으므로 사용할 수 없지만 아래 방식으로는 가능함!
        for (String str : hSet3){
            System.out.println("forEach : "+str); //포이치 형태의 포문
        }

        //#9. toArray()
        Object[] objArray = hSet3.toArray();
        System.out.println(Arrays.toString(objArray));  //[가, 다, 나]

        //#10-1. toArray(T[] t)
        String[] strArray1 = hSet3.toArray(new String[0]);  // new String -Array로 받는다는 뜻
        System.out.println(Arrays.toString(strArray1)); //[가, 다, 나]

        //#10-2. toArray(T[] t)
        String[] strArray2 = hSet3.toArray(new String[5]);
        System.out.println(Arrays.toString(strArray2)); //[가, 다, 나, null, null]

    }
}

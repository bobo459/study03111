package Java0401Generic;
//593,594p

//제네릭타입을 2개를 사용한것
class KeyValue<K,V> {  //k,v를 사용한건 key,value의 약자를 주로 사용하는 거지 필수는 아님 a,b 사용해도 무관
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

    public class Main2 {
        public static void main(String[] args) {

            KeyValue<String, Integer> kv1 = new KeyValue<>();
            kv1.setKey("사과");
            kv1.setValue(1000);
            System.out.println(kv1.getKey() + " : " + kv1.getValue());


            //두번째 제네릭을 사용하지 않더라도 Void타입을 지정해줘야함. 꼭 V는 대문자사용하는 클래스를 써야한다.
/*            KeyValue<String> Kv3 = new KeyValue<>(); //하나만 쓰고 싶어도 하나의 String을 넣기만 하면 문법적으로 안맞아서 오류*/
            KeyValue<String, Void> kv3 = new KeyValue<>(); //void는 하나의 공백정도인것같다.
            kv3.setKey("키 값만 사용");
            System.out.println("key : "+ kv3.getKey());
        }
    }




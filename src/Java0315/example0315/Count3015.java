package Java0315.example0315;

public class Count3015 {
        public static void main(String[] args) {

            // 아래 문자열의 모음과 자음의 갯수를 각각 count 하시오
            // 모음은 a e i o u
            // 스페이스는 문자 아님
/*            String str = "This is a really simple sentence";  //모음 10개 자음 17게

            str = str.replaceAll(" ","");

            char[] a =new char[]{'a','e','i','o','u'};


            for (int i=0 ; i<a.length; i++) {
                if (a  )


            }
            System.out.println();*/

            //답안지
            String str = "This is a really simple sentence";  //모음 10개 자음 17게
            int vCount = 0, cCount = 0;

            str = str.toLowerCase();  //toUpperCase(), toLowerCase() 둘중하나를 사용해서 대문자 소문자 구분 없이 만들어줌

            for(int i = 0; i < str.length(); i++) {

                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vCount++;
                }else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                    cCount++;
                }
                //위의 for문으로 자음, 모음으로 나누어주고 나머지가 스페이스나 특수 문자로 분류되서 카운트 되지 않는다
            }
            System.out.println("모음의 갯수: " + vCount);
            System.out.println("자음의 갯수: " + cCount);

        }
    }


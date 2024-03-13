package Java0313;

public class Java20240313Example2 {
    public static void main(String[] args) {

        // 아래 문자열의 글자수를 카운트
        // 스페이스는 카운트하지 마시오
        String string = "The best of both worlds";
        int count = 0;

        //내 답안지
        string = string.replaceAll(" ",""); //글씨 바꿔주는 공식
/*        System.out.println(string.length());*/
        for (int i=0; i<string.length(); i++){
            count = count + 1;
        }
        System.out.println(count);


        //선생님 답
        for (int i =0; i<string.length(); i++){
            if (string.charAt(i) != ' ')    //charAt : 요 위치의 캐릭터의 숫자를 세보겠다.
                count++;
        }
        System.out.println("글자수 : "+count);   //char

    }
}

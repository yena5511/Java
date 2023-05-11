package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        //1. 저장할 값에 어울리는 이름
        //2. 밑줄(_), 문자(abc), 숫자(123), 사용가능 (공백사용 불가)
        //3. 밑줄또는 문자로 시작가능
        //4. 한 단어 또는 2갸 이상 단어의 연속
        //5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어 제외)
        //6. 예약어 사용 불가(public, static, int ,double, float..)

        //입국 신고서 (여행)

        String nationality = "대한민국"; //국적
        String firstName = "예나"; //이름
        String lastName = "이"; // 성
        String dateOfBirth = "2007-05-22";
        String residentialAddress = "호탤"; //체류지
        String purposeOfVisit = "관광"; //  입국문자
        String _flightNo = "KE123";//밑줄 시작
        String fight_No_2 = "KE123";//밑줄과 숫자 포함

        int accompany = 2; //동반 가족 수
        int lengthOfStay = 5; //체류기간

        String item1 = "시계";
        String item2 = "가방";
        //String 3item = "전자제품";

        int i = 0;
        String s ="";
        String str = "";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";


        }
}

package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String date, int index){
        String hiddenDate = date.substring(0,index); //이예나 -> 이**
        //for (int i = index; i < date.length(); i++)
        for (int i = 0; i < date.length()-index; i++) {
            hiddenDate += "*";//이**
        }
        return hiddenDate;
    }

    public static void main(String[] args) {
        String name = "이예나"; //이름
        String id = "070522-1234567"; //주민등록번호
        String phone = "010-7742-2264"; //전화번호

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}

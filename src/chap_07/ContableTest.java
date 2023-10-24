package chap_07;

public class ContableTest {
    public static void main(String[] args) {
        Countable[] m = {
                new Bird("뻐꾸기", 5), new Bird("독수리", 2),
                new Tree("사과 나무", 10), new Tree("밤나무", 7)
        };
        for (Countable e : m){
            e.count();
        }
        for (int i = 0; i<m.length; i++){
            if(m[i] instanceof Bird){
                ((Bird) m[i]).fly();
            }
            else if (m[i] instanceof Tree){
                ((Tree) m[i]).ripen();
            }
        }
    }
}

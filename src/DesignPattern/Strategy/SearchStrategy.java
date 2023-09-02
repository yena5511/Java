package DesignPattern.Strategy;
interface SearchStrategy {
    public void search ();
}

class SearchStratagyAll implements SearchStrategy{
    public void search (){
        System.out.println("SEARCH ALL");
        // 전체 검색하는 코드
    }
}

class SearchStratagyImage implements SearchStrategy{
    public void search () {
        System.out.println("SEARCH IMAGE");
        // 이미지 검색하는 코드
    }
}

class SearchStratagyNews implements SearchStrategy{
    public void search (){
        System.out.println("SEARCH NEWS");
        // 뉴스 검색하는 코드
    }
}

class SearchStratagyMap implements SearchStrategy{
    public void search () {
        System.out.println("SEARCH MAP");
        // 지도 검색하는 코드
    }
}

class SearchFindAdapter implements SearchStrategy {
    private FindAlgorithm findAlgorithm;

    public SearchFindAdapter (FindAlgorithm _findAlgorithm){
        findAlgorithm = _findAlgorithm;
    }
    public void search (){
        findAlgorithm.find(true);
    }

}

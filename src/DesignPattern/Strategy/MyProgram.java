package DesignPattern.Strategy;

public class MyProgram {
    private SearchButton searchButton = new SearchButton(this);

    public void setModeAll (){
        searchButton.setSearchStrategy(new SearchStrategyAll());
    }
    private void setModeImage (){
        searchButton.setSearchStrategy(new SearchStrategyImage());
    }
    private void setModeNews (){
        searchButton.setSearchStrategy(new SearchStrategyNews());
    }
    private void setModeMap (){
        searchButton.setSearchStrategy(new SearchStrategyMap());
    }

    public void testProgram(){
        searchButton.onClick();   // "SEARCH ALL" 츨력
        setModeImage();           // 이미지검색 모드로
        searchButton.onClick();   // "SEARCH IMAGE" 출렷
        setModeNews();            // 뉴스검색 모드로
        searchButton.onClick();   // "SEARCH NEWS" 출력
        setModeMap();;            // 지도 검색 모드로
        searchButton.onClick();   // "SEARCH MAP" 출력


    }

    public void setModeMovie (){
        searchButton.setSearchStrategy(
                new SearchFindAdapter(new FindMovieAltorithm())
        );
    }


}

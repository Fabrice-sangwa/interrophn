package com.instero.www;


import java.util.List;

public class Magasin {
    private  int idMagasin;
    private  List<Article> articleList;


    public Magasin(List<Article> articleList, int idMagasin) {
        this.articleList = articleList;
        this.idMagasin = idMagasin;
    }
    
    public void add(Article article){
        articleList.add(article);
    }
    
    public boolean contains(Article article){
        for(Article art : articleList) {
            if (article == art)
                return true;
        }
        return false;
    }
}

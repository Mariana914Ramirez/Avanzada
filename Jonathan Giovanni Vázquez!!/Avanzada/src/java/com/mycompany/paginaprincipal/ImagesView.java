/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.paginaprincipal;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author usuario
 */
@ManagedBean
public class ImagesView {
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        images.add("https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/ISO_C%2B%2B_Logo.svg/200px-ISO_C%2B%2B_Logo.svg.png");
        images.add("https://upload.wikimedia.org/wikipedia/commons/d/de/%D0%9B%D0%BE%D0%B3%D0%BE_%D0%B6%D0%B0%D0%B2%D0%B0.png");
        images.add("https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/230px-HTML5_logo_and_wordmark.svg.png");
        images.add("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c3/Python-logo-notext.svg/200px-Python-logo-notext.svg.png");
        images.add("https://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Ruby_logo.svg/1200px-Ruby_logo.svg.png");
    }
 
    public List<String> getImages() {
        return images;
    }
}

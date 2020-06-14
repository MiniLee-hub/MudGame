package com.company.room;

import com.company.article.Drug;

/**
 * @description:家
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/9 15:56
 * @version:
 * @modified By:
 */
public class Home extends Room{
    private Drug currentDrug;

    public Drug getCurrentDrug() {
        return currentDrug;
    }

    public void setCurrentDrug(Drug currentDrug) {
        this.currentDrug = currentDrug;
    }

    public Home(String id, String description){
        super(id, description);
    }
    public Home(){}
}

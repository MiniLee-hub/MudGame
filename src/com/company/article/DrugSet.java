package com.company.article;

import java.util.ArrayList;

/**
 * @description:
 * @author: 物联网201901 李欣 201902150
 * @date: Created in 2020/6/14 11:40
 * @version: v1.0
 * @modified By:
 */
public class DrugSet {
    ArrayList<Drug> drugs=new ArrayList<Drug>();

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }
    public Drug getdrugbyid(String id){
        Drug drug=null;
        for (Drug item:drugs){
            if(id.equals(item.getId())){
                drug=item;
                break;
            }
        }
        return drug;
    }
}

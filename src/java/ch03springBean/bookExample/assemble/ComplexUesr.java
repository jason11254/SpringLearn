/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03springBean.bookExample.assemble;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author jason
 */
public class ComplexUesr {
    private String uname;
    private List<String> hobbyList;
    private Map<String,String> residenceMap;
    private Set<String> aliasSet;
    private String[] array;
    //ㄏノ篶猔,矗ㄑ盿把计篶
    public ComplexUesr(String uname, List<String> hobbyList, Map<String, String> residenceMap, Set<String> aliasSet, String[] array) {
        super();
        this.uname = uname;
        this.hobbyList = hobbyList;
        this.residenceMap = residenceMap;
        this.aliasSet = aliasSet;
        this.array = array;
    }
    //setterよ猭猔,矗ㄑ礚把计篶籔setter
    public ComplexUesr() {
        super();
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }

    public void setResidenceMap(Map<String, String> residenceMap) {
        this.residenceMap = residenceMap;
    }

    public void setAliasSet(Set<String> aliasSet) {
        this.aliasSet = aliasSet;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ComplexUesr{" + "uname=" + uname + ", hobbyList=" + hobbyList + ", residenceMap=" + residenceMap + ", aliasSet=" + aliasSet + ", array=" + array + '}';
    }   
    
}

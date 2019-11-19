package com.company;

import java.util.Collection;

public class CustomCollllllllection implements CustomCollection {
   int count = 0;
   String[] array;

    @Override
    public boolean add(String str) {
        if(count<array.length){
            array[count]=str;
            count++;

        }else {
            String[] newArray = new String[count+count/2];
            for(int i = 0; i<array.length; i++){
                newArray[i] = array[i];
            }
        }
        return true;
    }

    @Override
    public boolean addAll(String[] strArr) {
        return false;
    }

    @Override
    public boolean addAll(Collection strColl) {

        return false;
    }

    @Override
    public boolean delete(int index) {
        if (index >= count || index < 0)
        return false;
        else
            return true;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public String get(int index) {

        return null;
    }

    @Override
    public boolean contains(String str) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compate(Collection coll) {
        return false;
    }
}

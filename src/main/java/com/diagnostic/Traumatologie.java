package com.diagnostic;


//Concrete Product
public class Traumatologie implements Pathologie {

    /**
     * Returns the pathologie name "Traumatologie" if the index is a multiple of 5.
     * 
     * @param index the index to determine the pathologie
     * @return "Traumatologie" if index is a multiple of 5, otherwise null
     */
    @Override
    public String getPathologie(int index) {
        if (index % 5 != 0) {
            return null;
        } 
            return "Traumatologie";
    }


}

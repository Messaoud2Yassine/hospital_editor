package com.diagnostic;


//Concrete Product
public class Cardiologie implements Pathologie {
    

    /**
     * Returns the pathologie name "Cardiologie" if the index is a multiple of 3.
     * 
     * @param index the index to determine the pathologie
     * @return "Cardiologie" if index is a multiple of 3, otherwise null
     */
    @Override
    public String getPathologie(int index) {
        if(index % 3 != 0) {
            return null;
        }
        return "Cardiologie";
    }


}

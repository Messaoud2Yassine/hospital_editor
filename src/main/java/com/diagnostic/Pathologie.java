package com.diagnostic;

//Product
public interface Pathologie {

    /**
     * Returns the pathologie name based on the index.
     * 
     * @param index the index to determine the pathologie
     * @return the pathologie name or null if not applicable
     */
   String getPathologie(int index);


}

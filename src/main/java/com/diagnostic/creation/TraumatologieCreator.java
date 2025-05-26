package com.diagnostic.creation;

import java.util.List;

import com.diagnostic.Pathologie;
import com.diagnostic.Traumatologie;

//Concrete creator for Traumatologie
public class TraumatologieCreator extends PathologieCreator {

    public TraumatologieCreator(List<Pathologie> pathologies) {
        super(pathologies);
    }

    /**
     * Creates and adds a new instance of Traumatologie.
     * 
     * @return updated list of pathologies including the new Traumatologie instance
     */
    @Override
    public List<Pathologie> createPathologie() {
         pathologies.add(new Traumatologie());
        return pathologies;
    }

}

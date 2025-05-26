package com.diagnostic.creation;

import java.util.List;

import com.diagnostic.Cardiologie;
import com.diagnostic.Pathologie;

//Concrete creator for Cardiologie
public class CardiologieCreator extends PathologieCreator {

    public CardiologieCreator(List<Pathologie> pathologies) {
        super(pathologies);
    }

    /**
     * Creates and adds a new instance of Cardiologie.
     * 
     * @return updated list of pathologies including the new Cardiologie instance
     */
    @Override
    public  List< Pathologie > createPathologie() {
         pathologies.add(new Cardiologie());
        return pathologies;
    }


}

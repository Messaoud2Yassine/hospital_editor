package com.diagnostic.creation;

import java.util.List;

import com.diagnostic.Pathologie;

public abstract class PathologieCreator {

    List<Pathologie> pathologies;

    public PathologieCreator(List<Pathologie> pathologies) {
        this.pathologies = pathologies;
    }
    
    /**
     * Creates a new instance of a Pathologie.
     * 
     * @return a new Pathologie instance
     */
    public abstract List<Pathologie> createPathologie();

    public List<Pathologie> getPathologies() {
        return pathologies;
    }



}

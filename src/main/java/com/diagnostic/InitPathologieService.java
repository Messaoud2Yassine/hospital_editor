package com.diagnostic;

import java.util.ArrayList;
import java.util.List;

import com.diagnostic.creation.CardiologieCreator;
import com.diagnostic.creation.TraumatologieCreator;

public class InitPathologieService {

    public List<Pathologie> initPathologies() {
        List<Pathologie> pathologies = new ArrayList<>();
        new CardiologieCreator(pathologies).createPathologie();
        new TraumatologieCreator(pathologies).createPathologie();
        return pathologies;
    }

}

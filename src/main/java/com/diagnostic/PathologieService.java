package com.diagnostic;

import java.util.List;

public class PathologieService {

    public static List<String> getListUniteMedicales(int index, InitPathologieService initPathologieService) {
        List<Pathologie> pathologies = initPathologieService.initPathologies();
        if(index == 0)
        return List.of();
        return pathologies.stream()
                .map(pathologie -> pathologie.getPathologie(index))
                .filter(pathologie -> pathologie != null)
                .toList();
    }

}

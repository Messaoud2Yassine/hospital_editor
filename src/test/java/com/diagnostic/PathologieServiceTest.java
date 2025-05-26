package com.diagnostic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PathologieServiceTest {
    public InitPathologieService initPathologieService = Mockito.mock(InitPathologieService.class);

    @BeforeEach
    void setUp() {
        when(initPathologieService.initPathologies()).thenReturn(List.of(
            new Cardiologie(),
            new Traumatologie()
        ));
    }
    @Test
    void testGetListUniteMedicalesWithPositiveIndex() {
        // When Index not multiple of 3 or 5
        List<String> uniteMedicale = PathologieService.getListUniteMedicales(7, initPathologieService);

        // Then
        assertNotNull(uniteMedicale);
        assertTrue(uniteMedicale.isEmpty());

        // When Index is multiple of 3 and not multiple of 5
        uniteMedicale = PathologieService.getListUniteMedicales(33, initPathologieService);

        // Then
        assertNotNull(uniteMedicale);
        assertEquals(1, uniteMedicale.size());
        assertTrue(uniteMedicale.contains("Cardiologie"));
        assertFalse(uniteMedicale.contains("Traumatologie"));

        // When Index is multiple of 5 and not multiple of 3
        uniteMedicale = PathologieService.getListUniteMedicales(55, initPathologieService);

        // Then
        assertNotNull(uniteMedicale);
        assertEquals(1, uniteMedicale.size());
        assertFalse(uniteMedicale.contains("Cardiologie"));
        assertTrue(uniteMedicale.contains("Traumatologie"));

        // When Index is multiple of 3 and 5
        uniteMedicale = PathologieService.getListUniteMedicales(15, initPathologieService);

        // Then
        assertNotNull(uniteMedicale);
        assertEquals(2, uniteMedicale.size());
        assertTrue(uniteMedicale.contains("Cardiologie"));
        assertTrue(uniteMedicale.contains("Traumatologie"));

    }


    @Test
    void testGetListUniteMedicalesWithNegativeIndex(){
        // Given

        // When Index is negative
        List<String> uniteMedicale = PathologieService.getListUniteMedicales(-1, initPathologieService);

        // Then
        assertNotNull(uniteMedicale);
        assertTrue(uniteMedicale.isEmpty());
    }

    @Test
    void testGetListUniteMedicalesWithZeroIndex(){

        // When Index is zero
        List<String> uniteMedicale = PathologieService.getListUniteMedicales(0, initPathologieService);

        // Then
        assertNotNull(uniteMedicale);
        assertTrue(uniteMedicale.isEmpty());
    }

    }


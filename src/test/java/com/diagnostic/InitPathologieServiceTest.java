package com.diagnostic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

public class InitPathologieServiceTest {

    InitPathologieService initPathologieService = new InitPathologieService();
    @Test
    void testInitPathologies() {
        // When
        List<Pathologie> pathologies = initPathologieService.initPathologies();

        // Then
        assertNotNull(pathologies);
        assertFalse(pathologies.isEmpty());
        assertEquals(2, pathologies.size());
        assertTrue(pathologies.stream().anyMatch(p -> p instanceof Cardiologie));
        assertTrue(pathologies.stream().anyMatch(p -> p instanceof Traumatologie));
    }
}

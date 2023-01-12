package co.com.devmont.mspayment.domain.model.type;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractTypeTest {

    private static ContractType contractType;

    @BeforeEach
    void setUp() {
        contractType = ContractType.builder()
                .id(1L)
                .type("FULL")
                .build();
    }

    @Test
    void getId() {
        assertEquals(1L, contractType.getId());
    }

    @Test
    void getType() {
        assertEquals("FULL", contractType.getType());
    }

    @Test
    void setId() {
        contractType.setId(2L);
        assertEquals(2L, contractType.getId());
    }

    @Test
    void setType() {
        contractType.setType("PARTIAL");
        assertEquals("PARTIAL", contractType.getType());
    }
}
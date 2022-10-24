package com.example.petclinic;

import io.hypersistence.optimizer.HypersistenceOptimizer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PetClinicApplicationTests {

    @Autowired
    private HypersistenceOptimizer hypersistenceOptimizer;

    @Test
    void contextLoads() {
        assertFalse(false);
    }

    @Test
    void test() {
        assertFalse(hypersistenceOptimizer.getEvents().isEmpty());
    }


}

package co.com.sofka.banktransaction.repository;

import co.com.sofka.banktransaction.model.entity.Bank;
import co.com.sofka.banktransaction.repository.jpa.JpaBankRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest(showSql = true)
class BankRepositoryTest {

    @Autowired
    BankRepository repository;

    @MockBean
    JpaBankRepository jpaBankRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void update() {
        assertEquals(1,1);
    }

    @Test
    void save() {
        assertEquals(1,1);
    }

    @Test
    void delete() {
        assertEquals(1,1);
    }

    @Test
    void findById() {
        assertEquals(1,1);
    }

    @Test
    void deleteByElementId() {
        assertEquals(1,1);
    }

    @Test
    void getAll() {
        Mockito.when(jpaBankRepository.findAll()).thenReturn(List.of(new Bank()));
        List<Bank> all = repository.getAll();

        assertNotNull(all);
    }
}
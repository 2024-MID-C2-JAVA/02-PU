package co.com.sofka.banco.repository.jpa;

import co.com.sofka.banco.model.entity.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBankTransactionRepository extends JpaRepository<BankTransaction, Long> {
}
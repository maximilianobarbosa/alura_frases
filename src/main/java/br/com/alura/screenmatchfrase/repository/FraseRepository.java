package br.com.alura.screenmatchfrase.repository;

import br.com.alura.screenmatchfrase.model.Frase;
import br.com.alura.screenmatchfrase.model.FraseDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FraseRepository extends JpaRepository<Frase, Long> {

    @Query ("""
            SELECT f FROM Frase f
            ORDER BY FUNCTION('RANDOM') 
            LIMIT 1
            """)
    Optional<Frase> obterFraseAleatoria();
}

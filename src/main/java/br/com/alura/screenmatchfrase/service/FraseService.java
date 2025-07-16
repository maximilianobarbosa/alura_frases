package br.com.alura.screenmatchfrase.service;

import br.com.alura.screenmatchfrase.model.Frase;
import br.com.alura.screenmatchfrase.model.FraseDTO;
import br.com.alura.screenmatchfrase.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseSerie() {
        Optional<Frase> frase = repositorio.obterFraseAleatoria();
        if (frase.isPresent()) {
            Frase f = frase.get();
            return new FraseDTO(f.getTitulo(), f.getFrase(), f.getPersonagem(), f.getPoster());
        }
        return null;
    }
}

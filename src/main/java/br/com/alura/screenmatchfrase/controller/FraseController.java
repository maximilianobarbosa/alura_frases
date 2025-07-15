package br.com.alura.screenmatchfrase.controller;

import br.com.alura.screenmatchfrase.model.FraseDTO;
import br.com.alura.screenmatchfrase.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {

    @Autowired
    private FraseService servico;

    @GetMapping("/frases")
    public FraseDTO obterFraseSerie() {
        return servico.obterFraseSerie();
    }

}

package br.com.alura.EstudosBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemControllers {

    @GetMapping(value = "path")
    public String getMethodName(@RequestParam String param) {

        return "Oi, javinhas!";

    }
}

package br.com.alura.EstudosBackend;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemControllers {

    private List<Linguagem> linguagens = List.of(
            new Linguagem("Java",
                    "https://raw.githubusercontent.com/AllanCunhaDev/programming-languages-logos/master/src/java/java_256x256.png",
                    1),
            new Linguagem("TypeScript",
                    "https://raw.githubusercontent.com/AllanCunhaDev/programming-languages-logos/master/src/typescript/typescript_256x256.png",
                    2));

    private LinguagemRepository repositorio;

    @GetMapping("/linguagens")
    public List<Linguagem> obterLinguagens() {
        return linguagens;
    }
}

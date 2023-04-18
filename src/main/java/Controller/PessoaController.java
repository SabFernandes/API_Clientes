package Controller;

import Model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
@RestController
public class PessoaController {
    @GetMapping("/pessoas")
    public List<Pessoa> getPessoas() {
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa ("Sabrina", 21, "51510776869"));
        pessoas.add(new Pessoa("Rafael", 21, "15476587665"));

        return pessoas;
    }
}


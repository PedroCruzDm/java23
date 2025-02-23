package br.com.apenas.Whisperly.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aluno")
public class AlunoController {

    @GetMapping("/findByName")
    public String getNome(@RequestParam(value = "nome", required = false, defaultValue = "Aluno") String nome) {
        return "Olá, Aluno " + nome;
    }

    @GetMapping("/{id}")
    public String getMethodName(@PathVariable(value="id")String param) {
        return "id pra pegar o usuario foi " + param;
    }
}

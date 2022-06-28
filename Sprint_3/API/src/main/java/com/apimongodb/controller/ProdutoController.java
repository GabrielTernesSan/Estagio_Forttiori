package com.apimongodb.controller;

import com.apimongodb.model.Produto;
import com.apimongodb.service.ProdutoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> obterTodos(){
        return this.produtoService.obterTodos();
    }

    @GetMapping("/{codigo}")
    public Produto obterPorCodigo(@PathVariable String codigo) {
        return this.produtoService.obterPorCodigo(codigo);
    }

    @GetMapping("v2/{codigo}")
    public Map<String, String> obterPorCodigoV2(@PathVariable String codigo) {
        Map<String, String> obterPorCodigoVersao2 = new HashMap<>();
        obterPorCodigoVersao2.put("Nome: ", this.produtoService.obterPorCodigo(codigo).getNome());
        obterPorCodigoVersao2.put("Marca: ", this.produtoService.obterPorCodigo(codigo).getMarca());
        return obterPorCodigoVersao2;
    }

    @PutMapping("/{codigo}")
    public Optional<Produto> atualizar(@RequestBody Produto newProduto, @PathVariable String codigo){
        return this.produtoService.atualizar(newProduto, codigo);
    }

    @PatchMapping("/{codigo}")
    public Optional<Produto> atualizarParte(@RequestBody Produto newProduto, @PathVariable String codigo){
        return this.produtoService.atualizarNome(newProduto, codigo);
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto){
        return this.produtoService.criar(produto);
    }

    @DeleteMapping("/{codigo}")
    private void deletar(@PathVariable String codigo)
    {
        this.produtoService.deletar(codigo);
    }

    /*
    *
    * Cookies
    *
    */

    @GetMapping("/cookies")
    public String readCookie(@CookieValue(value = "username", defaultValue = "") String username) {
        if(!username.isEmpty())
            return "Usuário: " + username;
        return "Usuário não definido";
    }

    @GetMapping("/cookies/{username}")
    public String setCookie(HttpServletResponse response, @PathVariable("username") String username) {
        // create a cookie
        Cookie cookie = new Cookie("username", username);
        cookie.setMaxAge(10);

        //add cookie to response
        response.addCookie(cookie);

        return "Novo Cookie criado!";
    }

    @GetMapping("/cookies/get")
    public String readAllCookies(HttpServletRequest request) {

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            return Arrays.stream(cookies)
                    .map(c -> c.getName() + "=" + c.getValue()).collect(Collectors.joining(", "));
        }

        return "No cookies";
    }

    /*
    *
    * ExceptionHandler
    *
    */

    @GetMapping("/null")
    public void exceptionShot(){
        throw new NullPointerException();
    }
}


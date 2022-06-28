package com.apimongodb.service;

import com.apimongodb.model.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoService {

    public List<Produto> obterTodos();

    public Produto obterPorCodigo(String codigo);

    public Optional<Produto> atualizar(Produto produto, String codigo);

    public Produto criar(Produto produto);

    public void deletar(String codigo);

    public Optional<Produto> atualizarNome(Produto produto, String codigo);
}

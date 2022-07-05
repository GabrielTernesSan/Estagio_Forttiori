package com.apimongodb.service.implement;

import com.apimongodb.model.Produto;
import com.apimongodb.repository.ProdutoRepository;
import com.apimongodb.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public List<Produto> obterTodos() {
        return this.produtoRepository.findAll();
    }

    @Override
    public Produto obterPorCodigo(String codigo) {
        return this.produtoRepository
                .findById(codigo)
                .orElseThrow(() -> new IllegalArgumentException("Produto não existe"));
    }

    @Override
    public Optional<Produto> atualizar(Produto newProduto, String codigo) {
        return Optional.of(this.produtoRepository.findById(codigo)
                .map(produto -> {
                    produto.setNome(newProduto.getNome());
                    produto.setMarca(newProduto.getMarca());
                    produto.setDescricao(newProduto.getDescricao());
                    return produtoRepository.save(produto);
                }).orElseGet(() -> produtoRepository.save(newProduto)));
    }

    @Override
    public Produto criar(Produto produto) {
        return this.produtoRepository.save(produto);
    }

    @Override
    public void deletar(String codigo) {
        this.produtoRepository.deleteById(codigo);
    }

    @Override
    public Optional<Produto> atualizarNome(Produto newProduto, String codigo) {
        return Optional.of(this.produtoRepository.findById(codigo)
                .map(produto -> {
                    produto.setNome(newProduto.getNome());
                    return produtoRepository.save(produto);
                }).orElseGet(() -> produtoRepository.save(newProduto)));
    }
}

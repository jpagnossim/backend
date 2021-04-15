package br.com.gestao.produtos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProdutosController {

	
	@GetMapping("/listarprodutos")
	public String ListarProdutos() {
		return "ListaProdutos";
	}
	
	@GetMapping("/cadastrarproduto")
	public String CadastrarProduto() {
		return "InserirProduto";
	}

	@PostMapping("/inserirproduto")
	public String InserirProduto() {
		return "redirect:/produtoinserido";
	}

	@GetMapping("/produtoinserido")
	public String ProdutoInserido() {
		return "ProdutoInserido";
	}
}

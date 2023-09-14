package br.com.fiap.biblioteca.testes;

import br.com.fiap.biblioteca.models.Endereco;
import br.com.fiap.biblioteca.services.ViaCepService;

import java.util.Scanner;

public class TesteBuscaCep {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner ent = new Scanner(System.in);
        ViaCepService consulta = new ViaCepService();
        Endereco meuEndereco = new Endereco();
        //EnderecoDao dao = new EnderecoDao();
        System.out.println("Digite o número do CEP para consulta: ");
        var cep = leitor.nextLine();
        try {
            meuEndereco = consulta.buscaEndereco(cep);
            System.out.println(meuEndereco.toString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}

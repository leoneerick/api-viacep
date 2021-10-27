package br.leone.testeviacep.cliente;

import br.leone.testeviacep.dominio.Endereco;
import br.leone.testeviacep.viacep.ServicoDeCep;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.print("Informe seu CEP: ");
        String cep = new Scanner(System.in).nextLine();

        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("CEP: " + endereco.getCep());
        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());

    }

}

package br.leone.testeviacep.dominio;

public class Endereco {
    String cep;
    String logradouro;
    String bairro;
    String localidade;

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "cep= " + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + "}";
    }
}
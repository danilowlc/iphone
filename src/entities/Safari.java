package entities;

import Interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibir Pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualiziando");
    }
}

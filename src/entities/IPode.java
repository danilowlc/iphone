package entities;

import Interfaces.ReproduzirMusica;

public class IPode implements ReproduzirMusica {
    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pause");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
}

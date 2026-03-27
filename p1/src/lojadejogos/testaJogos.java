package lojadejogos;

public class TestaJogos {

    public static void main(String[] args) {

        // ===== JOGO FÍSICO =====
        JogoFisico fisico = new JogoFisico();
        fisico.setCodigo(1);
        fisico.setNome("GTA V");
        fisico.setGenero("Ação");
        fisico.setPreco(100);
        fisico.setQtdEstoque(10);

        fisico.vender(3);

        fisico.aplicarDesconto(10);

        fisico.mostrarDados();

        System.out.println();

        // ===== JOGO DIGITAL =====
        JogoDigital digital = new JogoDigital();
        digital.setCodigo(2);
        digital.setNome("Minecraft");
        digital.setGenero("Sandbox");
        digital.setPreco(80);
        digital.setTamanhoDoDownload(2.5);

        digital.aplicarDesconto(5, 2);

        // Mostrando dados
        digital.mostrarDados();
    }
}
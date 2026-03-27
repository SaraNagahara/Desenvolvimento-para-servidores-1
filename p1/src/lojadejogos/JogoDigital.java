package lojadejogos;

public class JogoDigital extends Jogo {
    private double tamanhoDoDownload;

    public double getTamanhoDoDownload() {
        return tamanhoDoDownload;
    }

    public void setTamanhoDoDownload(double tamanhoDoDownload) {
        this.tamanhoDoDownload = tamanhoDoDownload;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tamanho do download: " + tamanhoDoDownload + " GB");
    }
}
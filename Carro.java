public class Carro {
    private String Marca, Modelo;

    public Carro(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;

    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void mostrarDetalhes() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
    }
}

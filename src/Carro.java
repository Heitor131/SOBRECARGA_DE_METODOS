public class Carro {
    
    private String marca;
    private String modelo;
    private int ano;


public void mostraInformações(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
}


public Carro(){
    this.marca = " ";
    this.modelo = " ";
    this.ano = 0;
}

public Carro(String marca, String modelo, int ano){
    this.marca = marca;
    this.modelo = modelo;
    this.setAno(ano);

}

public String getMarca() {
    return marca;
}

public void setMarca(String marca) {
    this.marca = marca;
}

public String getModelo() {
    return modelo;
}

public void setModelo(String modelo) {
    if (modelo != null &&  !modelo.isEmpty()) {
        this.modelo = modelo;
    }else{
        System.out.println("Modelo invalido");
    }
}

public int getAno() {
    return ano;
}

public void setAno(int ano) {
    if (ano > 0) {
        this.ano = ano;
    }
}

}

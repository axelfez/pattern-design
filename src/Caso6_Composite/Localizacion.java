package Caso6_Composite;

public class Localizacion {
    private String correoElectronico;
    private int apartadoPostal;
    private String ciudad;
    private String pais;

    public Localizacion(String correoElectronico, int apartadoPostal, String ciudad, String pais){
        this.setApartadoPostal(apartadoPostal);
        this.setCiudad(ciudad);
        this.setCorreoElectronico(correoElectronico);
        this.setPais(pais);
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getApartadoPostal() {
        return apartadoPostal;
    }

    public void setApartadoPostal(int apartadoPostal) {
        this.apartadoPostal = apartadoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

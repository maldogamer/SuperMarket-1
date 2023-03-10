package model;

public class Supplier extends Person{
    
    String webSite;

    public Supplier(int rut, String name, Address address, long number, String webSite) {
        super(rut, name, address, number);
        this.webSite = webSite;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return "Proveedor [ " + super.toString() + ", Sitio web=" + webSite + "]";
    }

}

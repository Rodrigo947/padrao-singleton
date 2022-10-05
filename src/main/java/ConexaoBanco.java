

public class ConexaoBanco {
    private ConexaoBanco() {}
    public static ConexaoBanco instance = new ConexaoBanco();

    public static ConexaoBanco getInstance() {
        return instance;
    }

    private String urlConnection;

    public void setUrlConnection(String urlConnection) {
        this.urlConnection = urlConnection;
    }

    public String getUrlConnection(){
        return "URL Connection: "+this.urlConnection;
    }
}

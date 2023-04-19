public class AchadoPedido implements Publicacao {

   private String titulo;
    private String descricao;
    private String foto;
    private String local_Achado;
    private String data_Hora;
    private String status;

    public AchadoPedido(String titulo, String descricao, String foto, String local_Achado, String data_Hora, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.foto = foto;
        this.local_Achado = local_Achado;
        this.data_Hora = data_Hora;
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getLocal_Achado() {
        return local_Achado;
    }

    public void setLocal_Achado(String local_Achado) {
        this.local_Achado = local_Achado;
    }

    public String getData_Hora() {
        return data_Hora;
    }

    public void setData_Hora(String data_Hora) {
        this.data_Hora = data_Hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;

    }


}

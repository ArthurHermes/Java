public class livro {
    private int idLivro;
    private String nome;
    private Float valor;
    private int numPag;
    private String idioma;
    private String disponibilidade;

    private categoria categoria;
    private enum categoria{
        romance,
        ficcaoCientifica,
        fantasia,
        misterio,
        suspense,
        horror,
        biografia,
        historia,
        programacao,
        gastronomia
    }
    
    private classificacao classificacao;
    private enum classificacao{
        infantil,
        livre
    }


    /* Constructor */

    public livro(int idLivro, String nome, Float valor, int numPag, categoria categoria, classificacao classificacao, String idioma, boolean disponibilidade){
        this.idLivro = idLivro;
        this.nome = nome;
        this.valor = valor;
        this.numPag = numPag;
        this.categoria = categoria;
        this.classificacao = classificacao;
        this.idioma = idioma;
        this.disponibilidade = disponibilidade;
    }


    /* Setters */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }
    public void setClassificacao(classificacao classificacao) {
        this.classificacao = classificacao;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    /* Getters */

    public int getIdLivro() {
        return idLivro;
    }
    public String getNome() {
        return nome;
    }
    public Float getValor() {
        return valor;
    }
    public int getNumPag() {
        return numPag;
    }
    public categoria getCategoria() {
        return categoria;
    }
    public classificacao getClassificacao() {
        return classificacao;
    }
    public String getIdioma() {
        return idioma;
    }
    public boolean getDisponibilidade(){
        return disponibilidade;
    }

}

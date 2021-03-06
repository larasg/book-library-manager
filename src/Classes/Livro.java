package Classes;
// Generated 30/03/2015 20:03:51 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Livro generated by hbm2java
 */
public class Livro  implements java.io.Serializable {


     private String codLivro;
     private String nomeLivro;
     private String autorLivro;
     private String categoriaLivro;
     private String descricaoLivro;
     private Set compraProdutos = new HashSet(0);
     private Set vendaProdutos = new HashSet(0);

    public Livro() {
    }

	
    public Livro(String codLivro, String nomeLivro, String autorLivro, String categoriaLivro, String descricaoLivro) {
        this.codLivro = codLivro;
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.categoriaLivro = categoriaLivro;
        this.descricaoLivro = descricaoLivro;
    }
    public Livro(String codLivro, String nomeLivro, String autorLivro, String categoriaLivro, String descricaoLivro, Set compraProdutos, Set vendaProdutos) {
       this.codLivro = codLivro;
       this.nomeLivro = nomeLivro;
       this.autorLivro = autorLivro;
       this.categoriaLivro = categoriaLivro;
       this.descricaoLivro = descricaoLivro;
       this.compraProdutos = compraProdutos;
       this.vendaProdutos = vendaProdutos;
    }
   
    public String getCodLivro() {
        return this.codLivro;
    }
    
    public void setCodLivro(String codLivro) {
        this.codLivro = codLivro;
    }
    public String getNomeLivro() {
        return this.nomeLivro;
    }
    
    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }
    public String getAutorLivro() {
        return this.autorLivro;
    }
    
    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }
    public String getCategoriaLivro() {
        return this.categoriaLivro;
    }
    
    public void setCategoriaLivro(String categoriaLivro) {
        this.categoriaLivro = categoriaLivro;
    }
    public String getDescricaoLivro() {
        return this.descricaoLivro;
    }
    
    public void setDescricaoLivro(String descricaoLivro) {
        this.descricaoLivro = descricaoLivro;
    }
    public Set getCompraProdutos() {
        return this.compraProdutos;
    }
    
    public void setCompraProdutos(Set compraProdutos) {
        this.compraProdutos = compraProdutos;
    }
    public Set getVendaProdutos() {
        return this.vendaProdutos;
    }
    
    public void setVendaProdutos(Set vendaProdutos) {
        this.vendaProdutos = vendaProdutos;
    }




}



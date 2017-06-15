/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "observacao_sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ObservacaoSala.findAll", query = "SELECT o FROM ObservacaoSala o")
    , @NamedQuery(name = "ObservacaoSala.findById", query = "SELECT o FROM ObservacaoSala o WHERE o.id = :id")
    , @NamedQuery(name = "ObservacaoSala.findByDescricao", query = "SELECT o FROM ObservacaoSala o WHERE o.descricao = :descricao")
    , @NamedQuery(name = "ObservacaoSala.findByDataHora", query = "SELECT o FROM ObservacaoSala o WHERE o.dataHora = :dataHora")
    , @NamedQuery(name = "ObservacaoSala.findByAtivo", query = "SELECT o FROM ObservacaoSala o WHERE o.ativo = :ativo")})
public class ObservacaoSala implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "data_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @Basic(optional = false)
    @Column(name = "ativo")
    private boolean ativo;
    @JoinColumn(name = "id_usuario", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Usuario idUsuario;
    @JoinColumn(name = "id_sala", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sala idSala;

    public ObservacaoSala() {
    }

    public ObservacaoSala(Integer id) {
        this.id = id;
    }

    public ObservacaoSala(Integer id, String descricao, Date dataHora, boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Sala getIdSala() {
        return idSala;
    }

    public void setIdSala(Sala idSala) {
        this.idSala = idSala;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObservacaoSala)) {
            return false;
        }
        ObservacaoSala other = (ObservacaoSala) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.ObservacaoSala[ id=" + id + " ]";
    }
    
}

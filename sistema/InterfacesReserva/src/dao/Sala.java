/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "sala")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sala.findAll", query = "SELECT s FROM Sala s")
    , @NamedQuery(name = "Sala.findById", query = "SELECT s FROM Sala s WHERE s.id = :id")
    , @NamedQuery(name = "Sala.findByCodigo", query = "SELECT s FROM Sala s WHERE s.codigo = :codigo")
    , @NamedQuery(name = "Sala.findByAtivo", query = "SELECT s FROM Sala s WHERE s.ativo = :ativo")})
public class Sala implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;
    @Lob
    @Column(name = "equipamentos")
    private String equipamentos;
    @Basic(optional = false)
    @Column(name = "ativo")
    private boolean ativo;
    @JoinColumn(name = "id_bloco", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Bloco idBloco;
    @JoinColumn(name = "id_tipo_de_sala", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoDeSala idTipoDeSala;
    @JoinColumn(name = "id_administrador", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Usuario idAdministrador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSala")
    private Collection<Reserva> reservaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idSala")
    private Collection<ObservacaoSala> observacaoSalaCollection;

    public Sala() {
    }

    public Sala(Integer id) {
        this.id = id;
    }

    public Sala(Integer id, String codigo, boolean ativo) {
        this.id = id;
        this.codigo = codigo;
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        String oldEquipamentos = this.equipamentos;
        this.equipamentos = equipamentos;
        changeSupport.firePropertyChange("equipamentos", oldEquipamentos, equipamentos);
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        boolean oldAtivo = this.ativo;
        this.ativo = ativo;
        changeSupport.firePropertyChange("ativo", oldAtivo, ativo);
    }

    public Bloco getIdBloco() {
        return idBloco;
    }

    public void setIdBloco(Bloco idBloco) {
        Bloco oldIdBloco = this.idBloco;
        this.idBloco = idBloco;
        changeSupport.firePropertyChange("idBloco", oldIdBloco, idBloco);
    }

    public TipoDeSala getIdTipoDeSala() {
        return idTipoDeSala;
    }

    public void setIdTipoDeSala(TipoDeSala idTipoDeSala) {
        TipoDeSala oldIdTipoDeSala = this.idTipoDeSala;
        this.idTipoDeSala = idTipoDeSala;
        changeSupport.firePropertyChange("idTipoDeSala", oldIdTipoDeSala, idTipoDeSala);
    }

    public Usuario getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Usuario idAdministrador) {
        Usuario oldIdAdministrador = this.idAdministrador;
        this.idAdministrador = idAdministrador;
        changeSupport.firePropertyChange("idAdministrador", oldIdAdministrador, idAdministrador);
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
    }

    @XmlTransient
    public Collection<ObservacaoSala> getObservacaoSalaCollection() {
        return observacaoSalaCollection;
    }

    public void setObservacaoSalaCollection(Collection<ObservacaoSala> observacaoSalaCollection) {
        this.observacaoSalaCollection = observacaoSalaCollection;
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
        if (!(object instanceof Sala)) {
            return false;
        }
        Sala other = (Sala) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Sala[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

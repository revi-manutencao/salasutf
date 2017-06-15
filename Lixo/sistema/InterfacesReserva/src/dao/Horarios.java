/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "horarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horarios.findAll", query = "SELECT h FROM Horarios h")
    , @NamedQuery(name = "Horarios.findById", query = "SELECT h FROM Horarios h WHERE h.id = :id")
    , @NamedQuery(name = "Horarios.findByDescricao", query = "SELECT h FROM Horarios h WHERE h.descricao = :descricao")
    , @NamedQuery(name = "Horarios.findByHorarioInicio", query = "SELECT h FROM Horarios h WHERE h.horarioInicio = :horarioInicio")
    , @NamedQuery(name = "Horarios.findByHorarioFim", query = "SELECT h FROM Horarios h WHERE h.horarioFim = :horarioFim")
    , @NamedQuery(name = "Horarios.findByTurno", query = "SELECT h FROM Horarios h WHERE h.turno = :turno")
    , @NamedQuery(name = "Horarios.findByAtivo", query = "SELECT h FROM Horarios h WHERE h.ativo = :ativo")})
public class Horarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private String id;
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "horario_inicio")
    @Temporal(TemporalType.TIME)
    private Date horarioInicio;
    @Basic(optional = false)
    @Column(name = "horario_fim")
    @Temporal(TemporalType.TIME)
    private Date horarioFim;
    @Basic(optional = false)
    @Column(name = "turno")
    private short turno;
    @Basic(optional = false)
    @Column(name = "ativo")
    private boolean ativo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idHorarios")
    private Collection<Reserva> reservaCollection;

    public Horarios() {
    }

    public Horarios(String id) {
        this.id = id;
    }

    public Horarios(String id, Date horarioInicio, Date horarioFim, short turno, boolean ativo) {
        this.id = id;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.turno = turno;
        this.ativo = ativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(Date horarioFim) {
        this.horarioFim = horarioFim;
    }

    public short getTurno() {
        return turno;
    }

    public void setTurno(short turno) {
        this.turno = turno;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @XmlTransient
    public Collection<Reserva> getReservaCollection() {
        return reservaCollection;
    }

    public void setReservaCollection(Collection<Reserva> reservaCollection) {
        this.reservaCollection = reservaCollection;
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
        if (!(object instanceof Horarios)) {
            return false;
        }
        Horarios other = (Horarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Horarios[ id=" + id + " ]";
    }
    
}

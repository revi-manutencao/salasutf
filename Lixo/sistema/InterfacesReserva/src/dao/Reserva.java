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
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")
    , @NamedQuery(name = "Reserva.findById", query = "SELECT r FROM Reserva r WHERE r.id = :id")
    , @NamedQuery(name = "Reserva.findByDataHoraReserva", query = "SELECT r FROM Reserva r WHERE r.dataHoraReserva = :dataHoraReserva")
    , @NamedQuery(name = "Reserva.findByAtivo", query = "SELECT r FROM Reserva r WHERE r.ativo = :ativo")
    , @NamedQuery(name = "Reserva.findByDataUso", query = "SELECT r FROM Reserva r WHERE r.dataUso = :dataUso")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "data_hora_reserva")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraReserva;
    @Basic(optional = false)
    @Column(name = "ativo")
    private boolean ativo;
    @Basic(optional = false)
    @Column(name = "data_uso")
    @Temporal(TemporalType.DATE)
    private Date dataUso;
    @JoinColumn(name = "id_professor", referencedColumnName = "login")
    @ManyToOne(optional = false)
    private Usuario idProfessor;
    @JoinColumn(name = "id_horarios", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Horarios idHorarios;
    @JoinColumn(name = "id_sala", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sala idSala;

    public Reserva() {
    }

    public Reserva(Integer id) {
        this.id = id;
    }

    public Reserva(Integer id, Date dataHoraReserva, boolean ativo, Date dataUso) {
        this.id = id;
        this.dataHoraReserva = dataHoraReserva;
        this.ativo = ativo;
        this.dataUso = dataUso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataHoraReserva() {
        return dataHoraReserva;
    }

    public void setDataHoraReserva(Date dataHoraReserva) {
        this.dataHoraReserva = dataHoraReserva;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataUso() {
        return dataUso;
    }

    public void setDataUso(Date dataUso) {
        this.dataUso = dataUso;
    }

    public Usuario getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Usuario idProfessor) {
        this.idProfessor = idProfessor;
    }

    public Horarios getIdHorarios() {
        return idHorarios;
    }

    public void setIdHorarios(Horarios idHorarios) {
        this.idHorarios = idHorarios;
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
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Reserva[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qgenergia.controleportaria.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author denis.gibikoski
 */
@Entity
@Table(name = "portaria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portaria.findAll", query = "SELECT p FROM Portaria p")
    , @NamedQuery(name = "Portaria.findById", query = "SELECT p FROM Portaria p WHERE p.id = :id")
    , @NamedQuery(name = "Portaria.findByDatasystem", query = "SELECT p FROM Portaria p WHERE p.datasystem = :datasystem")
    , @NamedQuery(name = "Portaria.findByStatus", query = "SELECT p FROM Portaria p WHERE p.status = :status")
    , @NamedQuery(name = "Portaria.findByKm", query = "SELECT p FROM Portaria p WHERE p.km = :km")})
public class Portaria implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    
    public static final String TODOS = "Portaria.findAll";

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "datasystem")
    private String datasystem;
    @Basic(optional = false)
    @Lob
    @Column(name = "data")
    private String data;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @Basic(optional = false)
    @Lob
    @Column(name = "veiculo")
    private String veiculo;
    @Column(name = "KM")
    private String km;
    @Basic(optional = false)
    @Lob
    @Column(name = "placa")
    private String placa;
    @Basic(optional = false)
    @Lob
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @Lob
    @Column(name = "autorizacao")
    private String autorizacao;
    @Basic(optional = false)
    @Lob
    @Column(name = "pessoa1")
    private String pessoa1;
    @Lob
    @Column(name = "pessoa2")
    private String pessoa2;
    @Lob
    @Column(name = "pessoa3")
    private String pessoa3;
    @Lob
    @Column(name = "pessoa4")
    private String pessoa4;
    @Lob
    @Column(name = "pessoa5")
    private String pessoa5;

    public Portaria() {
    }

    public Portaria(Integer id) {
        this.id = id;
    }

    public Portaria(Integer id, String datasystem, String data, String status, String veiculo, String placa, String empresa, String autorizacao, String pessoa1) {
        this.id = id;
        this.datasystem = datasystem;
        this.data = data;
        this.status = status;
        this.veiculo = veiculo;
        this.placa = placa;
        this.empresa = empresa;
        this.autorizacao = autorizacao;
        this.pessoa1 = pessoa1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getDatasystem() {
        return datasystem;
    }

    public void setDatasystem(String datasystem) {
        String oldDatasystem = this.datasystem;
        this.datasystem = datasystem;
        changeSupport.firePropertyChange("datasystem", oldDatasystem, datasystem);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String oldData = this.data;
        this.data = data;
        changeSupport.firePropertyChange("data", oldData, data);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        String oldVeiculo = this.veiculo;
        this.veiculo = veiculo;
        changeSupport.firePropertyChange("veiculo", oldVeiculo, veiculo);
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        String oldKm = this.km;
        this.km = km;
        changeSupport.firePropertyChange("km", oldKm, km);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        String oldPlaca = this.placa;
        this.placa = placa;
        changeSupport.firePropertyChange("placa", oldPlaca, placa);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        String oldEmpresa = this.empresa;
        this.empresa = empresa;
        changeSupport.firePropertyChange("empresa", oldEmpresa, empresa);
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        String oldAutorizacao = this.autorizacao;
        this.autorizacao = autorizacao;
        changeSupport.firePropertyChange("autorizacao", oldAutorizacao, autorizacao);
    }

    public String getPessoa1() {
        return pessoa1;
    }

    public void setPessoa1(String pessoa1) {
        String oldPessoa1 = this.pessoa1;
        this.pessoa1 = pessoa1;
        changeSupport.firePropertyChange("pessoa1", oldPessoa1, pessoa1);
    }

    public String getPessoa2() {
        return pessoa2;
    }

    public void setPessoa2(String pessoa2) {
        String oldPessoa2 = this.pessoa2;
        this.pessoa2 = pessoa2;
        changeSupport.firePropertyChange("pessoa2", oldPessoa2, pessoa2);
    }

    public String getPessoa3() {
        return pessoa3;
    }

    public void setPessoa3(String pessoa3) {
        String oldPessoa3 = this.pessoa3;
        this.pessoa3 = pessoa3;
        changeSupport.firePropertyChange("pessoa3", oldPessoa3, pessoa3);
    }

    public String getPessoa4() {
        return pessoa4;
    }

    public void setPessoa4(String pessoa4) {
        String oldPessoa4 = this.pessoa4;
        this.pessoa4 = pessoa4;
        changeSupport.firePropertyChange("pessoa4", oldPessoa4, pessoa4);
    }

    public String getPessoa5() {
        return pessoa5;
    }

    public void setPessoa5(String pessoa5) {
        String oldPessoa5 = this.pessoa5;
        this.pessoa5 = pessoa5;
        changeSupport.firePropertyChange("pessoa5", oldPessoa5, pessoa5);
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
        if (!(object instanceof Portaria)) {
            return false;
        }
        Portaria other = (Portaria) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Portaria{" + "id=" + id + ", datasystem=" + datasystem + ", data=" + data + ", status=" + status + ", veiculo=" + veiculo + ", km=" + km + ", placa=" + placa + ", empresa=" + empresa + ", autorizacao=" + autorizacao + ", pessoa1=" + pessoa1 + ", pessoa2=" + pessoa2 + ", pessoa3=" + pessoa3 + ", pessoa4=" + pessoa4 + ", pessoa5=" + pessoa5 + '}';
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

 
    
}

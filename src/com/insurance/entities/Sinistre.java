package com.insurance.entities;
// Generated 20 mai 2019 23:32:14 by Hibernate Tools 5.4.2.Final

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 * Sinistre generated by hbm2java
 */
@Entity
@Table(name = "sinistre", catalog = "assurance")
public class Sinistre implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "code_sinistre", unique = true)
    private Integer codeSinistre;

    @Column(name = "date_declare")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDeclare;

    @Column(name = "date_sinistre")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateSinistre;

    @Column(name = "lieu_sinistre")
    private String lieuSinistre;

    @Column(name = "num_sinistre")
    private Integer numSinistre;

    @Column(name = "provision")
    private Integer provision;

    @Column(name = "dommage_corps")
    private Integer dommageCorps;

    @Column(name = "dommage_materiel")
    private Integer dommageMateriel;

    @Column(name = "etat_avance")
    private String etatAvance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "code_regl", referencedColumnName = "code_regl", insertable = false, updatable = false)
    private Reglement reglement;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ref_contrat", referencedColumnName = "ref_contrat", insertable = false, updatable = false)
    private Contrat contrat;

    public Sinistre() {
    }

    public Sinistre(Contrat contrat) {
        this.contrat = contrat;
    }

    public Sinistre(Integer codeSinistre, Date dateDeclare, Date dateSinistre, String lieuSinistre, Integer numSinistre, Integer provision, Integer dommageCorps, Integer dommageMateriel, String etatAvance, Reglement reglement, Contrat contrat) {
        this.codeSinistre = codeSinistre;
        this.dateDeclare = dateDeclare;
        this.dateSinistre = dateSinistre;
        this.lieuSinistre = lieuSinistre;
        this.numSinistre = numSinistre;
        this.provision = provision;
        this.dommageCorps = dommageCorps;
        this.dommageMateriel = dommageMateriel;
        this.etatAvance = etatAvance;
        this.reglement = reglement;
        this.contrat = contrat;
    }

  
    public Integer getCodeSinistre() {
        return this.codeSinistre;
    }

    public void setCodeSinistre(Integer codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public Reglement getcodeRegl() {
        return this.reglement;
    }

    public void setcodeRegl(Reglement reglement) {
        this.reglement = reglement;
    }

    public Reglement getReglement() {
        return reglement;
    }

    public void setReglement(Reglement reglement) {
        this.reglement = reglement;
    }

    public Contrat getRefContrat() {
        return contrat;
    }

    public void setRefContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public Date getDateDeclare() {
        return dateDeclare;
    }

    public void setDateDeclare(Date dateDeclare) {
        this.dateDeclare = dateDeclare;
    }

    public Date getDateSinistre() {
        return dateSinistre;
    }

    public void setDateSinistre(Date dateSinistre) {
        this.dateSinistre = dateSinistre;
    }

    

    public String getLieuSinistre() {
        return this.lieuSinistre;
    }

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    public void setLieuSinistre(String lieuSinistre) {
        this.lieuSinistre = lieuSinistre;
    }

    public Integer getNumSinistre() {
        return this.numSinistre;
    }

    public void setNumSinistre(Integer numSinistre) {
        this.numSinistre = numSinistre;
    }

    public Integer getProvision() {
        return this.provision;
    }

    public void setProvision(Integer provision) {
        this.provision = provision;
    }

    public Integer getDommageCorps() {
        return this.dommageCorps;
    }

    public void setDommageCorps(Integer dommageCorps) {
        this.dommageCorps = dommageCorps;
    }

    public Integer getDommageMateriel() {
        return this.dommageMateriel;
    }

    public void setDommageMateriel(Integer dommageMateriel) {
        this.dommageMateriel = dommageMateriel;
    }

    public String getEtatAvance() {
        return this.etatAvance;
    }

    public void setEtatAvance(String etatAvance) {
        this.etatAvance = etatAvance;
    }

}

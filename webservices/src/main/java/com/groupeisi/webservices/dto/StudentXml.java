package com.groupeisi.webservices.dto;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class StudentXml implements Serializable{
    /** Nom de l'etudiant */
    @XmlElement(name = "nom", required = true)
    private String nom;
    /** Prenom de l'etudiant */
    @XmlElement(name = "prenom", required = true)
    private String prenom;
    /** Matricule de l'etudiant */
    @XmlElement(name = "matricule", required = true)
    private String matricule;
    /** NuméroTelephone de l'etudiant */
    @XmlElement(name = "numeroTelephone", required = true)
    private String numeroTelephone;

    public StudentXml() {
    }

    public StudentXml(String nom, String prenom, String matricule, String numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.numeroTelephone = numeroTelephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }
}

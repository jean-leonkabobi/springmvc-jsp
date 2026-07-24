package com.groupeisi.repository.entity;

public class StudentEntity {
    /** Nom de l'etudiant */
    private String nom;
    /** Prenom de l'etudiant */
    private String prenom;
    /** Matricule de l'etudiant */
    private String matricule;
    /** NuméroTelephone de l'etudiant */
    private String numeroTelephone;

    public StudentEntity() {
    }

    public StudentEntity(String nom, String prenom, String matricule, String numeroTelephone) {
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

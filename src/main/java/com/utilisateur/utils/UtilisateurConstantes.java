/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utilisateur.utils;

/**
 *
 * @author stage011
 */
public class UtilisateurConstantes {

    public static final String REQUEST_SELECT_TOUS_UTILISATEURS = "SELECT i FROM Identifiants i";
    public static final String REQUEST_SELECT_UTILISATEUR_LOGIN = "SELECT i FROM Identifiants i WHERE i.login=:idUtil";
    public static final String REQUEST_DELETE_UTILISATEUR = "DELETE FROM Identifiants i WHERE i.id=:idUtil";

    //MODE/TEXTE DU BOUTON
    public static final String OKBUTTON_BASE = "Ok";
    public static final String OKBUTTON_RECHERCHER = "Rechercher";
    public static final String OKBUTTON_MODIFIER = "Modifier";
    public static final String OKBUTTON_SUPPRIMER = "Supprimer";
    public static final String OKBUTTON_AJOUTER = "Ajouter";

    //MESSAGE :
    public static final String MESSAGE_NO_USER = "Aucun utilisateur à ce nom.";
    public static final String MESSAGE_NO_ADD = "Un utilisateur existe déjà à ce nom.";

}

# Jeu de la Vie en Java

Ce projet est une implémentation simple du **Jeu de la vie** en Java, affiché dans la console.  
Il s’agit d’un automate cellulaire où chaque cellule d’une grille peut être **vivante** (`X`) ou **morte** (`.`), et évolue à chaque génération selon des règles précises.

---

##  Règles du Jeu de la Vie

À chaque génération, pour chaque cellule de la grille :

1.  Une cellule vivante avec **2 ou 3 voisins vivants** reste vivante.  
2.  Une cellule vivante avec **moins de 2 voisins** meurt .  
3.  Une cellule vivante avec **plus de 3 voisins** meurt .  
4.  Une cellule morte avec **exactement 3 voisins vivants** devient vivante.  

---

##  Fonctionnalités

- Affichage de la grille dans la console (`X` pour une cellule vivante, `.` pour une cellule morte).  
- Mise à jour automatique toutes les 500 ms.  
- Conditions d’arrêt :  
  - Toutes les cellules mortes → arrêt.  
  - Toutes les cellules vivantes → arrêt.  

---

##  Installation et exécution

1. **Cloner le projet** :
   ```bash
   git clone https://github.com/votre-nom/jeu-de-la-vie-java.git
   cd jeu-de-la-vie
   
2. compiler le projet:
    ```bash
      javac jeu_de_la_vie.java
   
4. executer le projet:
   ```bash
    java jeu_de_la_vie

  ---

## REMARQUE  : VOUS AVEZ LA POSSIBILITE DE MODIFIER LES CELLULES VIVANTE PAR DEFAUT IL SUFFIT JUSTE D'ALLER DANS LE CONSTRUCTEUR ET CHANGER LES VALEURS DES LIGNE ET COLONE POUR CHAQUE CELLULE
<img width="343" height="98" alt="image" src="https://github.com/user-attachments/assets/aacc8378-d9c3-4200-8c5b-bb76d57b3414" />

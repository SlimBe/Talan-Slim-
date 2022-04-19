INSERT INTO `clients` (`ID_client`, `Nom_Client`, `Telephone`, `Abonnement`, `intérêt`) VALUES (NULL, 'slim', '52 861 592', 'Vip', 'sport,cinema,musique');

SELECT * FROM `clients`;

SELECT * FROM `produit`;

SELECT DISTINCT Type_Prod FROM produit; 

SELECT Type_Prod ,COUNT(*) FROM produit GROUP BY Type_Prod;

SELECT * FROM clients WHERE Nom_Client LIKE '%s%' ;

ALTER TABLE produit
ADD prix float;

UPDATE produit SET prix = 200;

SELECT nom_produit , Type_Prod , prix , Nom_Sup FROM produit , fournisseur
WHERE produit.Référence_prod_sup = fournisseur.ID_Sup;
 
SELECT Nom_Sup,Référence_prod_sup ,COUNT(*) FROM produit, fournisseur
WHERE produit.Référence_prod_sup = fournisseur.ID_Sup
GROUP BY Référence_prod_sup;

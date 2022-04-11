Public class Livre{
private String titre;
private String auteur;
private double prix;
private int nbPage;
private String genre;

Public livre(){
}

Public livre(String titre,String auteur,double prix,int nbPage,String genre){
this.titre=titre;
this.auteur=auteur;
this.prix=prix;
this.nbPage=npPage;
this.genre=genre;
}


public String getTitre(){
return titre;
}

public void setTitre(String titre){
this.titre=titre;
}


public String getAuteur(){
return auteur;
}

public void setAuteur(String auteur){
this.auteur=auteur;
}

public double getPrix(){
return prix;
}

public void setPrix(double prix){
this.prix=prix;
}

public int getNbPage(){
return nbPage;
}

public void setNbPage(int nbPage){
this.nbPage=nbPage;
}


public String getGenre(){
return genre;
}

public void setGenre(String genre){
this.genre=genre;
}



public void affiche(){

system.out.println(this.titre, this.auteur, this.prix, this.nbPage,this.genre);
}



}

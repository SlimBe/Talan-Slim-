Public  class Bd extends Livre{

private boolean couleur;
final String SENS= 'de gauche à droite';
Public Bd() {
super()
}

Public Bd(String titre,String auteur,double prix,int nbPage,String genre,boolean couleur){
super(titre,auteur,prix,nbPage,genre)
this.couleur=couleur;

}


public Boolean getCouleur(){
return couleur;
}
public void setCouleur(String couleur){
this.couleur=couleur;
}





public void affiche(){

system.out.println(this.titre, this.auteur, this.prix, this.nbPage,this.genre, this.couleur, this.SENS);
}



}

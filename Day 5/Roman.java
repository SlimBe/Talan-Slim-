Public class Roman extends Livre{
private int nbChaptire;
private String resume;

Public Roman(){
super()
}

Public Roman(String titre,String auteur,double prix,int nbPage,String genre,int nbChapitre,String resume){
super(titre,auteur,prix,nbPage,genre)
this.nbChaptire=nbChapitre;
this.resume=resume;
}

public int getNbChapitre(){
return nbChaptire;
}

public void setNbChaptire(int nbChaptire){
this.nbChaptire=nbChaptire;
}


public String getResume(){
return resume;
}

public void setResume(String resume){
this.resume=resume;
}




}
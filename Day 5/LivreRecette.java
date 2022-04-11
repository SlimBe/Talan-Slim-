Public class LivreRecette extends Livre{
Recette recette ;
ArrayList <Recette> listRecette;

Public LivreRecette(){
super()
}

Public LivreRecette (String titre,String auteur,double prix,int nbPage,String genre,Recette recette,ArrayList <Recette> listRecette){
super(titre,auteur,prix,nbPage,genre)
this.recette=recette;
this.listRecette=new ArrayList <Recette>();
}

public Recette getRecette(){
return recette;
}

public void setRecette(Recette recette){
this.recette=recette;
}


public ArrayList<Recette> getListRecette(){
return listRecette;
}

public void SetListRecette (ArrayList <Recette> listRecette){
this.listRecette=listRecette;
}








}
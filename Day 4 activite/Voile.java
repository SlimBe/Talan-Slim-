public class Voile{
public int largueur ;
private int longueur ; 
private int hauteur ; 
protected String couleur;
private boolean enroule;
private boolean deroule;
Private int id=6;

Voile(){
}

Voile(int largueur,int longueur,int hauteur,String couleur,boolean enroule,boolean deroule,int id){
this.largueur=largueur;
this.longueur=longueur;
this.couleur=couleur;
this.hauteur= hauteur;
this.enroule=enroule;
this.deroule=deroule;
this.id=id;
} 
public int getLargeur(){
return largeur;
}

public void setLargeur(int largeur){
this.largeur=largeur;
}

public int getLongueur(){
return longueur;
}

public void setLongueur(int longueur){
this.longueur=longueur;
} 

public int getHauteur(){
return hauteur;
}

public void setHauteur(int longueur){
this.hauteur=hauteur;
} 

public String getCouleur(){
return couleur;
}

public void setCouleur(String couleur){
this.couleur=couleur;
} 

public boolean getEnroule(){
return enroule;
}

public void setEnroule(boolean enroule){
this.enroule=enroule;
} 
 
 public int getDeroule(){
return Deroule;
}

public void seteDeroule (boolean deroule){
this.deroule=deroule;
} 
 
public int getId(){
return id;
}

public void setId (int id){
this.id=id;
} 



boolean enrouler(Boolean enroule){ 
return(!enroule);
}


boolean derouler(Boolean deroule){ 
return(!deroule);
}








}
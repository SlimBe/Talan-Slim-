public class Mat {

public int volume;
private String couleur;
private int id=5;

Mat(){
}

Mat(int volume,String couleur, int id ){
this.volume=volume;
this.couleur=couleur;
this.id=id
}
public int getVolume(){
return volume;
}

public void setVolume(int volume){
this.largeur=volume;
}

public String getCouleur(){
return couleur;
}

public void setCouleur(String couleur){
this.couleur=couleur;
}


public int getId(){
return id;
}

public void setId(int id){
this.id=id;
}

boolean test(Boolean test){ 
test=true;
return test;
}

}
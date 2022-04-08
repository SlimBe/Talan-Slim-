public class Pont {
Voile voile;
public int volume;
private String couleur;
private int id=4;

Pont(){
}

Pont(Voile voile,String couleur, int id){
this.voile=voile;
this.volume=volume;
this.couleur=couleur;
this.id=id;
}

public Voile getVoile (){
return voile ;
}

public void setVoile (Voile voile ){
this.voile =voile ;
}

public int getVolume (){
return volume ;
}

public void setVolume (int volume ){
this.volume =volume ;
}


public String getCouleur (){
return couleur ;
}

public void setCouleur (String couleur){
this.couleur =couleur ;
}

public int getId (){
return id ;
}

public void setId (int id){
this.id =id ;
}
boolean test(int a,int b){ 
int x=a+b;
return(x);
}
}
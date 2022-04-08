public class Bateau {
Coque coque;
Cabine cabine;
Pont pont;
Mat mat;
Public int id=1;
public int age;
public int volume;

Bateau() {

}
Bateau (Coque coque, Cabine cabine, Pont pont,Mat mat, int id, int age, int volume) {
this.coque=coque;
this.cabine=cabine;
this.pont=pont;
this.mat=mat;
this.age=age;
this.volume=volume;
this.id=id;
}
public Coque getCoque(){
return coque;
}

public void setCoque(Coque coque){
this.coque=coque;
}

public Cabine getCabine(){
return cabine;
}

public void setCabine(Cabine cabine{
this.cabine=cabine;
}

public Cabine getPont(){
return pont;
}

public void setPont(Pont pont{
this.pont=pont;
}

public int getAge(){
return age;
}

public void setAge(int age){
this.age=age;
}


public int getVolume(){
return volume;
}

public void setVolume(int volume){
this.volume=volume;
}

public int getId(){
return id;
}

public void setId(int id){
this.id=id;
}

public Mat getMat(){
return mat;
}

public void setMat(Mat mat){
this.mat=mat;
}



public String toString(Bateau bateau) {
		return "Le bateau n° " + bateau.getId() + " est constitué de: \n" + "La coque n° " + 
	bateau.getCoque().getId() + "\n La cabine n° " + bateau.getCabine().getIdC() + "\n Le pont n° " + bateau.getPont().getId()
	+ " est constitué de la Voile N° " + bateau.getPont().getVoile().getId() +" \n le Mat n°"+ bateau.getMat().getId(); 
	}


boolean test(Boolean test){ 
return(true);
}
} 

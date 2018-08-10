
package persona;
import java.util.Random;

public class Person {
    private String nombre;

private int edad;

private int DNI;

private String sexo;

private float peso;

private float altura;

float IMC;
int a;
boolean d;
String pvto;

public Person(String nomb, int age, int ID, String sex, float masa,float alto){

nombre=nomb;

edad=age;

DNI=ID;

sexo=sex;

peso=masa;

altura=alto;

}

public Person(){

this.nombre="Lancelot";

this.edad=17;

this.DNI=20180309;

this.sexo="H";

this.peso=59;

this.altura= (float) 1.63;

}

public void setNombre(String nomb){

nomb=nombre;

}

public String GetNombre(){

return nombre;

}

public void setEdad(int age){

age=edad;

}

public int getEdad(){

return edad;

}

public void SetDNI(int ID){

ID=DNI;

}

public int getDNI(){

return DNI;

}

public void setSexo(String sex){

sex=sexo;

}

public String getSexo(){

return sexo;

}

public void setPeso(float masa){

masa=peso;

}

public float getPeso(){

return peso;

}

public void setAltura(float alto){

alto=altura;

}

public float getAltura(){

return altura;

}


public float calcularIMC(float alto, float masa){

IMC=peso/(altura*altura);

if (IMC<20)
{
a=-1;
}
else{
if (IMC>=20 && IMC<=25){
a=0;
}
else{
     a=1;
}
}
return a;
}
public void esMayorDeEdad(){
    if(edad>17){
        d=true;
    }else{
        d=false;
    }
}
public void comprobarSexo(char sexo){
    if(sexo != 'H' && sexo != 'M' ){
        sexo='H';
    }
    
}
    public String ToString(){
    pvto=("Nombre: "+nombre+"\nEdad:"+edad+"vDNI: "+DNI+"\nSexo: "+sexo+"\nPeso(pinche gordo): "+peso+"\nAltura: "+altura);
    return pvto;
}
    Random r1 =  newRandom();
}

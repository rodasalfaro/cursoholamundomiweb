public class Main {

    public static void main(String[] args) {
        Coche miCarro = new Coche();

        miCarro.SumarPuerta();
        miCarro.SumarPuerta();
        System.out.println(miCarro.puerta);


        //Seccion de llamada de funcion suma de 3 variables por medio de paso por valor
        sumafunc(10,20,30);

    }

    //Seccion del codigo de la funcion de suma de tres variables
    public static void sumafunc(int val1, int val2, int val3){
        int sumaresultado;
        sumaresultado = val1+val2+val3;

        System.out.println(sumaresultado);
    }
}
//Clase Coche
class Coche{
    public int puerta = 0;

    public void SumarPuerta(){
        this.puerta++;
    }
}
    

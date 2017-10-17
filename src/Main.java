/**
 * Created by ahmed Saadi on 12/10/2017.
 */
public class Main {

    //private int n = 10 ;

    public static void main(String[] args){

        int v1[] = {5,7,2,1,-20};

        //System.out.print(v1[4]);
        int v2[] = {13,-7,3,-1,2,8};

        VectorHelper vH = new VectorHelper();

        vH.inverserVecteur(v1);

        int v3[] ;
        try{
            v3 = vH.sommeDeuxVecteurs(v1,v2);
            vH.afficherVector(v3);
        }
        catch(SommeVecteursException e){

        }





    }
}

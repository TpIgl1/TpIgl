/**
 * Created by ahmed Saadi on 12/10/2017.
 */
public class Main {

    //private int n = 10 ;

    public static void main(String[] args){

        int v1[] = {5,7,2,1,-20};

        //System.out.print(v1[4]);
        int v2[] = {13,-7,3,-1,2};

        VectorHelper vH = new VectorHelper();

        System.out.println("\n\nV2 avant inverser ");
        vH.afficherVector(v2);
        vH.inverserVecteur(v2);
        System.out.println("\n\nV2 apres inverser ");
        vH.afficherVector(v2);

        int v3[] ;
        try{
            v3 = vH.sommeDeuxVecteurs(v1,v2);
            System.out.println("\n\nV3  ");
            vH.afficherVector(v3);
            System.out.println("\n\n V1 ");
            vH.afficherVector(v1);
            System.out.println("\n\nV1 apres mod2 ");
            vH.vecteurModDeux(v1);
            vH.afficherVector(v1);

        }
        catch(SommeVecteursException e){

        }





    }
}

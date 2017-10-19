/**
 * Created by ahmed Saadi on 17/10/2017.
 */
public class VectorHelper {


    public void TrierVecteur(int[] v){
        //Cette méthode permet de tier les elements d'un vecteur (la methode utilisé est la methode de transpositon)
        for(int i=0;i<v.length;i++){
            int j=i;
            while ((v[j] > v[j+1]) && (j >= 0)){
                int tmp ; //Variable temporaire utilisé pour la permutation
                tmp = v[j];
                v[j] = v[j+1]; //on permute v[j] avec v[j+1]
                v[j+1]= tmp ;
                j--; //on décremente le j
            }
        }
    }


    public int[] sommeDeuxVecteurs(int[] v1, int[] v2) throws SommeVecteursException{
        //Cette méthode permet de sommer les element de deux vecteur, et retourne une exception s'ils sont de taille différente
        int[] v3 = null ;

        if(v1.length!=v2.length){
            throw  new SommeVecteursException(); //ici on declenche l'exception
        }else{
            for(int i=0;i<v1.length;i++){
                v1[i] = v1[i] + v2[i];
            }
            v3 =v1 ;
        }
        return v3 ;
    }

    public void afficherVector(int[] v){
        for(int i=0;i<v.length;i++){
            System.out.print(" "+v[i]+", ");
        }
    }

    public void inverserVecteur(int[] v){
        for(int i=0;i<(v.length/2);i++){
            int tmp ;
            tmp = v[(v.length-1)-i];
            v[(v.length-1)-i] = v[i] ;
            v[i] = tmp ;
        }
    }

    public void vecteurModDeux(int[] v){
        for(int i=0;i<v.length;i++){
            v[i] /= 2 ;
        }
    }
}

public class SelectionSort {
    int i, j, menor, troca;
    public void sort(int vetor[]){
        for(i=0; i< vetor.length-1; i++){
            menor = i;
            for(j=i+1; j<vetor.length; j++){
                if(vetor[j] < vetor[menor]){
                    menor = j;
                }
            }

            if(i!=menor){
                troca = vetor[i];
                vetor[i] = vetor[menor];
                vetor[menor] = troca;
            }
        }
    }
}

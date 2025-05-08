public class Ordenadora {
    // Devuelve el índice donde está el mínimo partiendo de un índice
    private static int inMin(int indiceInicial,Comparable[] array){
        Comparable min = array[indiceInicial];
        int iMin = indiceInicial;
        for (int i = indiceInicial + 1; i < array.length; i++) {
            if (array[i].compareTo(min) < 0) {
                min = array[i];
                iMin = i;
            }
        }
        return iMin;
    }

    public static void ordenar(Comparable[] array){
        Comparable aux;
        int iMin;
        for (int i = 0; i < array.length; i++) {
            iMin = inMin(i, array);
            // Intercambiar array[i] con array[iMin]
            aux = array[i];
            array[i] = array[iMin];
            array[iMin] = aux;
        }
    }
}

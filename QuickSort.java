public class QuickSort {

    static void qsort(char[] items){
        qs(items, 0, items.length - 1);
    }

    private static void qs(char[] items, int left, int right){
        int i, j = left;
        int divElIndex = (left + right) / 2;
        char changeVar;
        char divEl = items[divElIndex];
        changeVar = items[divElIndex];
        items[divElIndex] = items[right];
        items[right] = changeVar;
        for (i = left; i < right; i++){
            if(items[i] < divEl){
                changeVar = items[i];
                items[i] = items[j];
                items[j] = changeVar;
                j++;
            }
        }
        items[right] = items[j];
        items[j] = divEl;
        if(left < j -1){
            qs(items, left, j - 1);
        }
        if(right > j + 1){
            qs(items, j + 1, right);
        }

    }

}

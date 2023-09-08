public interface Series {

    int getNext();

    default int[] getNextArray(int n){
        return getArray(n);
    }

    default int[] skipAndGetNextArray(int skip, int n){
        //skipping necessary number of elements
        getArray(skip);
        return getArray(n);
    }


    private int[] getArray(int n){
        int[] vals = new int[n];
        for(int i = 0; i < n; i++)
            vals[i] = getNext();
        return vals;
    }

    void reset();

    void setStart(int s);
}

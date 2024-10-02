public class Max_heap {
    public static int[] H = new int[100];
    public static int s = -1;
    static int parent(int i){
        return (i-1)/2;
    }
    static int leftChild(int i){
        return (2*i + 1);
    }
    static int rightChild(int i){
        return (2*i + 2);
    }
    static void shiftUp(int i){
        while(i > 0 && H[parent(i)] < H[i]){
            // swap(H[parent(i)], H[i]);
            int temp = H[i];
            H[i] = H[parent(i)];
            H[parent(i)] = temp;
            i = parent(i);
        }
    }
    static void shiftDown(int i){
        int maxIndex = i;
        int l = leftChild(i);
        int r = rightChild(i);
        if(l<= s && H[l] > H[maxIndex]){
            maxIndex = l;
        }
        if(r<=s && H[r] > H[maxIndex]){
            maxIndex = r;
        }
        if(maxIndex != i){
            // swap(H[maxIndex], H[i]);
            int temp = H[i];
            H[i] = H[maxIndex];
            H[maxIndex] = temp;
            shiftDown(maxIndex);
        }
    }
    static void insert(int ele){
        s = s+1;
        H[s] = ele;
        shiftUp(s);
    }
    static int getMax(){
        if(s == -1){
            System.out.println("No element in the Heap.");
        }
        return H[0];
    }
    static int extractMax(){
        int result = H[0];
        H[0] = H[s];
        s = s-1;
        shiftDown(0);
        return result;
    }
    static void remove(int i){
        H[i] = getMax() + 1;
        shiftUp(i);
        extractMax();
    }
    static void printHeap(){
        for(int i=0;i<=s;++i){
            System.out.print(H[i]+" ");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        Max_heap m = new Max_heap();
        m.insert(3);
        m.insert(4);
        m.insert(10);
        m.insert(5);
        m.insert(12);
        // m.printHeap();
        m.remove(4);
        m.printHeap();
    }
}
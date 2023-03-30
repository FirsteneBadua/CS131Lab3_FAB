package arraylist;

public class ArrayList<T> {

    private final int DEFAULT_SIZE=10;
    private int currentItem=0;
    private T arList[];

    @SuppressWarnings("unchecked")
    public ArrayList()
    {
        arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

    @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
        arList=(T[]) new Object[length];
    }//end preferred constructor

    public boolean addItem(T item)
    {
        if (currentItem < arList.length) {
            arList[currentItem] = item;
            currentItem++;
            return true;
        } else {
            return false;
        }
    }//end addItem method

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentItem; i++) {
            sb.append(arList[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }//end toString method
	
}//end class

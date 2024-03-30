public class Cart {
    public static final int max= 100;
    private DigitalVideoDisc itemOrder[] = new DigitalVideoDisc[max];
    private int qtyOrdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == max){
            System.out.println("The cart is full.");
        }
        else{
            itemOrder[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if(itemOrder[i] == disc) {
                System.out.println("The disc " + disc.getTitle() + " has been removed.");
                for (int j = i; j < qtyOrdered - 1; j++)
                    itemOrder[j] = itemOrder[j + 1];
                itemOrder[qtyOrdered - 1] = null;
                qtyOrdered--;
                return;
            }
        }
        System.out.println("The disc " + disc.getTitle() + " is not found.");
    }
    public float totalCost(){
        float s = 0;
        for(int i = 0; i < qtyOrdered; i++){
            s+=itemOrder[i].getCost();
        }
        return s;
    }
}
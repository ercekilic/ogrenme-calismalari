public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }
        else this.tonerLevel=-1;

        this.duplex=duplex;
    }

    public int addToner(int tonerAmount){
            if (tonerLevel==-1) return -1;
            if(tonerAmount<=0){
                return -1;
            }
            if(tonerAmount>=100){
                return -1;
            }
            if(tonerAmount+tonerLevel>100){
                return -1;
            }
            tonerLevel=tonerAmount+tonerLevel;
            return tonerLevel;


    }
    public int printPages(int pagesToPrint){
        if(duplex){
            System.out.println("Printing in duplex mode");
            pagesPrinted = (pagesToPrint/2)+(pagesToPrint%2) +pagesPrinted;
            return  (pagesToPrint/2)+(pagesToPrint%2);
        }
        else {
            pagesPrinted= pagesToPrint + pagesPrinted;
            return pagesToPrint;
        }


    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }

}

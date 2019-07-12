package main.java.com.stackroute.challenge;

public class Printer {
    private int tonerLevel;
    private int printedPages;
    private boolean isDuplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPrintedPages() {

        return printedPages;
    }
    public void setPrintedPages(int printedPages) {
        this.printedPages = printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >- 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.printedPages = printedPages;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount >0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int print(int pages) {
        int pagesToPrint = pages;
        if (this.isDuplex) {
            pagesToPrint /= 2;
            System.out.println("Printing in duplex mode.");
        }
        this.printedPages += pagesToPrint;
        return pagesToPrint;
    }


}

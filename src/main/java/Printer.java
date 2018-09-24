public class Printer {

    private int paperCount;
    private int tonerVolume;

    public Printer(int paperCount, int tonerVolume) {
        this.paperCount = paperCount;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
        if (totalPages <= paperCount){
            this.paperCount -= totalPages;
            this.tonerVolume -= totalPages;
        }
    }

    public void refillPaper(int aNum){
        this.paperCount += aNum;
    }

}

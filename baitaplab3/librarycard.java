package baitaplab3;

public class librarycard {

    private long lbCode;
    private String owner;
    private int borrowCount;

    public librarycard() {
    }

    public librarycard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }

    public long getLbCode() {
        return lbCode;
    }

    public String getOwner() {
        return owner;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setLbCode(long lbCode) {
        this.lbCode = lbCode;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void checkOut(int num) {

    }

    @Override
    public String toString() {
        return "librarycard{" + "lbCode=" + lbCode + ", owner=" + owner + ", borrowCount=" + borrowCount + '}';
    }

    
}
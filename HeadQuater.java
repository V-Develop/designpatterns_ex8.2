public class HeadQuater extends Source {

    private String result;

    // public void setResult(String result) {
    //     this.result = result;
    //     notifyObservers();
    // }

    public void setResult(String result) {
        this.result = result;
        notifyObservers();
    }

    public String getResult() {
        return this.result;
    }

}
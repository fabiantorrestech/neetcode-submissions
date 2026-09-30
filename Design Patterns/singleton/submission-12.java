static class Singleton {

    private static Singleton s = null; // must be private static because only Singleton class can access these.
    private String value = null;

    private Singleton() { // empty contructor, not exposed to outside.

    }

    public static Singleton getInstance() { // how outside interacts with singleton.
        if(s == null){
            s = new Singleton();
        }
        return s;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
}

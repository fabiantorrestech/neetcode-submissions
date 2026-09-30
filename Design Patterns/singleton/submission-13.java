static class Singleton {
    private String value = null;
    private static Singleton s = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(s==null){
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

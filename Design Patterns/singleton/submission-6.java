static class Singleton {

    private static Singleton s = null;
    private static String value = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(s == null){
            s = new Singleton();
        }
        return Singleton.s;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        Singleton.value = value;
    }
    
}

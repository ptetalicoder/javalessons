import pack.Protected;

public class SubClassofProtected  extends Protected {
    public SubClassofProtected(String proString, int proInt){
        super(proString, proInt);
    }

    public static void main(String[] args) {
        SubClassofProtected subClassofProtected = new SubClassofProtected("This is protected String", 200);
        System.out.println(subClassofProtected.proString);
        System.out.println(subClassofProtected.proInt);
    }

}

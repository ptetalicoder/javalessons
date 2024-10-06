package pack;

public class InnerAccessModifiers {
    public static void main(String[] args) {
        Public publicObject = new Public("This is public string", 100);
        // below can run becuse even though it is in a package it is accessable becuase it is a public file
        System.out.println(publicObject.someString);
        System.out.println(publicObject.someInt);

        Protected proObj = new Protected("this is protected", 100);
        // below wont work because access Modifiers file is not in the same package as protected
        System.out.println(proObj.proString);
        System.out.println(proObj.proInt);

        Default defObj = new Default("this is default", 500);
        System.out.println(defObj.defString);
        System.out.println(defObj.defInt);

        Private priObj = new Private("this is private", 600);
        // this will not work because it is private so it will not work in either inner or outer
//        System.out.println(priObj.priStr);
//        System.out.println(priObj.priInt);

    }
}
// this works because this file is in the same package as protected, so the protected data file can be accessed
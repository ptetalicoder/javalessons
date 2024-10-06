package week1;//import pack.Default;
import pack.Private;
import pack.Protected;
import pack.Public;

public class OuterAccessModifiers {
    /* 4 access modifiers which control where resources can be accessed
        -public: anywhere in code
        -protected: anywhere in same package or sub class
        -default: anywhere in same package
        -private: referenced in the same class
     */

    public static void main(String[] args) {
        Public publicObject = new Public("This is public string", 100);
        // below can run becuase even though it is in a package it is accessable becuase it is a public file
        System.out.println(publicObject.someString);
        System.out.println(publicObject.someInt);

        Protected proObj = new Protected("this is a protected string", 100);
        // below wont work because access Modifiers file is not in the same package as protected
//        System.out.println(proObj.proString);
//        System.out.println(proObj.proInt);

//        Default defObj = new Default("this is default", 500);
//         this will not work because default is not public
//        System.out.println(defObj.defString);
//        System.out.println(defObj.defInt);

        Private priObj = new Private("this is private", 600);
        // this will not work because it is private so it will not work in either inner or outer
//        System.out.println(priObj.priStr);
//        System.out.println(priObj.priInt);

    }
}

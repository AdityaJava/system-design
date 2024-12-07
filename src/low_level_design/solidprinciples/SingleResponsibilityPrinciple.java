package low_level_design.solidprinciples;

// Definition: A class should have only 1 reason to change that is the class should have only one responsibility


class Marker {
    String name;
    String color;
    int year;
    int price;
    //constructor and getter and setter
}


//WRONG Working Start
//This entity has HAS-A relation with Marker
/*
This is not following single responsibility principle because it can change more than 1 method
 1. Suppose we introduce GST then calculateTotal will change as we need Tax calculation there
 2. We can also change printing logic
 3. We can also change saveToDB to saveToFile
 */
class InvoiceWrong {
    private Marker marker;
    private int quantity;
    //constructor and getter and setter

    public int calculateTotal() {
        return marker.price * this.quantity;
    }

    public void printInvoice() {
        //print  invoice
    }

    public void saveToDB() {
        //saveToDB
    }
}
//WRONG Working End


//Below is the correct working
//We created separate classes for methods which will change

//Correct Working start
class InvoiceCorrect {
    private Marker marker;
    private int quantity;
    //constructor and getter and setter

    public int calculateTotal() {
        return marker.price * this.quantity;
    }
}

class InvoicePrinter {
    private InvoiceCorrect invoiceCorrect;

    public void printInvoice() {
        //print  invoice
    }
}

class InvoiceDao {
    InvoiceCorrect invoiceCorrect;

    public void saveToDB() {
        //saveToDB
    }
}
//Correct Working End


/*
 With this we've achieved following
 1. Easy to Maintain :- We will change only single class at a time
 2. Easy to understand :-
 */

public class SingleResponsibilityPrinciple {


}

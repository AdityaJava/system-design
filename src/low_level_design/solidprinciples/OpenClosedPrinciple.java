package low_level_design.solidprinciples;

//Definition:- Open for extension but closed for modification

//----Wrong working start

//Now this below class is Tested and is on production and taking live traffic
class InvoiceDao1 {
    InvoiceCorrect invoiceCorrect;

    public void saveToDB() {
        //saveToDB
    }
}

//Now we change above class to below
//Though here the name is different because we can't define class with same name but imagine it to be a same class that is InvoiceDao1 and InvoiceDao2 are same
class InvoiceDao2 {
    InvoiceCorrect invoiceCorrect;

    public void saveToDB() {
        //saveToDB
    }

    public void saveToFile() {
        //Save to file
    }
}
//So above is not following open/closed principle
//----Wrong working End

//----Correct working start
interface InvoiceDaoInterface {
    public void save(InvoiceCorrect invoiceCorrect);
}

class SQLDatabaseInvoiceDao implements InvoiceDaoInterface {

    @Override
    public void save(InvoiceCorrect invoiceCorrect) {
        //Save To DB
    }
}

class MongoDatabaseInvoiceDao implements InvoiceDaoInterface {

    @Override
    public void save(InvoiceCorrect invoiceCorrect) {
        //Save To DB
    }
}


class FileInvoiceDao implements InvoiceDaoInterface {

    @Override
    public void save(InvoiceCorrect invoiceCorrect) {
        //Save To File
    }
}
//----Correct working end


public class OpenClosedPrinciple {
}

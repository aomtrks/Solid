interface Print{
    void print();
}

interface Scan{
    void scan();
}

interface Fax{
    void fax();
}

class SimplePrinter implements Print{
    public void print() { System.out.println("Printing..."); }
}
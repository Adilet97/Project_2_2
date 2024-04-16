public class Microsoft extends Corporation implements Printable{
    public String subsidiaries;

    public Microsoft(String founder, String subsidiaries) {
        super(founder);
        this.subsidiaries = subsidiaries;
    }


    @Override
    public void print() {
        System.out.println("Founder: " + founder);
        System.out.println("Subsidiaries: " + subsidiaries);
    }
}

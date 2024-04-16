public class Google extends Corporation implements Printable{
    public String services;

    public Google(String founder, String services) {
        super(founder);
        this.services = services;
    }


    @Override
    public void print() {
        System.out.println("Founder: " + founder);
        System.out.println("Services: " + services);
    }

}

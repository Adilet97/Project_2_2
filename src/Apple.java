public class Apple extends Corporation implements Printable{
    public String industry;


    public Apple(String founder, String industry) {
        super(founder);
        this.industry = industry;
    }


    @Override
    public void print() {
        System.out.println("Founder: "+ founder);
        System.out.println("Industry: " + industry);
    }
}

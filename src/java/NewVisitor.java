package java;

public class NewVisitor extends Prac{
    int acpt = 1;
    String name = "Aya";

    @Override
    public String vName(String name){
        this.name = name;
        return super.vName(name);
    }
    @Override
    public int accept(int acpt) {
        this.acpt = acpt;
        return super.accept(acpt);
    }

    public static void main(String[] args) {

        Prac run = new NewVisitor() {
            @Override
            public String vName(String name) {
                return super.vName(name);
            }
        };
        System.out.println(run);
    }

}

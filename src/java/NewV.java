package java;

public class NewV extends Prac2{

        int acpt = 1;
        String name = "Aya";


        @Override
        public String vName(String namex){
            this.name = namex;
            return super.vName(name);}

        @Override
        public int accept(int acpt) {
            this.acpt = acpt;
            return super.accept(acpt);
        }
}

package java;

class  NewV {}
interface ColorInter{
    String color();
}

class Deco implements ColorInter{
    @Override
    public String color() {
        return "Color me";}
}

abstract class ReturnColor implements ColorInter{

    private ColorInter colorInterface;

    public ReturnColor(ColorInter interF) {}
    @Override
    public String color(){
        return colorInterface.color();}
}

class AddColor extends ReturnColor {

    public AddColor(ColorInter interF) {
        super(interF);}

    public String color() {
        return super.color() + addRed();}

    private String addRed() {
        return " with Red";}
}

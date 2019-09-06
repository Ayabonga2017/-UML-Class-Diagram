package java;

interface DecoInter{
    String decorate();
}

class PlainHouse implements DecoInter{
    @Override
    public String decorate() {
        return "Decorate";}
}

abstract class DecoHouse implements DecoInter{

    private DecoInter decoInterface;

    public DecoHouse(DecoInter interF) {}

    public String decorate(){
        return decoInterface.decorate();}
}

class AddPaint extends DecoHouse {

    public AddPaint(DecoInter interF) {
        super(interF);}

    public String decorate() {
        return super.decorate() + paintRed();}

    private String paintRed() {
        return " with a red paint";}
}
class AddLights extends DecoHouse {

    public AddLights(DecoInter interF) {
        super(interF);}

    public String decorate() {
        return super.decorate() + addLights();}

    private String addLights() {
        return " with lights";}
}
class AddDoor extends DecoHouse {

    public AddDoor(DecoInter interF) {
        super(interF);}

    public String paint() {
        return super.decorate() + glassDoor();}

    private String glassDoor() {
        return " with a glass door";}
}
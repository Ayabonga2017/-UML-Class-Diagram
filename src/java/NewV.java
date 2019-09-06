package java;

class  NewV {}
interface PaintInter{
    String paint();
}

class PlainHouse implements PaintInter{
    @Override
    public String paint() {
        return "Paint me";}
}

abstract class PaintHouse implements PaintInter{

    private PaintInter paintInterface;

    public PaintHouse(PaintInter interF) {}

    public String paint(){
        return paintInterface.paint();}
}

class RedPaint extends PaintHouse {

    public RedPaint(PaintInter interF) {
        super(interF);}

    public String paint() {
        return super.paint() + paintRed();}

    private String paintRed() {
        return " with Red";}
}
class PinkPaint extends PaintHouse {

    public PinkPaint(PaintInter interF) {
        super(interF);}

    public String paint() {
        return super.paint() + paintPink();}

    private String paintPink() {
        return " with Pink";}
}
class BluePaint extends PaintHouse {

    public BluePaint(PaintInter interF) {
        super(interF);}

    public String paint() {
        return super.paint() + paintPink();}

    private String paintPink() {
        return " with Blue";}
}
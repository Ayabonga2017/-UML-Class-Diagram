package java;

class  NewV {
    interface Paint {
        String colorMe();
    }

    public class Decorator implements Paint {

        String color = "Colour me !!";

        @Override
        public String colorMe() {
            return color;
        }
    }

    public abstract class Colors implements Paint {
        Paint p;
        Decorator d;
        @Override
        public String colorMe() {
            return p.colorMe(); }
    }
    public class RedPaint extends Colors {

        public RedPaint() {
            d.color = "Red paint";}

        public String paintMe() {
            return RedPaint.super.p.colorMe(); }
    }
}
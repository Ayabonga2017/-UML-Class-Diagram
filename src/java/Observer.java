package java;

class Game {

    public String registerFan() {
        return "Fan registered"; }

    public boolean scored() {
        return true; }

    public String unRegisterFan() {
        return "Fan has been Unregistered"; }

    public String notifyFan() {
        return "You have a notification"; }

    public String update() {
        return "Your update"; }
}

class Observer extends Game {

    Game gameInfo;

    String  getRegFan(){
        return gameInfo.registerFan();}

    String  getUpdate(){

        if(gameInfo.scored() == true){
            gameInfo.update();
            return gameInfo.notifyFan();
        }else{
            return "No goal yet !!";}}
}

class FanA extends Observer{

    public String update() {
        return getUpdate();}
}

class FanB extends Observer {
    public String update() {
        return getUpdate();}
}

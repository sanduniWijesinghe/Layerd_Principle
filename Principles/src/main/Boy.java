package main;

public class Boy implements DI {

    SuperGirl g;



    public static void main(String[] args) {


        Boy boy = new Boy();
        boy.inject((SuperGirl) new Girl());
        boy.chatWithGirl();

    }

    public void chatWithGirl() {

        g.chat();

    }

    //interface through injection
    @Override
    public void inject(SuperGirl girl) {
        this.g = girl;
    }
}

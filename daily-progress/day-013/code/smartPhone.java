package code;

public class smartPhone implements camera, Musicplayer, StaticMethodsInterface{

    @Override
    public void playMusic() {
        System.out.println("Playing Music...");
    }

    @Override
    public void camera() {
        System.out.println("Photo Captured...");
    }

    @Override
    public void cameraDetails() {
        camera.super.cameraDetails();
        System.out.println("-------------------------");
    }
}

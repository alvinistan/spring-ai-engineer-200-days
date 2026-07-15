package code;

public interface camera {
    void camera();


    default void cameraDetails(){
        System.out.println("______________________");
        System.out.println("Camera High Quality 16px");
    }
}

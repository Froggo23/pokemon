package animal;

public interface Food {

    void getFried();
    default void getBoiled(){
        System.out.println("afaaysaaaadafahda!!");
    }
}

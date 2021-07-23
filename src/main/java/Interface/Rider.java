package Interface;

public interface Rider<SomeTypeOfRideable extends Rideable> {
    public void mount(SomeTypeOfRideable rideable);
    public  void  disMount();
}

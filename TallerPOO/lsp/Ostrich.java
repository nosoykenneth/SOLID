package lsp;

/**
 *
 * @author nicko
 */
public class Ostrich extends FlyingBird {
    
    @Override
    void eat() {
        System.out.println("Ostrich eating");
    }

    @Override
    void fly() {
        System.out.println("Ostriches can't fly");
    }
    
}

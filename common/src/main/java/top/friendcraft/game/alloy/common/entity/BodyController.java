package top.friendcraft.game.alloy.common.entity;

import top.friendcraft.game.alloy.core.api.Manager;

import java.util.function.Supplier;

public class BodyController implements Manager<Body> {
    public static BodyController getFromSupplier(Supplier<Body> bodySupplier){
        return (BodyController)bodySupplier;
    }
    @Override
    public Body get() {
        return null;
    }
}

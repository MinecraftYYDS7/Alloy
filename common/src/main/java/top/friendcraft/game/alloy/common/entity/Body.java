package top.friendcraft.game.alloy.common.entity;

import net.minecraft.resources.ResourceLocation;
import top.friendcraft.game.alloy.AlloyModLoader;
import top.friendcraft.game.alloy.core.init.IAlloyRegistry;

public class Body implements IAlloyRegistry {
    Properties properties;

    @Override
    public ResourceLocation getID() {
        return properties.ID();
    }

    static class Properties extends top.friendcraft.game.alloy.core.api.Properties {
        private final BodyArea X;
        private final BodyArea F;
        private final BodyArea S;
        private final BodyArea E;
        private final BodyArea Z;
        private final BodyArea H;
        public static final String ID_CHEST = "X";
        public static final String ID_ABDOMEN = "F";
        public static final String ID_SKIN = "S";
        public static final String ID_HEAD = "H";
        public static final String ID_EXTENDS = "E";
        public static final String ID_LIMBS = "Z";

        private Properties(ResourceLocation res, BodyArea x, BodyArea f, BodyArea s, BodyArea e, BodyArea z, BodyArea h) {
            super(res);
            X = x;
            F = f;
            S = s;
            E = e;
            Z = z;
            H = h;
        }

        public BodyArea getX() {
            return X;
        }
        public BodyArea getF() {
            return F;
        }
        public BodyArea getS() {
            return S;
        }
        public BodyArea getE() {
            return E;
        }
        public BodyArea getZ() {
            return Z;
        }
        public BodyArea getH() {
            return H;
        }

        static class Builder {
            private BodyArea X;
            private BodyArea F;
            private BodyArea S;
            private BodyArea E;
            private BodyArea Z;
            private BodyArea H;
            private ResourceLocation res;

            public Builder(String ID) {
                res = new ResourceLocation(AlloyModLoader.MOD_ID, ID);
            }

            public Builder setBodyAreas(BodyArea n, String bodyArea) {
                switch (bodyArea) {
                    case "X" -> X = n;
                    case "F" -> F = n;
                    case "S" -> S = n;
                    case "E" -> E = n;
                    case "Z" -> Z = n;
                    case "H" -> H = n;
                    default -> {throw new Error("Body Area ID Not Found");}
                }
                return this;
            }

            public Properties build() {
                return new Properties(res, X, F, S, E, Z, H);
            }
        }
    }
}

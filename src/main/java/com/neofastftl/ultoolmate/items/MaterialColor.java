package com.neofastftl.ultoolmate.items;

public enum MaterialColor {
    END_STONE(0xEEEFA9),
    NETHERRACK(0x723232),
    COPPER(0xE77C56),
    AMETHYST(0xC992F7),
    FLINT(0x454343),
    BRONZE(0xD58E49),
    WROUGHT_IRON(0xCEB6A7),
    STEEL(0xA3A3A3),
    CAST_IRON(0x5E5E5E),
    STAINLESS_STEEL(0xD1D1D1),
    TITANIUM(0xC5C5E0),
    TUNGSTEN_CARBIDE(0x404040),
    INCONEL(0x9AA9A9),
    HAFNIUM_CARBIDE(0x5A5340),
    GRAPHENE_STEEL(0x202020),
    CERMET(0xA08070),
    MARAGING_STEEL(0xB0A0C0);

    private final int color;

    MaterialColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }
}

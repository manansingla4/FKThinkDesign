package Chapter2;

class Gear {
    private int chainRing;
    private int cog;

    Gear(int chainRing, int cog, int rim, double tire) {
        this.chainRing = chainRing;
        this.cog = cog;
    }

    int ratio() {
        return chainRing/cog;
    }
}

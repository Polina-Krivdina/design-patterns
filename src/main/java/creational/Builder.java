package creational;

class House {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final boolean hasGarage;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;

    private House(Builder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public Builder foundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public Builder structure(String structure) {
            this.structure = structure;
            return this;
        }

        public Builder roof(String roof) {
            this.roof = roof;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder hasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}


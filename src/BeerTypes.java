/**
 * Created by mikhails on 28.09.2016
 */
public class BeerTypes {
    enum TYPE {
        LAGER, STOUT,
    }

    enum BEER {
        HEINEKEN (TYPE.LAGER, 5.0),
        GUINESS (TYPE.STOUT, 4.2),
        CORONA (TYPE.LAGER, 4.6),
        BUDWEISER (TYPE.LAGER, 5.0);

        BEER(TYPE type, double alcohol) {
            this.alcohol = alcohol;
            this.type = type;
        }

        private TYPE type;
        private double alcohol;

        public TYPE getType() {
            return type;
        }

        public double getAlcohol() {
            return alcohol;
        }
    }

    public static void main(String[] args) {
        for (BEER item : BEER.values()) {
            System.out.println(String.format("Name: %s, type: %s, content of alcohol: %s",
                    item, item.getType(), item.getAlcohol()));
        }
    }
}

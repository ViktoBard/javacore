package com.kitcenter.app.classwork.lesson8;

/**
 * Created by Viktor on 17.05.2017.
 */
public class Flat {
        public String adress = "ul. Milutenko";

        public Flat(String adress) {
                this.adress= adress;
        }

        @Override
        public String toString() {
                return "Flat{" +
                        "adress='" + adress + '\'' +
                        '}';
        }
}

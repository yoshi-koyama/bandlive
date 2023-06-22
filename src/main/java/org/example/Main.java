package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // バンド情報を標準出力する
        Band band1 = Band.newInstance(1, "ASIAN KUNG-FU GENERATION", 4);
        Band band2 = Band.newInstance(2, "UNISON SQUARE GARDEN", 3);
        Band band3 = Band.newInstance(3, "Rhythmic Toy World", 4);

        List<Band> bandList = List.of(band1, band2, band3);

        // バンド情報を標準出力する
        for (Band band : bandList) {
            System.out.println("エントリー番号：" + band.getEntryNumber());
            System.out.println("バンド名：" + band.getName());
            System.out.println("メンバー数：" + band.getNumOfMember());
        }

        System.out.println("----------");

        // バンドの総出演者数を表示する
        int totalNumOfMember = 0;
        for (Band band : bandList) {
            totalNumOfMember += band.getNumOfMember();
        }

        System.out.println("総出演者数：" + totalNumOfMember);

    }
}

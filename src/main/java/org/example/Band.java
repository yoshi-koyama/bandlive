package org.example;

public class Band {

    private final int entryNumber;

    // バンド名
    private final String name;

    // バンドメンバーの人数
    private final int numOfMember;

    // コンストラクタ
    public Band(int entryNumber, String name, int numOfMember) {
        this.entryNumber = entryNumber;
        this.name = name;
        this.numOfMember = numOfMember;
    }

    // ゲッター
    public int getEntryNumber() {
        return entryNumber;
    }

    public String getName(){
        return name;
    }

    public int getNumOfMember() {
        return numOfMember;
    }
}

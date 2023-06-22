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

    public static Band newInstance(int entryNumber, String name, int numOfMember) {
        // entryNumberは1以上
        if (entryNumber < 1) {
            throw new IllegalArgumentException("entryNumberは1以上を入力してください");
        }
        // nameはnullでない
        if (name == null) {
            throw new IllegalArgumentException("nameはnullでない値を入力してください");
        }
        // numOfMemberは1以上
        if (numOfMember < 1) {
            throw new IllegalArgumentException("numOfMemberは1以上を入力してください");
        }
        return new Band(entryNumber, name, numOfMember);
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

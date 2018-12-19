package com.blogspot.labalabamen.iqbal.mypreloaddata.db;

import android.provider.BaseColumns;

public class DatabaseContract {
    static String TABLE_NAME = "table_mahasiswa";

    static final class MahasiswaColumns implements BaseColumns {

        // Mahasiswa nama
        static String NAMA = "nama";
        // Mahasiswa nim
        static String NIM = "nim";

    }
}

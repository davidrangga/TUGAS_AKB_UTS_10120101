package com.example.a10120101_tugas_akb_uts;


import android.database.Cursor;

import com.example.a10120101_tugas_akb_uts.model.note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(note note);
    public boolean update(note note);
    public boolean delete(String id);

}

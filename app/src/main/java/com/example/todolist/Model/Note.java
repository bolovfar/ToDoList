package com.example.todolist.Model;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

@Entity
public class Note implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "text")
    public String text;
    @ColumnInfo(name = "time")
    public long time;
    @ColumnInfo(name = "done")
    public boolean done;


    public  Note(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return uid == note.uid && time == note.time && done == note.done && Objects.equals(text, note.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, text, time, done);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}

package com.example.StajSozluk.EnumFile;

public enum EntryType
{
        audio(0),
        text(1),
        video(2);

        int value;
        EntryType(int value)
        {
                this.value=value;
        }
}
